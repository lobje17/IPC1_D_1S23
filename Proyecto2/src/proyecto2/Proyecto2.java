/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author lobje
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String fileInputPath = "grafo1.dot";
        String fileOutputPath = "grafo1.png";
        String tParam = " -Tpng ";
        String tOParam = " -o ";
        String[] cmd = new String[5];
        cmd[0] = dotPath;
        cmd[1] = tParam;
        cmd[2] = fileInputPath;
        cmd[3] = tOParam;
        cmd[4] = fileOutputPath;
        
//        try {
//        
//        String command = cmd[0] +" "+ cmd[1] +" "+ cmd[2] +" "+ cmd[3] +" "+ cmd[4];    
//        Process child = Runtime.getRuntime().exec(command);
//        child = Runtime.getRuntime().exec(command);
//        } catch (IOException e) {
//            System.out.println("Error "+e);
//        }
        
        
//        Runtime rt = Runtime.getRuntime();
//        rt.exec( cmd );
//        
//        } catch (Exception ex) {
//        ex.printStackTrace();
//        } finally {
//        }


        String command = dotPath + " -Tpng " + fileInputPath + " -o " + fileOutputPath; // comando a ejecutar
        System.out.println("command="+command);
        try {
            Process process = Runtime.getRuntime().exec(command); // ejecutar el comando
            InputStream inputStream = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // imprimir la salida del comando en la consola
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
