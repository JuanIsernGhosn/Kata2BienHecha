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
public class Histogram {
    private final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }
    
    public HashMap <Integer,Integer> getHisto(){
        HashMap<Integer, Integer> histograma = new HashMap<>();
        for(int i = 0; i<vector.length; i++){
            if (histograma.containsKey(vector[i])==false){
                histograma.put(vector[i], 1); 
            } else {
                histograma.put(vector[i], histograma.get(vector[i])+1);
            }
        }
        return histograma;
    }

    public int[] getVector() {
        return vector;
    }
    
    
}
