/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cate;

import java.util.List;
import org.json.simple.JSONArray;

/**
 *
 * @author Sony
 */
public interface CateImp {
    String addCate( Cate c );
    void deleteCate( String CateId );
    void updateCate( Cate c );
    
    Cate getCate( String CateId );
    JSONArray getAllCate();
   
}
