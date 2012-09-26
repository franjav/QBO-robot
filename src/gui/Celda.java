/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Representa una celda de la rejilla que conforma el mundo del DustCart * 
 * @author Franjav
 */
public class Celda extends JPanel{
    
    /** Imagen que se va a cargar en las celdas que representan el ambiente. */
    private Image imagen;
    /** Representa un estado de cada celda, el cual puede estar entre 0 y 5 */
    private int numero;
    
    public Celda(){
    }
    
    public  Celda(ImageIcon imagen){
        if(imagen != null){
            this.imagen = imagen.getImage();    //Se asigna un icono para mostrar en la celda
        }
    }
    
    public Celda (Image imagenInicial){
        if(imagenInicial != null){
            this.imagen = imagenInicial;
        }
    }
    
    public void setImagen(ImageIcon imagen){
        if(imagen != null){
            this.imagen = imagen.getImage();
        }
        else{
            this.imagen = null;
        }
        repaint();
    }
    
    @Override
    public void paint(Graphics g)
    {
        if (imagen != null)
        {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        }
        else
        {
            setOpaque(true);
        }

        super.paint(g);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }      
       
}




    
