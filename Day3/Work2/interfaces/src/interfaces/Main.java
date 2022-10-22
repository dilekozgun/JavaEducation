package interfaces;

public class Main {
	public static void main(String[] args) {
		
	
	       //interface         //implemente eden class
	//ICustomerDal customerDal = new OracleCustomerDal();
	
//  Katmanlar arasında bağlantı kurarken aşağıdaki bir yöntemdir.Ancak 2. yöntem daha sağlıklıdır.
//	CustomerManager customerManager = new CustomerManager();
//	customerManager.customerDal = new MysqlCustomerDal();
//	customerManager.add();
		
		
	CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());	
	customerManager.add();
	
	}
	
	
	
	// İnterface ler uygulamalarda bağımlılığı yönettiğimiz konulardan bir
	// tanesidir.
	// bunlar bir sınıf kabul edilmiyor.ancak normal class lar veya abstract
	// classlar gibi referans tutabiliyolar.

	// Class : Tüm methodların tamamlanmış olması gerekir,yani şablon halde
	// bırakamayız method içerisine ne yazılacaksa sınıf içerisinde yazılmalı
	// Abstract Class : Methodlar tamamlanmış da olabilir tamamlanmamış da. eğer
	// tamamlanmadıysa inherit eden class içerisini doldurmak zorunda
	// İnterface : Abstract larda tamalanmamış imza olarak bırakılan methodlara
	// benzer bir durum söz konusu
	// tamamlanmamış operasyonlar içerir.
	// İnheritance ile İnterface in farkı:
	// İnheritance da bir sınıf bir sınıfı inherit edebilirken ,interface de bir
	// sınıf birden fazla interface i implemente edebiliyor.
    //interfacelerde abstract lar gibi new lenemez.Zaten methodların içi boş olduğundan ne yacağını bilmez.
	
	//İnterface ne zaman kullanılır : Bir operasyonu implemente eden sınıflar ayrı ayrı implement edilmesini istendiğinde
	
	//Bir yazılım uygulamasında katmanlar vardır.
	//Bunlar Data Access,Business ve Arayüz katmanlarıdır.
	//Gnellikle bu katmanların geçişleri interface ler ile yapılır.Çünkü bağımlılıkları önlemek için.
	
	
	
	
}
