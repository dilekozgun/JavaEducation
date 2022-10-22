package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	//Override : Üzerine yazmak
	public void log(String message) {
		System.out.println("Logged to Database : " + message);
	}
}
