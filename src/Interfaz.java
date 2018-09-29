
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Interfaz extends javax.swing.JFrame {
    Palabra p = new Palabra();
    int error = 0;

    /**
     * Creates new form Interfaz
     * @throws java.io.IOException
     */
    public Interfaz() throws IOException {
        initComponents();
        agregarBotones();
        //1. Abrir el archivo
        File miArchivo = new File("in.jpg");
        //2. Extraer imagen a la memoria
        BufferedImage miImagen = ImageIO.read(miArchivo);
        //3. Asignar la image a la etiqueta
        ImageIcon miIcono = new ImageIcon(miImagen);
        img.setIcon(miIcono);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        principal = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        palabras = new javax.swing.JLabel();
        palabra = new javax.swing.JTextPane();
        letras = new javax.swing.JLabel();
        letra = new javax.swing.JTextPane();
        validar = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        elegir = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 60));
        setMinimumSize(new java.awt.Dimension(298, 35));
        setPreferredSize(new java.awt.Dimension(348, 500));
        getContentPane().setLayout(new java.awt.GridLayout());

        principal.setMinimumSize(new java.awt.Dimension(298, 35));
        principal.setPreferredSize(new java.awt.Dimension(548, 481));
        principal.setLayout(new java.awt.BorderLayout());

        panelBotones.setMinimumSize(new java.awt.Dimension(298, 35));
        panelBotones.setPreferredSize(new java.awt.Dimension(400, 400));

        palabras.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        palabras.setText("palabra");
        panelBotones.add(palabras);

        palabra.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        palabra.setMinimumSize(new java.awt.Dimension(6, 251));
        palabra.setPreferredSize(new java.awt.Dimension(120, 50));
        panelBotones.add(palabra);

        letras.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        letras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        letras.setText("letra");
        panelBotones.add(letras);
        letras.getAccessibleContext().setAccessibleDescription("");

        letra.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        letra.setMinimumSize(new java.awt.Dimension(50, 20));
        letra.setPreferredSize(new java.awt.Dimension(50, 50));
        panelBotones.add(letra);

        validar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        validar.setText("validar letra");
        validar.setMaximumSize(new java.awt.Dimension(89, 23));
        validar.setMinimumSize(new java.awt.Dimension(89, 23));
        validar.setPreferredSize(new java.awt.Dimension(89, 23));
        validar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validarMouseClicked(evt);
            }
        });
        panelBotones.add(validar);

        principal.add(panelBotones, java.awt.BorderLayout.CENTER);

        img.setPreferredSize(new java.awt.Dimension(148, 481));
        principal.add(img, java.awt.BorderLayout.EAST);

        getContentPane().add(principal);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(65, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(25, 25));

        elegir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        elegir.setText("elegir palabra");
        elegir.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        elegir.setPreferredSize(new java.awt.Dimension(120, 19));
        elegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elegirMouseClicked(evt);
            }
        });
        jMenuBar1.add(elegir);

        salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salir.setText("salir");
        salir.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        salir.setPreferredSize(new java.awt.Dimension(45, 19));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elegirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elegirMouseClicked
        // TODO add your handling code here:
        p.seleccionarPalabra();
        JOptionPane.showMessageDialog(this, "La palabra ha sido escogida");
        String aux = "";
        int contador = 0;
        while (contador < p.getElegida().length()) {
            aux += "*";
            contador++;
        }
        palabra.setText(aux);
        
    }//GEN-LAST:event_elegirMouseClicked

    private void validarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validarMouseClicked
        // TODO add your handling code here:
        String l = "";
        l = letra.getText();
        char c = l.charAt(0);
        
        if (p.determinar(c) == 5) {
            error++;
            try {
                this.dibujos();
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if (this.ganar()==5){
                palabra.setText(p.comparar(c));
                JOptionPane.showMessageDialog(this, "GANASTE!!!");
            }else{
                palabra.setText(p.comparar(c));
            }
        }
        
    }//GEN-LAST:event_validarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interfaz().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu elegir;
    private javax.swing.JLabel img;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane letra;
    private javax.swing.JLabel letras;
    private javax.swing.JTextPane palabra;
    private javax.swing.JLabel palabras;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel principal;
    private javax.swing.JMenu salir;
    private javax.swing.JButton validar;
    // End of variables declaration//GEN-END:variables

    private void agregarBotones() {
        for (int i = 0; i < 26; i++) {
            String laLetra = "" + (char) (65 + i);
            JButton boton = new JButton(laLetra);
            panelBotones.add(boton);

            boton.addActionListener((ActionEvent ae) -> {
                JButton oprimir = (JButton) ae.getSource();
                oprimir.setEnabled(false);
                letra.setText(oprimir.getText());
            });
        }
    }

    private void dibujos() throws IOException {
        switch (error){
            case 0:
                //1. Abrir el archivo
                File miArchivo = new File("in.jpg");
                //2. Extraer imagen a la memoria
                BufferedImage miImagen = ImageIO.read(miArchivo);
                //3. Asignar la image a la etiqueta
                ImageIcon miIcono = new ImageIcon(miImagen);
                img.setIcon(miIcono);
                break;
                
            case 1:
                //1. Abrir el archivo
                File miArchivo1 = new File("i1.jpg");
                //2. Extraer imagen a la memoria
                BufferedImage miImagen1 = ImageIO.read(miArchivo1);
                //3. Asignar la image a la etiqueta
                ImageIcon miIcono1 = new ImageIcon(miImagen1);
                img.setIcon(miIcono1);
                JOptionPane.showMessageDialog(this, "animo!! Te quedan 4 oportunidades");
                break;
            case 2:
                //1. Abrir el archivo
                File miArchivo2 = new File("i2.jpg");
                //2. Extraer imagen a la memoria
                BufferedImage miImagen2 = ImageIO.read(miArchivo2);
                //3. Asignar la image a la etiqueta
                ImageIcon miIcono2 = new ImageIcon(miImagen2);
                img.setIcon(miIcono2);
                JOptionPane.showMessageDialog(this, "OMG!!! erraste!");
                break;
            case 3:
                //1. Abrir el archivo
                File miArchivo3 = new File("i3.jpg");
                //2. Extraer imagen a la memoria
                BufferedImage miImagen3 = ImageIO.read(miArchivo3);
                //3. Asignar la image a la etiqueta
                ImageIcon miIcono3 = new ImageIcon(miImagen3);
                img.setIcon(miIcono3);
                JOptionPane.showMessageDialog(this, "Jajaja!! que lindo esta quedando el muñequito");
                break;
            case 4:
                //1. Abrir el archivo
                File miArchivo4 = new File("i4.jpg");
                //2. Extraer imagen a la memoria
                BufferedImage miImagen4 = ImageIO.read(miArchivo4);
                //3. Asignar la image a la etiqueta
                ImageIcon miIcono4 = new ImageIcon(miImagen4);
                img.setIcon(miIcono4);
                JOptionPane.showMessageDialog(this, "Buuu!!! vas a perder, te queda 1 oportunidad");
                break;
            case 5:
                //1. Abrir el archivo
                File miArchivo5 = new File("i5.jpg");
                //2. Extraer imagen a la memoria
                BufferedImage miImagen5 = ImageIO.read(miArchivo5);
                //3. Asignar la image a la etiqueta
                ImageIcon miIcono5 = new ImageIcon(miImagen5);
                img.setIcon(miIcono5);
                JOptionPane.showMessageDialog(this, "Loser!!!");
                JOptionPane.showMessageDialog(this, "la palabra era:'"+p.getElegida()+"'.");
                break;
            default:
                JOptionPane.showMessageDialog(this, "Has perdido"); 
        }
        
    }
    
    int ganar(){
        int cont=0;
        int ganando=0;
        String f = "";
        f = letra.getText();
        char e = f.charAt(0);
        while(cont<p.elegida.length()){
            if(p.getElegida().charAt(cont)==p.comparar(e).charAt(cont)){
                ganando++;
                cont++;
            }else{
                cont++;
            }
        }
        return ganando;
        
    }
}