/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rnasystems.com.snapshoot.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author ext_synps03
 */
public class Parametros {

    public static Properties properties = null;

    static {
        properties = getInstance();
    }
  
    public static Properties getInstance() {
        try {

            properties = new Properties();
            FileInputStream inputStream = new FileInputStream(new File(Constantes.PROJECT_PROPERTIES));
            properties.load(inputStream);
            inputStream.close();

        } catch (IOException ex) {
            throw new NullPointerException();
        }
        return properties;
    }

    public static String getPropiedad(String propiedad) {

        if (properties == null) {
            properties = getInstance();
        }

        return properties.getProperty(propiedad);
    }
}
