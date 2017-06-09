/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.univaq.disim.mobile.jobservice.model;
import java.util.ArrayList;

public class ArchivioChat extends Chat {
    private final ArrayList<Chat> chat= new ArrayList<Chat>();
   
    public void addChat(Chat c){
            chat.add(c);
   }
    public void removeChat(Chat c){
            chat.remove(c);
} 
    public void ToString(){
       chat.toString();
        }
    }

