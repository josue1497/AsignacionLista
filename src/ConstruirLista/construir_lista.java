/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstruirLista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rental Servicios
 */
public class construir_lista {
    
    List <Object> lista;

    public construir_lista() {
        
    }
    
    

    public construir_lista(List<Object> lista) {
        this.lista=new ArrayList<Object>();
        this.lista = lista;
    }
    
    public void llenar_lista(Object a){
        lista.add(a);        
    }
    
    public void eliminar_de_lista(int a){
        lista.remove(a);
    }
    
    public void ver_lista(){
        int i = 0;
        while(!lista.isEmpty()){
            System.out.println(lista.get(i)); 
            i++;
        }
    }

    public List<Object> getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }
    
    
    
    
    
    
    
}
