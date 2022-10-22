package classesWithAttributes;

//private : sadece tanımlandığı blokta geçerlidir,bir üst süslü parantez içi. Javada değişkenler default olarak public tir.
//Encapsulation : değişkenlerimizi private yapmamız ve getter-setter ile onlara ulaşmamız buna bir örnektir. Çünkü değişkenlere (field alanlara) ulaşımı kısıtlıyoruz.
public class Product {
	
	//İki türlü Constructor vardır. Biri parametresiz biri parametreli. Set işlemleriyle atama yaptığımız gibi parametreli Constructor ile de atama yapabiliriz.
	//Bu durumda aynı isimle iki method oluşmuş olur.Biri parametreli biri parametresiz.
	//Bu duruma Overloading(Aşırı Yükleme) denir. Farklı parametrelerle aynı isimde method tanımlayabiliyoruz.

	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		this._id = id;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.colour = colour;

	}

	public Product() {

		// Bu alan bir Constructor dır. Default olarak oluşur biz yazmasakta olur.
		// Biz bir nesne oluştururken yazdığımız şu ifadedeki :
		// new Product();
		// aslında Constructor ın çalışmasıyla olur.Yani nesne Constructor ile
		// oluşturulur.
		// isim class ile aynı olmalı,ve public olmalı
		// Constructor : Tasarlanan sınıftan nesne üretilmesi anında çalışan metoddur.
		// Yani bir nesne oluşturduğumuzda ilk olarak Constructor Method çalışır.
		// yapıcı, yapılandırıcı gibi anlamlara gelir. Kısaca 'Yapıcı Method'.

		System.out.println("Yapıcı blok çalıştı.");
	}

	// attribute | field
	private int _id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String colour;
	private String code;

	// kodun sadece okunmasını istiyoruz o yüzden setter yok yalnızca getter var
	public String getCode() {
		return this.name.substring(0, 1) + _id;
	}

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		// this.id = id; -> this : bulunduğum sınıf
		// Ancak this koymayı unutabiliriz.

		_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColour() {
		return colour;
	}

	public void setRenk(String colour) {
		this.colour = colour;
	}

}
