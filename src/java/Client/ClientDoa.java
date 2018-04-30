/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import com.mongodb.DBObject;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Sony
 */
interface ClientDoa {
    Client addClient(Client c);
    void deleteClient(String email);
    void updateClient(Client c);
    void getClient(int ClientId);
    List<Client> getAllClient();    
}
