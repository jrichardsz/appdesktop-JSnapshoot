/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rnasystems.com.snapshoot.util;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author ext_synps03
 */
public class Constantes {

    public static String PROJECT_PROPERTIES = "";
    public static String DIR_SAVE_IMG = "dir_save_img";
    public static String EXT_IMG = "ext_img";
    public static String DEFAULT_FILE_NAME;
    public static String FILE_NAME = "file_name";
    public static String PATTERN_FILE_NAME = "pattern_file_name";
    
    static{
       PROJECT_PROPERTIES = getPathDirectorioEjecucion()+File.separator+"cfg.properties"; 
       DEFAULT_FILE_NAME = "image_"+(new Random()).nextInt()+".jpg";
    }

    
    
    private static String getPathDirectorioEjecucion() {
        String path = null;
        try {
            path = new File(".").getCanonicalPath();
        } catch (IOException ex) {
        }
        return path;
    }    
    

}
