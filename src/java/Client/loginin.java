/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author Sony
 */
public interface loginin {
    void set(String username,String password);
    String[] get();
    String loginfinddata(String[] ab);
}
