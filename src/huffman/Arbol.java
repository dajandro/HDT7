/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class Arbol {
    private Nodo cabeza;
    private Nodo actual;
    private String[] cf;
    
    public Arbol()
    {
        cabeza = null;
        cf = new String[256];
    }
    
    public Arbol(Lista l)
    {
        cabeza = l.getCabeza();
        cf = new String [256];
    }
    
    // No pasa los parámetros por referencia
    public Nodo insertarR(Nodo p,Nodo e)
    {
        //if ( (p == null) || (p.getFrecuencia() > e.getFrecuencia()) )
        if (p == null)
        {            
            //e.setSiguiente(p);            
            p = e;
            return p;
        }
        else
            return insertarR(p.getSiguiente(),e);        
    }
    
    public void armar()
    {        
        Nodo t = null;
        Nodo p = null;
        actual = cabeza;        
        //while ((actual.getSiguiente()).getSiguiente() != null)        
        while (actual.getSiguiente().getSiguiente() != null)
        {            
            t = new Nodo();            
            t.setIzq(actual);
            actual = actual.getSiguiente();
            t.setDer(actual);
            actual = actual.getSiguiente();
            t.setFrecuencia(t.getDer().getFrecuencia(),t.getIzq().getFrecuencia());
            t.setValor(t.getIzq().getValor()+t.getDer().getValor());            
            p = insertarR(actual,t);
            t.setSiguiente(p);
            //actual = t;
        }        
    }
    
    public void codhuff(Nodo p, String e)
    {
        int t = 0;        
        char tc = ' ';
        if (p != null)
        {
            if ( (p.getDer() == null) && (p.getIzq() == null) )
            {
                tc = p.getValor().charAt(0);
                t = (int)tc;
                cf[t] = e;
            }
            else
            {
                codhuff(p.getIzq(),e + "0");
                codhuff(p.getDer(),e + "1");
            }
        }
    }
    
    public void setCod()
    {
        codhuff(cabeza,"");        
    }
    
    public void showCod()
    {
        String res = "";
        for (int i = 0; i<255; i++)            
            if (cf[i] != null)
                res += Character.toString((char)i) + " tiene codigo " + cf[i] + "\n";
        System.out.println(res);
    }
}
