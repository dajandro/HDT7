/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

/**
 *
 * @author Orozco Pablo
 */
public class Lista {
    private Nodo cabeza;
    private Nodo actual;    
	
    public Lista()
    {        
	actual = cabeza;        
    }    
    
    public Nodo getCabeza()
    {
        return cabeza;
    }
    
    public void insertar(String s)
    {       
        Nodo temp = new Nodo(s);
        boolean b = false;
        if (cabeza == null)
        {
            cabeza = temp;
            actual = cabeza;
        }
        else
        {
            Nodo recorre = cabeza;
            while(recorre.getSiguiente() != null)
            {
                if (recorre.getValor().equals(s))
                {
                    recorre.setFrecuencia();
                    b = true;        
                }
                recorre = recorre.getSiguiente();
            }
            if (b == false)
            {
                if (actual.getValor().equals(s))
                    actual.setFrecuencia();
                else
                {
                    actual.setSiguiente(temp);
                    actual = temp;
                }
            }
        }       
    }
    
    public String toString()
    {
        Nodo temp = cabeza;
        String s = "";
        if (temp != null)
        {
            while (temp.getSiguiente() != null)
            {
                s += temp.getValor();
                s += " con frecuencia: ";
                s += String.valueOf(temp.getFrecuencia());
                s += " -> ";
                temp = temp.getSiguiente();
            }
            s += temp.getValor();
            s += " con frecuencia: ";
            s += String.valueOf(temp.getFrecuencia());
            s += " -> ";
        }
        s += " null";
        return s;
    }  
    
}