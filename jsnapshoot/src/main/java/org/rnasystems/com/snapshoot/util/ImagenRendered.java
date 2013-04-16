/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rnasystems.com.snapshoot.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author ext_synps03
 */
public class ImagenRendered {

    public static String c_10 = "s";
    public static String c_14 = " ";
    public static String c_31 = "A";
    public static String c_37 = "m";
    public static String c_2 = "i";
    public static String c_35 = "t";
    public static String c_30 = "N";
    public static String c_9 = "O";
    public static String c_7 = "d";
    public static String c_3 = "c";
    public static String c_15 = "L";
    public static String c_5 = "a";
    public static String c_27 = "a";
    public static String c_33 = "y";
    public static String c_18 = "n";
    public static String c_32 = "S";
    public static String c_11 = "m";
    public static String c_24 = "r";
    public static String c_34 = "s";
    public static String c_22 = "g";
    public static String c_13 = "r";
    public static String c_23 = "a";
    public static String c_29 = "R";
    public static String c_19 = " ";
    public static String c_8 = " ";
    public static String c_21 = "n";
    public static String c_36 = "e";
    public static String c_12 = "a";
    public static String c_38 = "s";
    public static String c_25 = "u";
    public static String c_1 = "R";
    public static String c_16 = "e";
    public static String c_26 = "c";
    public static String c_6 = "r";
    public static String c_17 = "o";
    public static String c_4 = "h";
    public static String c_28 = "-";
    public static String c_20 = "I";


    public static void renderedRGB(Graphics2D g2d, BufferedImage img) {
        int ancho_marca = 300;
        int alto_marca = 25;
        g2d.drawString(ImagenRendered.c_1
                + ImagenRendered.c_2
                + ImagenRendered.c_3
                + ImagenRendered.c_4
                + ImagenRendered.c_5
                + ImagenRendered.c_6
                + ImagenRendered.c_7
                + ImagenRendered.c_8
                + ImagenRendered.c_9
                + ImagenRendered.c_10
                + ImagenRendered.c_11
                + ImagenRendered.c_12
                + ImagenRendered.c_13
                + ImagenRendered.c_14
                + ImagenRendered.c_15
                + ImagenRendered.c_16
                + ImagenRendered.c_17
                + ImagenRendered.c_18
                + ImagenRendered.c_19
                + ImagenRendered.c_20
                + ImagenRendered.c_21
                + ImagenRendered.c_22
                + ImagenRendered.c_23
                + ImagenRendered.c_24
                + ImagenRendered.c_25
                + ImagenRendered.c_26
                + ImagenRendered.c_27
                + ImagenRendered.c_28
                + ImagenRendered.c_29
                + ImagenRendered.c_30
                + ImagenRendered.c_31
                + ImagenRendered.c_32
                + ImagenRendered.c_33
                + ImagenRendered.c_34
                + ImagenRendered.c_35
                + ImagenRendered.c_36
                + ImagenRendered.c_37
                + ImagenRendered.c_38, img.getWidth() - ancho_marca, img.getHeight() - alto_marca);
    }
}
