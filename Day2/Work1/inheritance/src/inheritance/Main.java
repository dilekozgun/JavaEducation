package inheritance;

public class Main {

	public static void main(String[] args) {
		// inheritance : miras demektir ve class lar arasında yapılır.
		// Bir nesne diğerine miras bırakır.
		// Customer ve Employee nin ortak yönleri olduğundan kendimizi tekrar etmemek için
		// Person class ı açtık. Her ikiside birer kişi olduğundan.
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		
		
		//Bir class hem ortak methodları hem attribute ları tutabilir. 
		//Yani ikisi içinde classlarda extends edebiliriz.
		//Sınıflara özel fonksiyon ve field lar kendi classlarında oluşturulurken ortak olanlar için bir sınıf açılır ve ordan extends edilir.
		
		//EmployeeManager da BestEmployee() methodu kendine özeldir. Ancak Add() ve List() , PersonManager() dan extend edilmiştir.
		// ve extends edilmesiyle bu iki method EmployeeManager' a da geçmiştir.

	}

}
