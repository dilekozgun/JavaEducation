package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger logger = new EmailLogger();
		//logger.log("Log mesajı");
		
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//		for (BaseLogger logger : loggers) {
//			logger.log("Log mesajı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// Polymorphism : Çok Biçimlilik, referans tiplerin birbirinin referansını
		// tutmasıdır.
		// Bu olay inheritance ilişkisi ile gerçekleşir eğer böyle bir ilişki yoksa
		// Polymorphism den söz edemeyiz.
		// İki sınıfın birbirine benzemesi gerekir ve üstlerinin aynı olması gerekir ki
		// Polymorphism oluşabilsin.

	}

}
