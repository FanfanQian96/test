package sd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
public class MyLogger {
	 private static final Logger logger = LogManager.getLogger(MyLogger.class);        
	 public static void main(String[] args) {	
		 try{
		      FileInputStream fstream = 
		                         new FileInputStream("D:\\textfile.txt");
		      DataInputStream in = 
		                         new DataInputStream(fstream);
		      BufferedReader br = 
		                  new BufferedReader(new InputStreamReader(in));
		      String strLine;
		      while ((strLine = br.readLine()) != null){
		     System.out.println (strLine);
		      }
		      in.close();
		   }catch (FileNotFoundException fe){
		     logger.error("File Not Found",fe);
		        logger.warn("This is a warning message");
		        logger.trace("This message will not be logged since log level is set as DEBUG");
		   }catch (IOException e){
		     logger.error("IOEXception occured:", e);
		  }
   
		 }
	
}
