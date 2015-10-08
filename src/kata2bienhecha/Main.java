/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2bienhecha;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] array = {1,4,7,1,1,3,4,1,4,3};
        String[] array1 = {"Pepe","Juan","Alberto","Jesus"};
        
        Histogram <Integer> histogram = BuildHisto.cumputHisto(array);
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + " : "+histogram.get(key));            
        }
    }
}
