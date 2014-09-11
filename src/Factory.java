
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

/**
 *
 * @author Pablo
 */
public class Factory {
    
    public Set getSet(int n)
    {
        switch (n)        
        {
            case 1: 
                return (Set) new PriorityQueue();
            case 2:
                return new TreeSet();
            case 3:
                return new LinkedHashSet();
             default:
                System.out.println("Ha escogido una opción incorrecta");
                return null;
        }
        
    }

}
