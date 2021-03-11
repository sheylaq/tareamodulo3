/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Policia {
    private String  identidad;
    private String name;
    
    public Policia(){
      
}
    public Policia(String  identidad, String name){
        this.setidentidad(identidad);
        this.setname(name);
    }
    public String  getidentidad(){
        return identidad;
    }
    public  String getname(){
        return name;
    }
    
    public void setidentidad(String  _identidad){
        this.identidad=_identidad;
    }
    
     public void setname(String _name){
        this.name=_name;
    }
}