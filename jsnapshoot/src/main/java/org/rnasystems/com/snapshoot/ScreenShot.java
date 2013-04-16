/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rnasystems.com.snapshoot;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.rnasystems.com.snapshoot.util.Constantes;
import org.rnasystems.com.snapshoot.util.Parametros;

/**
 *
 * @author ext_synps03
 */
public class ScreenShot {

    public static void snapWhitTimer(long time) throws Exception {
        if (time > 0) {
            try {

                System.out.println("ScreenShot in " + time + " second(s)...");
                Thread.sleep(time);
                System.out.println("Snap!");
            } catch (NumberFormatException nfe) {
                System.err.println(time + " is not a valid number of seconds.");
                System.exit(-1);
            }
        }
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        ImageIO.write(img, Parametros.getPropiedad(Constantes.EXT_IMG).toUpperCase(), new File(getPathDirSaveImg() + File.separator + getNombreImg(Parametros.getPropiedad(Constantes.EXT_IMG))));
    }

    public static void automaticSnap() throws Exception {

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        Graphics g = img.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("Arial", Font.BOLD, 12);
        g2d.setFont(font);
        g2d.setColor(Color.RED);
//        int ancho_marca = 300;
//        int alto_marca = 25;
        //g2d.drawString("Richard Osmar Leon Ingaruca", img.getWidth() - ancho_marca, img.getHeight() - alto_marca);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //g.drawString("Richard Leon Ingaruca", img.getWidth() - ancho_marca, img.getHeight() - alto_marca);
        ImageIO.write(img, Parametros.getPropiedad(Constantes.EXT_IMG).toUpperCase(), new File(getPathDirSaveImg() + File.separator + getNombreImg(Parametros.getPropiedad(Constantes.EXT_IMG))));
    }
    
    
    public static void automaticSnap(String ext) throws Exception {

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(new Rectangle(size));
        Graphics g = img.getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("Arial", Font.BOLD, 12);
        g2d.setFont(font);
        g2d.setColor(Color.RED);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ImageIO.write(img, ext.toUpperCase(), new File(getPathDirSaveImg() + File.separator + getNombreImg(ext)));
    }    
    
    

    private static String getPathDirSaveImg() {
        String path = "";
        try {
            path = Parametros.getPropiedad(Constantes.DIR_SAVE_IMG);
        } catch (NullPointerException exception) {
            path = getPathDirectorioEjecucion();
        }

        return path;

    }

    private static String getPathDirectorioEjecucion() {
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
        }
        return path;
    }

    private static String getNombreImg(String ext) {

        //si en el archivo de propiedades esta el nombre del archivo
        String fileName = Parametros.getPropiedad(Constantes.FILE_NAME);
        if (fileName != null && !fileName.equals("")) {
            return fileName + "." + ext;
        }

        //si en el archivo de propiedades esta el nombre del archivo
        String patternFileName = Parametros.getPropiedad(Constantes.PATTERN_FILE_NAME);
        if (patternFileName != null && !patternFileName.equals("")) {
            Date d = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat(patternFileName);
            return dateFormat.format(d) + "." + ext;
        }

        return Constantes.DEFAULT_FILE_NAME;


    }
}
