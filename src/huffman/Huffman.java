/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

import java.util.Scanner;
import java.util.TreeSet;

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
        // Objetos
        Scanner entrada_datos  = new Scanner(System.in);
        // Sirve para organizar los nodos por jerarquía de frecuencia
        TreeSet set = new TreeSet(new OrdenarSet());        
        // Sirve para tomar cada caracter ingresado y ponerlo en su nodo correspondiente
        Lista texto = new Lista();
        // Arbol que genera los códigos de Huffman
        Arbol arbol;
        // Instrucciones al usuario
        System.out.println("Ingrese cadena a codificar:");        
        String ts = entrada_datos.next();        
        // Ingreso a lista
        for (int i = 0; i < ts.length(); i++)
            texto.insertar(String.valueOf(ts.charAt(i)));
        // Ingreso a Set
        Nodo tp = texto.getCabeza();
        while (tp.getSiguiente() != null)
        {
            set.add(tp);
            tp = tp.getSiguiente();
        }        
        set.add(tp);
        // Operaciones con el árbol
        arbol = new Arbol((Nodo)set.first());
        arbol.armar(set);
        arbol.setCod(((Nodo)set.first()));
        arbol.showCod();        
    }
    
}
