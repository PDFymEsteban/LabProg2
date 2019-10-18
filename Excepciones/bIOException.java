package Excepciones;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class bIOException {

    public static void main(String[] args) {

        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new File("C:\\Users\\TEBIN\\IdeaProjects\\TareaClase\\src\\Excepciones\\imagen.png"));
            System.out.println("Tamaño= Alto:"+imagen.getHeight()+"px Ancho:"+imagen.getWidth()+"px");
        }catch (IOException i){
            System.out.println("No se puede acceder al archivo");
        }

    }

}
