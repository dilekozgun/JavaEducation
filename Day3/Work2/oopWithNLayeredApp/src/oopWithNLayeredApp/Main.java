package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// Bir uygulamada kodlarımızı üç katmana böleriz 
		// Amacımız kodları kolay yönetebilmek ve sürdürülebilirlik birde test etmeyi kolaylaştırma
		// Data Access : Veriye Erişim Kodları
		// Business : İş geliştirme,kişiye özel veri gelmesi için kodlar
		// UI : User İnterface, Arayüz kodları
		
		// Data Access bu üç yolla yapılabilir veya Business da yapılabilir.
		
		//JDBC : Java uygulamalarında veritabanı bağlantısını sağlar
		//Hibernate-ORM : JDBC nin geliştirmesi
		//JPA : Hibernate Geliştirmesi (Bizim kullanacağımız)
		
		//Entities : Veritabanı nesnelerimiz.
		
		//Aynı isimde üründen ikincisini ekleyememe : Business Domain - İş Kuralı
		//Bu durum tamamen işin yapısına göre şekillenir. Eklenedebilir eklenmeyedebilir.
		//Bu kodlar business katmanında yer alır.
		
		Product product1 = new Product(1,"Iphone",10000);
		
		//yönetici panelinde admin ürün girmek istediğinde
		//ekrandaki alanlara diyelimki ürünün bilgilerinden id,name,fiyat olarak bilgileri girdi
		//ve ürünü kaydetti. Arka tarafta yukarıdaki kod çalışır ve ürün bu şekilde oluşturulur.
		
		//Arayüz iş katmanıyla iletişim kurar veritabanına gidemez.
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1); //hata mesajı olduğundan bunu kullanırken main yanına throws Exception ekledik.
		
		

	}

}
