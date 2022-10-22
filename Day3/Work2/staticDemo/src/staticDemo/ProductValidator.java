package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static yapıcı blok açlıştı.");
	}
	
public static boolean isValid(Product product) {
	if (product.price>0 && !product.name.isEmpty()) {
		return true;
	}else {
		return false;
	}
}
}


//Static : static methodlar kullanılırken sınıf.method şeklinde kullanılabilir.Yani biz daha önce bir sınıftaki methodu kullanmak isterken sınıftan nesne üretip nesne.method
//diye çağırıyorduk.Örnek
//isValid şuan static olduğu için

//ProductValidator.isValid olarak ulaşılabilir.
//Static olmasaydı :
//ProductValidator validator = new ProductValidator();
//validator.isValid();


//Static methodlarda nesne üretmeden çağrım yapıldığı için yani new lemediğimiz için constructor çalışmaz.
//Static olduğunda çalışması için static yapıcı blok yazarız.
//birden fazla static yapıcı blok yazılabilir hepsi çalışır.
//bir ana sınıf static olamaz ancak inner class olabilir.