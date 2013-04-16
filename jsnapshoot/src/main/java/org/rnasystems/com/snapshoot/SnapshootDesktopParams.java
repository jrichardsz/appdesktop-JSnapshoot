/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rnasystems.com.snapshoot;

/**
 *
 * @author ext_synps03
 */
public class SnapshootDesktopParams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //interpretamos los parametros
        
        if(args==null || args.length==0){
            System.out.println("default");
            ScreenShot.automaticSnap();
        }else {
            System.out.println("ext:"+args[0]);
            ScreenShot.automaticSnap(args[0]);
        }
        
        
        
    }
}
