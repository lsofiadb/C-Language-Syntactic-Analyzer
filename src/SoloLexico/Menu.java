/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoloLexico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Equipo
 */
public class Menu extends JFrame implements ActionListener{
    //Atributos
    private JButton btnCargar, btnDigitar, btnSalir;
    private JLabel titulo, subtitulo, img;
    private ImageIcon imagen;
    //Frames
    private FrmAnalizadorJCup frmAnalizadorJCup = new FrmAnalizadorJCup();
    private FrmAnalizadorJFlex frmAnalizadorJFlex = new FrmAnalizadorJFlex();
    private ImageIcon imgCancelar, imgAux;
    
    public Menu(){
        this.setBounds(0, 0, 300, 400);
        this.setLocationRelativeTo(this);
        this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.black);
        crearVentana();
        this.setVisible(true);
    }

    public void crearVentana(){
        crearComponentes();
    }
    
    public void crearComponentes(){
        
        titulo= new JLabel("Analizador Lexíco");
        titulo.setBounds(47, 10, 200, 30);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Times New Roman",1,25));
        add(titulo);
        
        imagen=new ImageIcon("src/imagenes/logo.jpg");
        img=new JLabel(imagen);
        img.setBounds(42, 60, 199, 115);
        add(img);
        
        subtitulo= new JLabel("Seleccione una opción:");
        subtitulo.setBounds(47, 200, 250, 30);
        subtitulo.setForeground(Color.WHITE);
        subtitulo.setFont(new Font("Times New Roman",1,20));
        add(subtitulo);
        
        btnCargar=new JButton("Analizador Jflex");
        btnCargar.setBounds(34, 230, 220, 30);
        btnCargar.setForeground(Color.BLACK);
        btnCargar.setBackground(Color.PINK);
        btnCargar.setFont(new Font("Times New Roman",1,20));
        btnCargar.addActionListener(this);
        add(btnCargar);
        
        btnDigitar=new JButton("Analizador Jcup");
        btnDigitar.setBounds(34, 275, 220, 30);
        btnDigitar.setForeground(Color.BLACK);
        btnDigitar.setBackground(Color.PINK);
        btnDigitar.setFont(new Font("Times New Roman",1,20));
        btnDigitar.addActionListener(this);
        add(btnDigitar);
        
        btnSalir=new JButton("Salir del Aplicativo");
        btnSalir.setBounds(34, 320, 220, 40);
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.PINK);
        btnSalir.setFont(new Font("Times New Roman",1,16));
        btnSalir.addActionListener(this);
        
        imgCancelar = new ImageIcon("src/imagenes/cerrar.png");
        imgAux = new ImageIcon(imgCancelar.getImage().getScaledInstance(40, 40, Image.SCALE_AREA_AVERAGING));
        
        btnSalir.setIcon(imgAux);
        
        add(btnSalir);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        if(e.getSource()==btnDigitar){
                frmAnalizadorJCup.setVisible(true);
                frmAnalizadorJFlex.setVisible(false);
                frmAnalizadorJCup.setMenu(this);
                this.setVisible(false);
        }else if(e.getSource()==btnCargar){
                frmAnalizadorJFlex.setVisible(true);
                frmAnalizadorJCup.setVisible(false);
                frmAnalizadorJFlex.setMenu(this);
                this.setVisible(false);
        }else if(e.getSource()==btnSalir){
            finalizar();
        }
    }
    
    public void finalizar(){
        this.dispose();
        this.frmAnalizadorJCup.dispose();
        this.frmAnalizadorJFlex.dispose();
    }
}
