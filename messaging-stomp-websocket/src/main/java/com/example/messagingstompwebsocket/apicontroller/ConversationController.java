package com.example.messagingstompwebsocket.apicontroller;

import com.example.messagingstompwebsocket.AppendableObjectOutputStream;
import com.example.messagingstompwebsocket.Conversation;
import com.example.messagingstompwebsocket.User;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/conversation/")
public class ConversationController {

    @CrossOrigin
    @PostMapping
    public Conversation addConversation(@RequestBody Conversation conv) {


        String mail1 = conv.getId().split(":")[0];
        String mail2 = conv.getId().split(":")[1];

        System.out.println(mail1 + mail2);
        File file = new File("conversation.dat");
        boolean append = file.exists(); // if file exists then append, otherwise create new

        if(append){
            try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))){
                int f = 0;
                while(true){
                    Conversation ll = (Conversation)input.readObject();

                    if(ll != null){
                        if(conv.getId().equals(ll.getId())){
                            f = 1;
                            input.close();
                            return conv;

                        }
                    }else{
                        input.close();
                        break;
                    }
                }
                if( f == 1){


                }else{

                }
            }catch(Exception e ){
                System.out.println(e);
            }
        }


        try (
                FileOutputStream fout = new FileOutputStream(file, append);
                AppendableObjectOutputStream oout = new AppendableObjectOutputStream(fout, append);
        ){
            oout.writeObject(conv); // replace "..." with serializable object to be written
        } catch (FileNotFoundException e) {


            System.out.println(e);
        }catch (IOException e) {

            System.out.println(e);
        }

        return conv;
    }



    @CrossOrigin
    @GetMapping
    public ArrayList<Conversation> getConversation(){
        File file = new File("conversation.dat");
        boolean append = file.exists(); // if file exists then append, otherwise create new

        ArrayList<Conversation> clist = new ArrayList<>();


        if(append){
            try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))){

                int f = 0;
                while(true){
                    Conversation ll = (Conversation)input.readObject();

                    if(ll != null){
                        clist.add(ll);

                    }else{
                        input.close();
                        break;
                    }
                }

                input.close();
            }catch(Exception e ){
                System.out.println(e);
            }
        }


        return clist;
    }


}

//}
