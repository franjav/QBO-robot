/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradeDatos;

import java.util.Vector;
import modelo.Nodo;

/**
 *
 * @author fidelhpc
 */
public class Cola {
    
    Vector vector=new Vector();
    
    
    public void remover(Nodo nodo){
      vector.remove(nodo);         
    }
    
    
    public void agregar(Nodo nodo){
       vector.add(nodo);
    }
    
    
    
    
}
