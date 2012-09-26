/**
 * Universidad del Valle
 * Desarrollo de Software II
 * Tarea - Patron de diseño DAO
 * Abril 11 de 2012
 */

package gui.controlador;


import gui.AcercaDe;
import gui.GuiPrincipal;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Franjav
 */
public class ControladorGuiPrincipal {
    
    private GuiPrincipal guiPrincipal;
    
    public ControladorGuiPrincipal() {
    }
    
    public void setGui(  GuiPrincipal guiPrincipal ) {
        this.guiPrincipal = guiPrincipal;
    }

    /**
     * Agrega los TabComponent a la gui principal
     * @param tituloTab El titulo del tabComponent
     * @param componente El tabComponent que sera agregado
     */
    private void agregarTabbedAGuiPrincipal(String tituloTab, Component guiComponente) {
        int indiceTab = guiPrincipal.getNumerotabs();
        guiPrincipal.configurarJTabbedPane(tituloTab, guiComponente);
        // Se verifica el indice para agregar un nuevo tab
        if( indiceTab != 0) {
            indiceTab = guiPrincipal.getNumerotabs()-1;
        }
        guiPrincipal.initTabComponent(indiceTab);        
    } // fin agregarTabbedAGuiPrincipal

    /**
     * Crea un JInternalFrame para ingresar los datos de un programa
     */
    public void crearGuiDustCart() {
        ControladorGuiDustCart controlador = new ControladorGuiDustCart();
        agregarTabbedAGuiPrincipal(controlador.getTitle(), controlador.getGui());
    } // fin crearGuiDustCart

    /**
     * Crea un JInternalFrame para ingresar los datos de un estudiante
     */
    public void crearGuiEstudiante() {
        //ControladorGuiEstudiante controladorEstudiante = new ControladorGuiEstudiante();
        //agregarTabbedAGuiPrincipal(controladorEstudiante.getTitle(), controladorEstudiante.getGui() );
    } // fin crearGuiEstudiante
    
    /**
     * Crea un JFrame con los datos de los desarrolladores de la aplicacion
     */
    public void acercaDe() {
        AcercaDe acercaDe = new AcercaDe();
        acercaDe.setVisible(true);
        acercaDe.setLocationRelativeTo(null);
    }// fin acercaDe

    public void crearGuiLibro() {
        //ControladorGuiLibro controladorLibro = new ControladorGuiLibro();
        //agregarTabbedAGuiPrincipal(controladorLibro.getTitle(), controladorLibro.getGui());
    }

    public void crearGuiAutor() {
        //ControladorGuiAutor controladorAutor = new ControladorGuiAutor();
        //agregarTabbedAGuiPrincipal(controladorAutor.getTitle(), controladorAutor.getGui());
    }

    public void crearGuiPrestamo() {
        //ControladorGuiPrestamo controladorPrestamo = new ControladorGuiPrestamo();
        //agregarTabbedAGuiPrincipal(controladorPrestamo.getTitle(), controladorPrestamo.getGui());
    }

    public void consultarTodosLosLibros() {
        //ConsultaLibrosGui consulta = new ConsultaLibrosGui(); 
    }

    public void consultarPrestamosPorFecha() {
        //ConsultaPrestamosPorUsuario consulta = new ConsultaPrestamosPorUsuario();
    }

    public void salir() {
        //JOptionPane.showConfirmDialog(this,"Realmente desea salir de la aplicacion");
        System.exit(0);
    }

    

  
    
} // fin de la clase ControladorGuiPrincipal
