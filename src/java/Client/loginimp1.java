/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

/**
 *
 * @author Sony
 */
public class loginimp1 implements loginin {
Client c=new Client();
   

    MongoClient mc=new MongoClient("localhost",27017);
    DBCollection table= mc.getDB("ABHI").getCollection("Sikander");
    
@Override
    public void set(String email, String password) {
     c.setEmail(email);
     c.setPassword(password);
     }

    @Override
    public String[] get() {
      String[] up=new String[2];
       up[0]=c.getEmail();
       up[1]=c.getPassword();
        return up;
    }
    
     public String loginfinddata(String[] a){
       String status="";
      String up[]=a;
      //login.get();
      //String up[]=new String[2];
      //up[0]=a;up[1]=b;
        DBCursor cursor=table.find();
        while(cursor.hasNext()){
           DBObject object=cursor.next();
           if(up[0].equals(object.get("email")) && up[1].equals(object.get("password"))){
              status="ok";
             System.out.println("ho rha hai "+object.get("username"));
              
           }
           
            
       }
        return status;
    }
   
    
}
