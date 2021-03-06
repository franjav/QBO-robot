/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


/**
 *
 * @author fidelhpc
 * 
 * estos es un comentario 
 * 
 * 
 */
public class GuiDustCart extends javax.swing.JInternalFrame {
     private String nombreArchivo= "";
     private int[][] mundo =new int[10][10];
     private Celda[][] celdas =new Celda[10][10];
     private ImageIcon[] imagenes =new ImageIcon[8];
     private boolean mundoCargado=false;
     private String   textoEnArchivo = null;
     private int      numeroColumnas        = 0;
     private int      numeroFilas           = 0;
     private GridLayout grilla =new GridLayout(10, 10);
       private JLabel[][] jLabelTablero;
       int widthLabel;
    int heightLabel;
    int xInicial;
    int anchoTablero;
    int yInicial;
     /**
     * Creates new form Gui
     */ 
    public GuiDustCart() {
         widthLabel = 50;
        heightLabel = 50;
        initComponents();
       graficar();
    }
    
    
   /*
    Otro comentario
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelControles = new javax.swing.JPanel();
        jButtonCargar = new javax.swing.JButton();
        jPanelBusquedas = new javax.swing.JPanel();
        jComboBoxTipoBusqueda = new javax.swing.JComboBox();
        jComboBoxNoinformada = new javax.swing.JComboBox();
        jComboBoxInformadad = new javax.swing.JComboBox();
        jPanelBotones = new javax.swing.JPanel();
        jButtonEjecutar = new javax.swing.JButton();
        jButtonResetear = new javax.swing.JButton();
        jPanelResultados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelProfundidad = new javax.swing.JLabel();
        jLabelNodosExpandidos = new javax.swing.JLabel();
        jLabelTiempoComputo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanelAmbiente = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelControles.setBorder(javax.swing.BorderFactory.createTitledBorder("Controles"));

        jButtonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/load.png"))); // NOI18N
        jButtonCargar.setText("Cargar Ambiente");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jPanelBusquedas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Busquedas"))));

        jComboBoxTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de búsqueda", "Informada", "No informada" }));

        jComboBoxNoinformada.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Amplitud", "Costo Uniforme", "Profundidad" }));

        jComboBoxInformadad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Avara", "A*" }));

        javax.swing.GroupLayout jPanelBusquedasLayout = new javax.swing.GroupLayout(jPanelBusquedas);
        jPanelBusquedas.setLayout(jPanelBusquedasLayout);
        jPanelBusquedasLayout.setHorizontalGroup(
            jPanelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTipoBusqueda, 0, 146, Short.MAX_VALUE)
                    .addComponent(jComboBoxNoinformada, 0, 146, Short.MAX_VALUE)
                    .addComponent(jComboBoxInformadad, 0, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBusquedasLayout.setVerticalGroup(
            jPanelBusquedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedasLayout.createSequentialGroup()
                .addComponent(jComboBoxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxNoinformada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxInformadad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBotones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/ejecutar.png"))); // NOI18N
        jButtonEjecutar.setText("Ejecutar");
        jButtonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjecutarActionPerformed(evt);
            }
        });

        jButtonResetear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/restart.png"))); // NOI18N
        jButtonResetear.setText("Reiniciar");

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonResetear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jButtonEjecutar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEjecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonResetear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelResultados.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        jLabel1.setText("Profundidad árbol:");

        jLabel2.setText("Tiempo de cómputo:");

        jLabel3.setText("Nodos expandidos:");

        jLabelProfundidad.setFont(new java.awt.Font("Ubuntu", 1, 18));
        jLabelProfundidad.setForeground(new java.awt.Color(17, 67, 210));
        jLabelProfundidad.setText("0");

        jLabelNodosExpandidos.setFont(new java.awt.Font("Ubuntu", 1, 18));
        jLabelNodosExpandidos.setForeground(new java.awt.Color(17, 67, 210));
        jLabelNodosExpandidos.setText("0");

        jLabelTiempoComputo.setFont(new java.awt.Font("Ubuntu", 1, 18));
        jLabelTiempoComputo.setForeground(new java.awt.Color(17, 67, 210));
        jLabelTiempoComputo.setText("0");

        javax.swing.GroupLayout jPanelResultadosLayout = new javax.swing.GroupLayout(jPanelResultados);
        jPanelResultados.setLayout(jPanelResultadosLayout);
        jPanelResultadosLayout.setHorizontalGroup(
            jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelProfundidad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabelNodosExpandidos))
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jLabelTiempoComputo)))
                .addContainerGap())
        );
        jPanelResultadosLayout.setVerticalGroup(
            jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadosLayout.createSequentialGroup()
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabelProfundidad)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelNodosExpandidos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanelResultadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTiempoComputo))))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/android.png"))); // NOI18N
        jButton1.setText("Ver Solución");

        javax.swing.GroupLayout jPanelControlesLayout = new javax.swing.GroupLayout(jPanelControles);
        jPanelControles.setLayout(jPanelControlesLayout);
        jPanelControlesLayout.setHorizontalGroup(
            jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanelBusquedas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelResultados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelControlesLayout.setVerticalGroup(
            jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCargar)
                .addGap(11, 11, 11)
                .addComponent(jPanelBusquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelAmbiente.setBorder(javax.swing.BorderFactory.createTitledBorder("Ambiente"));

        javax.swing.GroupLayout jPanelAmbienteLayout = new javax.swing.GroupLayout(jPanelAmbiente);
        jPanelAmbiente.setLayout(jPanelAmbienteLayout);
        jPanelAmbienteLayout.setHorizontalGroup(
            jPanelAmbienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        jPanelAmbienteLayout.setVerticalGroup(
            jPanelAmbienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanelAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelControles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed

         JFileChooser selectorArchivo = new JFileChooser("./tests/");
  
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int resultado = selectorArchivo.showOpenDialog(this);

        if (resultado != JFileChooser.CANCEL_OPTION) {
        
            File selectedFile = selectorArchivo.getSelectedFile();
              cargarArchivo(selectedFile);
           
              }
        
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjecutarActionPerformed

        
        JOptionPane.showMessageDialog(null, evt);
    }//GEN-LAST:event_jButtonEjecutarActionPerformed
 
    
    public void graficar(){
          jLabelTablero = new JLabel[10][10];

     Border border = LineBorder.createGrayLineBorder();
  for(int i=0; i<10; i++)
    	{
    		for(int j=0; j<10; j++)
    		{
                jLabelTablero[i][j] = new JLabel();
                jLabelTablero[i][j].setOpaque(true);
                jLabelTablero[i][j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabelTablero[i][j].setBorder(border);
                jLabelTablero[i][j].setName(i + "," + j);
                 jLabelTablero[i][j].setText("3");
//                jLabelTablero[i][j].addMouseListener(new java.awt.event.MouseAdapter() {
//
//                    public void mouseClicked(java.awt.event.MouseEvent evt) {
//                        jLabelTableroMouseClicked(evt);
//                    }
//                });
                jPanelAmbiente.add(jLabelTablero[i][j]);   
                repaint();
         	jLabelTablero[i][j].setBounds(xInicial + ((widthLabel + 1) * j), yInicial + ((heightLabel + 1) * i),
                        widthLabel, heightLabel); 	
    		}
    	}
    }
    public boolean cargarArchivo(File archivo){
     BufferedReader datos = null;
        String         lectura;
  
        try {
            datos = new BufferedReader(new FileReader(archivo));

            StringBuffer bufer = new StringBuffer();

            while ((lectura = datos.readLine()) != null) {
                
//                System.out.print("llego parae");
                bufer.append(lectura + "\n");
                
            }
            

            textoEnArchivo = bufer.toString();

            return procesarFileContents();
        } catch (IOException ex) {
            System.out.println(ex.toString());

            return false;
        }
    
    
    
    }
    public boolean procesarFileContents(){
     StringTokenizer tokens = new StringTokenizer(textoEnArchivo);
    
//     numeroFilas    = Integer.parseInt(tokens.nextToken());
//     numeroColumnas = Integer.parseInt(tokens.nextToken());
    int cuantos = tokens.countTokens();
        for(int i=0;i<10;i++){
          for(int j=0;j<10;j++){
                 int valor = Integer.parseInt(tokens.nextToken());
           
               mundo[i][j] =valor;
               
      
           
          }
        }
        
     System.out.println("ya se leyo el archivoy noesta malo");
     
     
    return false;
    }
    
   
 public void cargarImagenes()
    {
    	imagenes[0]=null;
    	imagenes[1]=new ImageIcon("../images/muro.png");
    	imagenes[2]=new ImageIcon("../images/robot.jpg");
    	imagenes[3]=new ImageIcon("../images/salida.jpg");
    	imagenes[4]=new ImageIcon("../images/nave1.png");
    	imagenes[5]=new ImageIcon("../images/nave2.jpg");
    	imagenes[6]=new ImageIcon("../images/item.jpg");
    	imagenes[7]=new ImageIcon("../images/CEM.jpg");
    }
    
    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonEjecutar;
    private javax.swing.JButton jButtonResetear;
    private javax.swing.JComboBox jComboBoxInformadad;
    private javax.swing.JComboBox jComboBoxNoinformada;
    private javax.swing.JComboBox jComboBoxTipoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNodosExpandidos;
    private javax.swing.JLabel jLabelProfundidad;
    private javax.swing.JLabel jLabelTiempoComputo;
    private javax.swing.JPanel jPanelAmbiente;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBusquedas;
    private javax.swing.JPanel jPanelControles;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
