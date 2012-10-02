/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Vector;
import modelo.Nodo;

/**
 *
 * @author fidelhpc
 */
public class Cola {
    
    Vector vector=new Vector();
    
    /*Estos los utilizaremos cuando sea un vector normal*/
    public Nodo remover(){
      vector.remove(0);
      Nodo tmp=(Nodo)vector.get(0);
		vector.remove(0);
		return tmp;
    }
    
    
    public void agregar(Nodo nodo){
       vector.add(nodo);
    }
    /*Estos los utilizaremos cuando utilicemos una cola */
    
    public void encolar(Nodo nod){
	vector.add(nod);
	}
	
    public Nodo desEncolar(){
      Nodo tmp=(Nodo)vector.get(0);
      vector.remove(0);
      return tmp;
    }
    
    
    
}
