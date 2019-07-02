/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hsserver;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author milcow
 */
public class HSServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(ServerSocket serversocket = new ServerSocket(5000))
        {
            
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
            
        }
    }
    
}
