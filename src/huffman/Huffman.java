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
public class Huffman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        String ts = "abaccda";
        Decodificar eshta = new Decodificar(ts);
        eshta.frecuencia();
        System.out.println(eshta.toString());        
        Lista texto = new Lista();
        Arbol arbol;
        for (int i = 0; i < ts.length(); i++)
            texto.insertar(String.valueOf(ts.charAt(i)));
        String bp = "";
        bp = texto.toString();
        System.out.println(bp);
        arbol = new Arbol(texto);
        arbol.armar();        
        arbol.setCod();        
        arbol.showCod();
    }
    
}
