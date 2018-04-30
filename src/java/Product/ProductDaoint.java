/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Sony
 */
    
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import java.util.List;
import org.json.simple.JSONArray;

public interface ProductDaoint {

     
    Product addProduct(Product p);
    void deleteProduct(String p_id);
    JSONArray findAll();
    }
