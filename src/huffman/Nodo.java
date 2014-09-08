/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

/**
 *
 * @author Pablo
 */
public class Nodo implements Comparable{
    private String valor;
    private int frecuencia;
    private Nodo puntero;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo()
    {
        valor = " ";
        frecuencia = 0;
        puntero = null;
        izquierda = null;
        derecha = null;
        valor = null;
    }

    public Nodo(String s)
    {
        puntero = null;
        izquierda = null;
        derecha = null;
        valor = s;
        frecuencia = 1;
    }
    
    public boolean equals(Object other)
    {        
        return (valor.equals(other));
    }
    
    public int compareTo(Object other)
    {        
        return ( ((Comparable)(other)).compareTo(valor) );
    }    

    public void setValor(String s)
    {
        valor = s;
    }
    
    public void setFrecuencia()
    {
        frecuencia += 1;
    }
    
    public void setFrecuencia(int a, int b)
    {
        frecuencia = a + b;
    }

    public void setSiguiente(Nodo siguiente)
    {
        puntero = siguiente;
    }
    
    public void setIzq(Nodo d)
    {
        izquierda = d;
    }
    
    public void setDer(Nodo d)
    {
        derecha = d;
    }

    public String getValor()
    {
        return valor;
    }
    
    public int getFrecuencia()
    {
        return frecuencia;
    }

    public Nodo getSiguiente()
    {
        return puntero;
    }
    
    public Nodo getIzq()
    {
        return izquierda;
    }
    
    public Nodo getDer()
    {
        return derecha;
    }
}
