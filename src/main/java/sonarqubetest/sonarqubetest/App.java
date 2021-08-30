package sonarqubetest.sonarqubetest;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;

public class App 
{
    private static final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main( String[] args )
    {
      System.out.println("Hello");   
      for(int i=0; i<10; i++){
          log.log(Level.INFO, "My first Log Message");
          log.log(Level.debug,"MKK");
      }
    }
}

