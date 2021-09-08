
package singleton;

/**
 *
 * @author J-CHAN
 */
public class Singleton {

    public static void main(String[] args) {
    
    Logger logger1 = Logger.getInstance();
    Logger logger2 = Logger.getInstance();
    
    logger1.setValue("¡Hola Mundo con patron singleton!");
        System.out.println(logger2.getValue());
    
    }
    
}
