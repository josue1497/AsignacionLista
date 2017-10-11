/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_array;

import ConstruirLista.construir_lista;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Rental Servicios
 */
public class Lista_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        construir_lista a=new construir_lista();
        
        Scanner teclado=new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un objeto, una letra cualquiera, cualquier dato, eres LIBRE!");
           
            a.llenar_lista(teclado.next());
            
        }
       try{ 
      a.ver_lista();
       }catch(Exception e){}
    }
    
}
