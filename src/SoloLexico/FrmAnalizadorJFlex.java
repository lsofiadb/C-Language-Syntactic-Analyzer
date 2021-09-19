
package SoloLexico;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FrmAnalizadorJFlex extends javax.swing.JFrame {
    private Menu menu;

    public FrmAnalizadorJFlex() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(212, 230, 241));
        this.disegnBtns();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        btnAnalizar.setBackground(new java.awt.Color(162, 217, 206));
        btnAnalizar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAnalizar.setText("Análisis Léxico");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(162, 217, 206));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 28)); // NOI18N
        jLabel1.setText("Analizador léxico JFlex");

        jButton3.setBackground(new java.awt.Color(162, 217, 206));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Actualizar Archivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(162, 217, 206));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Limpiar Analizador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Regresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(162, 217, 206));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Limpiar Código fuente");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(btnAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 202, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addComponent(jButton5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        // TODO add your handling code here:
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(jTextArea1.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexico lexicos = new Lexico(lector);
            //---------------------------------------
            //Contador de linea
            int cont = 1;
            String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
            while (true) {
                Tokens tokens = lexicos.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    txtResultado.setText(resultado);
                    return;
                }
                                
                switch (tokens) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Int:
                    resultado += "  <Reservada int>\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexicos.lexemas + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case For:
                    resultado += "  <Reservada for>\t" + lexicos.lexemas + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_a:
                    resultado += "  <Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_c:
                    resultado += "  <Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexicos.lexemas + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Case:
                    resultado += "  <Reservada case>\t" + lexicos.lexemas + "\n";
                    break;
                case Palabra_Reservada:
                    resultado += "  <Reservada>\t" + lexicos.lexemas + "\n";
                    break;    
                case P_Coma:
                    resultado += "  <Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Coma:
                    resultado += "  <Coma>\t\t" + lexicos.lexemas + "\n";
                    break;     
                case Printf :
                    resultado += "  <Reservada printf>\t" + lexicos.lexemas + "\n";
                    break;
                case Scanf :
                    resultado += "  <Reservada scanf>\t" + lexicos.lexemas + "\n";
                    break;
                case Cin :
                    resultado += "  <Reservada cin>\t" + lexicos.lexemas + "\n";
                    break;
                case Cout :
                    resultado += "  <Reservada cout>\t" + lexicos.lexemas + "\n";
                    break;  
                
                case Const :
                    resultado += "  <Reservada const>\t" + lexicos.lexemas + "\n";
                    break;
                case Short :
                    resultado += "  <Tipo de dato >\t" + lexicos.lexemas + "\n";
                    break;
                case Unsigned :
                    resultado += "  <Reservada unsigned>\t" + lexicos.lexemas + "\n";
                    break;
                case Struct :
                    resultado += "  <Reservada struct>\t" + lexicos.lexemas + "\n";
                    break;
                case Typedef :
                    resultado += "  <Reservada typedef>\t" + lexicos.lexemas + "\n";
                    break;                    
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexicos.lexemas + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
                
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cont = 1;
        JFileChooser escoger = new JFileChooser();
        escoger.showOpenDialog(null);
        arc = new File(escoger.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(arc.toPath()));
            jTextArea1.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizadorJCup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizadorJCup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(arc!=null){
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter(new FileWriter(arc));
            } catch (IOException ex) {
                Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                bw.write("");
                bw.write(jTextArea1.getText());
                bw.close();
                JOptionPane.showMessageDialog(null, "Lo ha mofificado exitosamente");
            } catch (IOException ex) {
                Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No ha adjuntado ningun archivo (Cargar archivo)");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtResultado.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        this.menu.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.menu.finalizar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizadorJFlex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizadorJFlex().setVisible(true);
            }
        });
    }
    
    public void disegnBtns(){
        imgRegresar = new ImageIcon("src/imagenes/izquierda.png");
        imgAux = new ImageIcon(imgRegresar.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        
        jButton4.setBorder(null);
        //Color rojo 236, 112, 99
        jButton4.setBackground(new Color(82, 190, 128));
        jButton4.setIcon(imgAux);
        
        //----------------------------------------
        imgCancelar = new ImageIcon("src/imagenes/cerrar.png");
        imgAux = new ImageIcon(imgCancelar.getImage().getScaledInstance(30, 30, Image.SCALE_AREA_AVERAGING));
        jButton5.setBackground(null);
        jButton5.setBorder(null);
        jButton5.setIcon(imgAux);
    }
    
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    private File arc;
    private ImageIcon imgCancelar, imgRegresar, imgAux;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
