/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CambioColor;

import Handlers.ImageHandler;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author lobje
 */
public class BlancoNegro extends ImageHandler{
    BufferedImage jpg;
    BufferedImage bmp;
    File tmp;
    String nombre;
    
    public BlancoNegro(String filename) {
        super(filename);
        this.jpg = null;
        this.bmp = null;
        this.tmp = new File(getFileName());
        this.nombre = filename;
        
    }

    @Override
    public void readFile() throws Exception {
        File file = new File(getFileName());
        jpg = ImageIO.read(file);
        tmp = new File("./btmTem.bmp");
        ImageIO.write(jpg, "bmp", tmp);
        bmp = ImageIO.read(tmp);
    }

    @Override
    public void generateFiles() throws Exception {
        for (int i = 0; i < bmp.getWidth(); i++) {
            for (int j = 0; j < bmp.getHeight(); j++) {
                Color color = new Color(bmp.getRGB(i, j));
                //int promedio = (color.getBlue()+color.getGreen()+color.getRed())/3;
                int promedio = color.getBlue();
                Color NewColor = new Color(promedio, 0, 0);
                bmp.setRGB(i, j, NewColor.getRGB());
            }
        }
        ImageIO.write(bmp, "jpg", new File("BlancoNegro"+".jpg"));
        tmp.delete();
    }
    
}
