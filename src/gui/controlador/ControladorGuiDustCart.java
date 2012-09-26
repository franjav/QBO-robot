/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.controlador;

import gui.GuiDustCart;

/**
 *
 * @author Franjav
 */
public class ControladorGuiDustCart {
    
    private String title;
    private GuiDustCart guiDustCart;
    
    public ControladorGuiDustCart(){
        guiDustCart = new GuiDustCart();
        title = "DustCart";
    }
    
    
    /**
      * Retorna el titulo o nombre de la gui
      * @return el titulo de la gui
      */
     public String getTitle() {
        return this.title;
     }
     
     /**
      * Retorna la gui creada de un programa
      * @return La gui del programa
      */
     public GuiDustCart getGui() {
        return this.guiDustCart;
     }
    
     

    
}
