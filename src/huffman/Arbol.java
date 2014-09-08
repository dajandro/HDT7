/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

import java.util.TreeSet;

/**
 *
 * @author Daniel Orozco <daniel.orozco>
 */
public class Arbol {
    private Nodo raiz;
    private Nodo actual;
    private String[] cf;
    
    public Arbol()
    {
        raiz = null;
        cf = new String[256];
    }
    
    public Arbol(Nodo raiz)
    {
        this.raiz = raiz;
        cf = new String [256];
    }   
    
    public void armar(TreeSet set)
    {        
        while (set.size() != 1)
        {
            Nodo izq = (Nodo)set.first();
            set.pollFirst();
            Nodo der = (Nodo)set.first();
            set.pollFirst();          
            
            Nodo base = new Nodo();
            base.setValor(izq.getValor()+der.getValor());
            base.setFrecuencia(izq.getFrecuencia(),der.getFrecuencia());
            base.setIzq(izq);
            base.setDer(der);
            
            set.add(base);
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
    
    public void setCod(Nodo raiz)
    {
        codhuff(raiz,"");        
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
