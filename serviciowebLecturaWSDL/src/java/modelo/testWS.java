/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.NoResultException;
import sw.ConversionSW;
import sw.ConversionSW_Service;
import vistas.login;

/**
 *
 * @author DELL_USER
 */
public class testWS {
    
    
     public static void main(String[] args) {
      
       ConversionSW_Service servicio= new ConversionSW_Service();
        ConversionSW cliente = servicio.getConversionSWPort();
         
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
            
           
       
        
        try {
             System.out.println(" Bienvenido");
             String usuario = cliente.validar("admin","123");
       System.out.println(usuario);
       
       
    
       
         } catch (Exception e) {
             
             System.out.println(" no existe el usuario");
             
             
         }
            
            
         
    }
     
     
     public void metodos(){
     
       ConversionSW_Service servicio= new ConversionSW_Service();
        ConversionSW cliente = servicio.getConversionSWPort();
    
        System.out.println("Resultado 1: "+ cliente.hello("Diego"));
        System.out.println("Resultado 2: "+cliente.euroAdolar(100));
         System.out.println("***LOGGIN****");
        /*if(cliente.login("Jose","123")){
            System.out.println("Credenciales correctas");
        }else{
            System.out.println("Credenciales incorrectas");
        }*/
         System.out.println("  --------------------------- ");
         System.out.println("Operaciones matematicas");
       
     
     
     }
    
}
