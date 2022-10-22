package javaEducation3;

public class CustomerManager {

	private Customer _customer; // bu şekilde yapmamızın amacı constructor ile aldığımız bilgiyi kullanabilmek. Yani constructor parametresine verilen customer değeri sadece o methodda kullanılabiliyor. biz bunu _customer değişkeni olan yani sınıfın içerisinde kullanılabilecel bi değişkene atıyoruz.

	public CustomerManager(Customer customer) {
		_customer = customer;
	}

	public void save() {
		System.out.println("Veritabanına kaydedildi :");
	}
	public void delete() {
		System.out.println("Veritabanına kaydedildi :");
	}
}
