package javaEducation3;

public class Customer {
	
	 
	public Customer() { //Her new lediğimizde çalışır. Yani her nesne oluşumunda bir kez çalışıyor.
		System.out.println("müşteri nesnesi başlatıldı");
	}

	private int id;
	
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
