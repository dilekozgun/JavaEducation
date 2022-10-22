package oop1;

//Class isimlendirme kuralı : PascalCase -> kelimelerin ilk harfi büyük
// class ya da nesne bir şablondur içerisinde tutmak istediğin bilgiler ve nesneyi tanımlayacak bilgiler için ortamı hazırlarsın, değişkenlerin içerisini doldurmazsın 
// her bir özellik bir field yani alandır. (class ın name field ı) 
//private : yalnızca tanımlandığı class ta kullanılır.
public class Product {
	private String name;
	private double unitPrice; // birim fiyatı
	private double discount; // indirim oranı
	private String imageUrl;
	// Üründe birden çok fotoğraf olmasını isteyebiliriz. O zaman bu değişkeni dizi
	// haline getiririz. -> String[] imageUrls;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
