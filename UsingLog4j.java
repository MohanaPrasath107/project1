package log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UsingLog4j {
	static Logger log = Logger.getLogger(UsingLog4j.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("M");
		log.error("O");
		log.fatal("H");
		log.warn("A");
		log.debug("N");
		
		

	}

}
