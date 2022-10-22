package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//interface : birbirinin alternatifi olan durumlarda kullanılır.
// **Sadece method imzasını barındırabilir.Yani şablonu yazılır burda içerisi implement edilen sınıflarda doldurulur.
// **ProductDao ile ilgili alternatifler(yöntemler)interface de yazılmış olan ( Şuan JDBC ve Hibernate den bahsediyoruz.)
// ** burada yazılı method isim, parametresine kadar alternatif sınıflarde olmak zorunda
//Geliştirmeye başlarken bu sınıftan başlamak gerekir sonra alternatifleri yazıp içerisine buradaki methodları ekleyip doldurmalıyız

//Olayı anlamak için :
//ProductDao bir ana sınıftır. JDBC ve Hibernate onun alternatifleridir. İleride teknoloji geliştikçe veritabanına erişmenin başka alternatifleride olabileceğinden tek bir yöntemle program yazmak doğru ve sürdürülebilir değildir.
//Sürdürülebilirlik : İnsanların yaşamını kodluyoruz ve bu yaşam sürekli olarak gelişmekte ve yenilikler eklenmektedir.
//Programımıza bu yenilikleri eklemek istediğimizde program buna direnmemeli yeniliği kolayca uyum sağlayabilmeli buda sürdürülebilir program ile olur.
//eğer biz sadece jdbc ile yazarsak kodlarımızı (interface yapmadan) ona bağımlı olmuş oluruz ve başka yönteme kolay kolay geçemeyiz
//İnterface ile bunun önüne geçerek ana şablon kısmı oluşturup hangi teknoloji gelirse gelsin interface yi o sınıflardan implements ederek
//kolayca uyum sağlayabilir hale getirebiliriz programa




public interface ProductDao {
	
	void add(Product product);

}
