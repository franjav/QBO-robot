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
public class Robot {
  int ambiente[][];
  Point posicionActual;
  private boolean avanzar=false;
  String encontro="";
  
    public Robot(int ambiente[][], Point posicionActual) {
        this.ambiente=ambiente;
        this.posicionActual=posicionActual;
    }    
        
    public boolean atrazSensor(){
      if(posicionActual.y==0){
          avanzar=false;  
          encontro="nopuedo";
        }else{
                if(ambiente[posicionActual.x][posicionActual.y-1]!=1){
                   if(ambiente[posicionActual.x][posicionActual.y-1]==2){
                    encontro="2k";  
                     avanzar=true;
                   }if(ambiente[posicionActual.x][posicionActual.y-1]==3){
                    encontro="3k";
                     avanzar=true;
                   }if(ambiente[posicionActual.x][posicionActual.y-1]==4){
                    encontro="inicio";
                     avanzar=true;
                   }if(ambiente[posicionActual.x][posicionActual.y-1]==5){
                    encontro="deposito";
                     avanzar=true;
                   }                    
                  }else{
                         avanzar=false;  
                         encontro="muro";
                       }        
             }
       return avanzar;
    }
    
    public boolean arribaSensor(){        
        if(posicionActual.x==0){
            encontro="nopuedo";
            avanzar=false;        
        }else{
            if(ambiente[posicionActual.x-1][posicionActual.y]!=1){
               if(ambiente[posicionActual.x-1][posicionActual.y]==2){
                  encontro="2k";  
                  avanzar=true;
               }if(ambiente[posicionActual.x-1][posicionActual.y]==3){
                  encontro="3k";
                  avanzar=true;
               }if(ambiente[posicionActual.x-1][posicionActual.y]==4){
                  encontro="inicio";
                  avanzar=true;
               }if(ambiente[posicionActual.x-1][posicionActual.y]==5){
                  encontro="deposito";
                  avanzar=true;
               }
            }else{
               avanzar=false;
               encontro="muro";
            }        
        }        
        return avanzar;    
    }
    
   public boolean abajoSensor(){
       if(posicionActual.x==ambiente.length){
             avanzar=false;          
             encontro="nopuedo";
       }else{
           if(ambiente[posicionActual.x+1][posicionActual.y]!=1){
             if(ambiente[posicionActual.x+1][posicionActual.y]==2){
              encontro="2k";
              avanzar=true;
             }if(ambiente[posicionActual.x+1][posicionActual.y]==3){
              encontro="3k";
              avanzar=true;
             }if(ambiente[posicionActual.x+1][posicionActual.y]==4){
              encontro="inicio"; 
              avanzar=true;
             }if(ambiente[posicionActual.x+1][posicionActual.y]==5){
              encontro="deposito";
              avanzar=true;
             }
           
           }else{
               avanzar=false;
               encontro="muro";
           }       
          }
   return avanzar;   
   }
    
   public boolean adelanteSensor(){
       
       if(posicionActual.x==ambiente.length){
          avanzar=false;
          encontro="nopuedo";
       }else{
           if(ambiente[posicionActual.x][posicionActual.y+1]!=1){
             if(ambiente[posicionActual.x][posicionActual.y+1]==2){
               encontro="2k";
               avanzar=true;
             }if(ambiente[posicionActual.x][posicionActual.y+1]==3){
               encontro="3k";
               avanzar=true;
             }if(ambiente[posicionActual.x][posicionActual.y+1]==4){
               encontro="inicio";
               avanzar=true;
             }if(ambiente[posicionActual.x][posicionActual.y+1]==5){
               encontro="deposito";
               avanzar=true;
             }
           }else{
               avanzar=false;
               encontro="muro";
           }       
       }
     return avanzar;
   }
    
      public Point getPosicionActual() {
        return posicionActual;
    }

    public String getEncontro() {
        return encontro;
    }
}
