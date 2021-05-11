package bridgelabz.javasamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG =LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "Hello world";
    	LOG.debug(message + " Will Be Printed ON Debug");
    	LOG.info(message + " Will Be Printed ON Info");
    	LOG.warn(message + " Will Be Printed ON Warn");
    	LOG.error(message + " Will Be Printed ON Error");
    	LOG.fatal(message + " Will Be Printed ON Fatal");
    	LOG.info("Appending string: {}.", message);
        System.out.println( "message");
    }
}
