package javaEducation3;

public class Main {

	public static void main(String[] args) {
		// Sayısal tipler değer tiptir belleğin stack denilen alanında tutulur.

//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 200;
//		System.out.println(sayi1);

		// Class : İçerisinde bilgi veya yapacağımız işlemleri tutan yapılardır.(Genelde
		// manager operasyon tutar entities field alan tutar)
		// Class kullanılma amacı : birçok yerde kullanılacak bir yapıyı bir sınıfa
		// yazıp sonra bu sınıftan nesne oluşturarak kullanmak daha düzenli kod yazmayı
		// sağlar
		// ve o kodu bir gün değiştirecek olursak tek bi yer yani sınıfın içinde
		// değiştiğimizde her yerde değişmesini sağlarızb

		// SOLID
		
		//Bir sınıfı kullanabilmek için nesnesini(örneğini) oluşturmalıyız.(instance oluşturma)(instance creation)
		//Yani örnek oluşturmak demek onun heap te referans numarasını oluşturmak demektir.
		
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//
//		Customer customer = new Customer();
//		customer.setFirstName("Engin");
//		customer.setLastName("Demiroğ");
//		customer.setCity("İstanbul");
//		customer.setNationalIdentity("123456");
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
		
		
		//interface : İş yapan sınıfların(manager sınıfları) operasyonlarını sadece imza şeklinde tanımlayarak yazılımda bağımlılığı korumak adına yapılan çalışmadır.
        // Abstract Class : Örneğin her sınıfta içeriği dahil olmak üzere aynı yazılan bir method var bunu interface ile de yazabiliriz ancak her sınıfın içerisinde aynı kodu tekrar tekrar yazmış oluruz ve dry(dont repeat yourself) kuralına aykırı
		// Abstract class ile tanımlayarak içerisini doldurur ve sınıfları bu abstract classtan inherite ederek methodu kullanırız.
	
		
		
	}

}
