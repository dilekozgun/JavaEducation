package classesWithAttributes;

//Ürün yöneticisi
//product class ı özellik tutan ürünlerin oluşturulması için bir sınıf. productManager ise ürün sınıfını kullanarak veritabanına ekleme vs gibi işlemleri yerine getiren yönetici bir sınıf buna katmanlı mimari denir.

public class ProductManager {
	public void Add(Product product) {
		//JDBC kodları ile ürünleri veritabanına ekleriz.
		System.out.println("Ürün eklendi " + product.getName());
	}
	public void Add2(int id,String name,String description,int price,int stockAmount) {
	
		
	}
	

}
