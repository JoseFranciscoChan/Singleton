
package singleton;

/**
 *
 * @author J-CHAN
 */
public class Logger {
    
    private static Logger log;
    private String value;
    
    private Logger(){
        
    }
    
    public static synchronized Logger getInstance(){ //regresa un objeto de tipo log y regresa un instacia unica del objeto.
        if(log == null){               
            log = new Logger();
            
        }
        return log;
    }
    
    public void log(String ms){
        System.out.println(ms);
    }
    
    public void setValue(String ms){
        value = ms;
    }
    public String getValue(){
        return value;
    }
    
}
