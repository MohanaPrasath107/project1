package log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Execptions {
	static Logger log = Logger.getLogger(Execptions.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int num = 10;
		int num1 = 0;
		try {
			System.out.println(num/num1);
		}
		catch(Exception e) {
			log.error("DON'T DIVIDED ANY NUM BY USING ZERO",e);
		}
		
	}

}
