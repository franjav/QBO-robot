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
     String ruta="";
     private int heuristica; 
     
     /*en caso de que la heuristica la hagamos
      * con entero, que creo es lo mas viable...
     */
     
     
     public Nodo(int mundoAmb[][], Point posicionActual, int peso){
      this.mundo=mundoAmb;
      this.posicionActual=posicionActual;
      this.peso=peso;
    }
    /*constructor 2*/ 
    public Nodo() {
    
    }
    public int getHeuristica() {
        return heuristica;
    }
    public Point getPosicionActual() {
        return posicionActual;
    }

    public int getPesoBasura() {
        return pesoBasura;
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
