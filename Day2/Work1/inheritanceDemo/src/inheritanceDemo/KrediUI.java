package inheritanceDemo;

public class KrediUI {
	public void KrediHesapla(BaseKrediManager baseKrediManager ) { 
		baseKrediManager.Hesapla();
		
		//inheritance ın başka bi özelliği :  biz parametre olarak BaseKrediManager tipinde bir veri istediğimizi söyledik.
		//BaseKrediManager hem OgretmenKrediManager hem de TarimKrediManager ın annesi olduğu için  bu alana ikisini de gönderebiliriz
		//OgretmenKrediManager bir BaseKrediManager dır.
		//TarimKrediManager bir BaseKrediManager dır.
		//BaseKrediManager, OgretmenKrediManager ve TarimKrediManager'ın referansını tutabilir.Bu sayede yukarıdaki işlem gerçekleşir.
		
		//Örneğin bu işlemi, bir proje yazdığımızda oracle,mysql ve diğer veritabanlarında da çalışabilmesini sağlayabilmek için kullanabiliriz.
		// veritabanı class, bundan extend edilmiş mysql,oracle vb veri taban classları 
		// ve yukarıdaki gibi veritabanı class nesnesi oluşturup diğerlerini yollayabileceğiz.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
