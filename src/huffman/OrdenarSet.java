/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

import java.util.Comparator;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class OrdenarSet implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
        if ( ((Nodo)o1).getFrecuencia() - ((Nodo)o2).getFrecuencia() != 0) 
            return ((Nodo)o1).getFrecuencia() - ((Nodo)o2).getFrecuencia();
        else
            return -1;
    }
    
}
