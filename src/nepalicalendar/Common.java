/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nepalicalendar;

/**
 *
 * @author Dell
 */
public class Common {
    private static final boolean isDebug = true;

    public static void log(String message){
        if(isDebug) {
            System.out.println(message);
        }
    }

    public static void log(String message, boolean doPrint){
        if(doPrint){
            System.out.println(message);
        }
    }
}
