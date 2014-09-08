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
public class Decodificar {
    
    private String mensaje;
    private int cb;
    private int[] v;    
    
    public Decodificar()
    {
        mensaje = "";
        v = new int[256];        
    }
    
    public Decodificar(String s)
    {
        mensaje = s;
        v = new int[256];       
    }
    
    public void frecuencia()
    {
        char d;
        cb = 0;
        int t = 0;
        for (int i = 0; i < 255; i++)
            v[i] = 0;
        for (int i = 0; i < mensaje.length(); i++)        
        {            
            t = mensaje.codePointAt(i);
            //t = Integer.parseInt(String.valueOf(d));
            if (t <= 256 )
            {
                v[t]++;
                cb++;
            }                
        }
    }
    
    @Override
    public String toString()
    {
        String res = "";
        for (int i = 0; i<255; i++)
            if (v[i] != 0)
                res += Character.toString((char)i) + " aparece " + v[i] + " veces " + "\n";
        return res;
    }
    
}
