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
        int[] array = {1,4,7,1,1,3,4,1,4,3};
        Histogram histo = new Histogram(array);
        
        HashMap <Integer, Integer> histogram = histo.getHisto();
        
        for(int i = 0; i<array.length; i++){
            if(!histogram.containsKey(array[i])){
                histogram.put(array[i], 1);
            } else {
                histogram.put(array[i], histogram.get(array[i])+1);
            }
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " : "+histogram.get(key));            
        }
    }
}
