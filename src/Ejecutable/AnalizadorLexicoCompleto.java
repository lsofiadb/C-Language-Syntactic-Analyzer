/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import SoloLexico.Menu;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author 57301
 */
public class AnalizadorLexicoCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Menu menu = new Menu();
        String caminoJFLEX= "../AnalizadorLexicoCompleto/src/SoloLexico/Lexico.flex";
        String caminoJCUP= "../AnalizadorLexicoCompleto/src/SoloLexico/LexicoCup.flex";
        String[] caminoSCUP= {"-parser","Sintax","../AnalizadorLexicoCompleto/src/SoloLexico/Sintax.cup"};
        generarLex(caminoJFLEX, caminoJCUP, caminoSCUP);
        
        //------------------------------------------------------
        //Venta menu
        
        // TODO code application logic here
    }
    
    public static void generarLex(String caminoJFLEX, String caminoJCUP, String[] caminoSCUP) throws IOException, Exception {
        File arc; 
        arc = new File(caminoJFLEX);
        JFlex.Main.generate(arc);
        arc = new File(caminoJCUP);
        JFlex.Main.generate(arc);
        java_cup.Main.main(caminoSCUP);     
        
        Path caminoSym = Paths.get("../AnalizadorLexicoCompleto/src/SoloLexico/sym.java");
        if (Files.exists(caminoSym)) {
            Files.delete(caminoSym);
        }
        Files.move(
                Paths.get("../AnalizadorLexicoCompleto/sym.java"), 
                Paths.get("../AnalizadorLexicoCompleto/src/SoloLexico/sym.java")
        );
        Path caminoSint = Paths.get("../AnalizadorLexicoCompleto/src/SoloLexico/Sintax.java");
        if (Files.exists(caminoSint)) {
            Files.delete(caminoSint);
        }
        Files.move(
                Paths.get("../AnalizadorLexicoCompleto/Sintax.java"), 
                Paths.get("../AnalizadorLexicoCompleto/src/SoloLexico/Sintax.java")
        );        
    }
    
}
