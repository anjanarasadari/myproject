/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

/**
 *
 * @author Anjana
 */
public class customer {
    private String cno;
    private String cname;
    private String city;
    
    public customer(String cno, String cname, String city){
      this.cno=cno;
      this.cname=cname;
      this.city=city;
    }
    
 public String getCno(){
     return cno;
 
 }   
 public String getName(){
      return cname;
 }   
 public String getCity(){
      return city;
 }      
    
    
    
    
    
    
    
}
