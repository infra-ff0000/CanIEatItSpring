/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.aeteris.JSONPOJOs;

import com.sun.prism.impl.Disposer.Record;
import java.util.List;

/**
 *
 * @author ariazavocki
 */

@javax.ws.rs.Path("/user")
public class UserDbMetaPojo {
    
    private int Id;
    private String User;
    private List<Record> records;
    
    public List <Record> getRecords(){
         
        return records;
        
    }
    
    public void setRecords(List<Record> records){
    
    this.records = records;
    }
    
    public String getUser(){
         
        return User;
        
    }
    
    public int getId(){
    
    return Id;
    
    }
    
    public void setId(int Id){
         
        this.Id = Id;
        
    }
    
 
}
