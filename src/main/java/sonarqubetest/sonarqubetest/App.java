package sonarqubetest.sonarqubetest;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
  

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main( String[] args )
    {
      for(int i=0; i<10; i++){
          log.log(Level.INFO, "My first Log Message");
    }
}
