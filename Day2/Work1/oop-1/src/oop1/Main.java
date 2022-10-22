package oop1;

//Bütün class ların parent ı Object sınıfıdır. Ve her sınıf Object in özelliklerini alır, buna inherite etmek(miras almak) denir.Yeni oluşturduğumuz Product da özelliklerinin bazılarını Object ten alır.
public class Main {

	public static void main(String[] args) {
		// OOP de nesnelerin özellikleri vardır ve bu özellikler nesneyi tanımlar.
		// Nesneler aslında birer class tırlar. Bu class içerisinde bilgiler tutulur.
		// İki tip class vardır. 1. Özellik tutucu 2. Operasyon tutucu

		// Yeni bir product nesnesi tanımladık.
		// nesnenin özelliklerine değer atadık buna -> set value denir.

		// set
		Product product = new Product();
		product.setName("Delonghi Kahve Makinesi");
		product.setUnitPrice(7500);
		product.setDiscount(7);
		product.setUnitsInStock(3);
		;
		product.setImageUrl("image.jpg");

		// get
		// System.out.println(product.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(9);
		product2.setUnitsInStock(2);
		;
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(5500);
		product3.setDiscount(5);
		product3.setUnitsInStock(2);
		;
		product3.setImageUrl("image3.jpg");

		// product ların yer aldığı bir dizi tanımladık.
		Product[] products = { product, product2, product3 };

		for (Product productt : products) {
			System.out.println(productt.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05053552532");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Dilek");
		individualCustomer.setLastName("Özgün");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("111111111111");
		corporateCustomer.setCustomerNumber("54321");

		Customer[] customers = { individualCustomer, corporateCustomer }; // bireysel ve kurumsal müşteri bir müşteri
																			// olduğundan bu diziye eleman olarak
																			// atabilir. İkisini tek bi dizide
																			// birleştirebiliriz.
	}

}
