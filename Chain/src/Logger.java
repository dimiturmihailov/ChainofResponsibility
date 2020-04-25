
public class Logger {
	
	public static int INFO = 1;
	   public static int DEBUG = 2;
	   public static int ERROR = 3;

	   protected int level;

	   //next element in chain or responsibility
	   protected Logger nextLogger;

	   public void setNextLogger(Logger nextLogger){
	      this.nextLogger = nextLogger;
	   }

	   public void logMessage(int level, String message){
	      if(this.level <= level){
	         write(message);
	      }
	      if(nextLogger !=null){
	         nextLogger.logMessage(level, message);
	      }
	   }

	  protected void write(String message) {
	}
}
