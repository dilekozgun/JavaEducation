package classesWithAttributes;

public class Main {
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");
		//product.description = "Asus Laptop";
		//product.id=1;
		//product.price = 5000;
		//product.stockAmount=3;
		
		//System.out.println(product.name);
		
		//Ürünü oluşturduk şimdi veri tabanına ekleyeceğiz bunu da manager sınıfı ile yapacağız
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product); //yukarıda oluşturduğumuz ürünü veri tabanına ekledik
		
		//Bir class sadece bir işi yapmalı,bir method sadece bir işi yapmalıdır.
		
		//Single-responsibility principle : Tek sorumluluk ilkesi, sınıflarımızın iyi tanımlanmış tek bir sorumluluğu olması gerektiğini anlatmaktadır.Bir sınıfın yapması gereken yalnızca bir işi olması gerekir.
		//Product : Ürüne ait özellikler yer alır.
		//Product Manager : Ürüne ait operasyonlar bulunur.
		
		
		//Encapsulation : Kapsülleme, kullanıcının herhangi bi alanı kullanmasını kısıtlamak demektir.
		
		//productManager.Add2(1, Laptop,Asus,5000,5);
		//productManager.Add2(2, Laptop,Asus,5000,5);
		//productManager.Add2(3, Laptop,Asus,5000,5);
		//productManager.Add2(4, Laptop,Asus,5000,5);
		
		//Bu hatalı kullanımdır bu şekilde ürün ataması yaparsak yeni bir özellik eklediğimizde her satırda değişiklik yapmamız gerekecek,ve yeni özellik eklendiğinde hata verecektir bu satırlar
		//product.colour=""; //Yeni özelliği bu şekilde product sınıfında eklerseksorun yaşanmaz.
		
		//Mesela ürün fiyatına 0 dan küçük bi değer girilmesi istenmiyorsa encapsulation ile yapılır.
		//Başka bir örnek üründe bir özelliğe yalnızca okuma özelliği verilmeli yazma olmamalı bunda getter setter devreye girer. Bu da encapsulation özelliğinden gelir 
		
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		System.out.println(product.getCode());
		
	}
}
