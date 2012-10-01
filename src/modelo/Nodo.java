/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Point;

/**
 *
 * @author palacioscuacialpud
 */
public class Nodo {
     int mundo[][];
     Point posicionActual;
     int peso;
     Robot robot; 
     int pesoBasura=0;
     
     public Nodo(int mundoAmb[][], Point posicionActual, int peso){
      this.mundo=mundoAmb;
      this.posicionActual=posicionActual;
      this.peso=peso;
    }
     

    public int getPesoBasura() {
        return pesoBasura;
    }

    public Nodo() {
    }

    public int[][] getMundo() {
        return mundo;
    }

    public int getPeso() {
        return peso;
    }

    public Robot getRobot() {
        return robot;
    }   
     
    
}
