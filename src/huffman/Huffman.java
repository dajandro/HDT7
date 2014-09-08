/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
* Daniel Orozco 13312
*/

package huffman;

import java.util.Scanner;
import java.util.TreeSet;
import javax.swing.JOptionPane;

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
       
        // Sirve para organizar los nodos por jerarquía de frecuencia
        TreeSet set = new TreeSet(new OrdenarSet());        
        // Sirve para tomar cada caracter ingresado y ponerlo en su nodo correspondiente
        Lista texto = new Lista();
        // Arbol que genera los códigos de Huffman
        Arbol arbol;
        // Instrucciones al usuario
        System.out.println("Ingrese cadena a codificar:");        
        String expresion = JOptionPane.showInputDialog(null, "ingrese expresión", null);
        // Ingreso a lista
        for (int i = 0; i < expresion.length(); i++)
            texto.insertar(String.valueOf(expresion.charAt(i)));
        // Mostrar frecuencia de lista
        System.out.println("");
        System.out.println("Frecuencia de letras ingresadas");
        System.out.println(texto.toString());
        System.out.println("");
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
        // Pedir mensaje codificado        
        System.out.println("El mensaje codificado debe tener separados los códigos por un guión ('-')");
        System.out.println("Ingrese mensaje:");
        expresion =  JOptionPane.showInputDialog(null, "ingrese expresión", null);
        // Llamar a metodo traductor
        String salida = arbol.traducir(expresion, arbol);
        System.out.println(salida);
    }
    
}
