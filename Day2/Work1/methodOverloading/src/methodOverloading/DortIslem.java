package methodOverloading;

public class DortIslem {
	public int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2+sayi3;
	}
	
	//Overloading : Aynı isimde iki method oluşturabiliriz.Ancak parametre sayıları veya parametre çeşitleri farklı olmalı.
	//Yani birbirlerinden ayıran bi özellik olmalı ki karışıklık olmasın.
	// Mesela şöyle de olabilir.
	
	public double topla(double sayi1,double sayi2) {
		return sayi1+sayi2;
	}
	
	//Sıralama farklı olsa da oluyor.
	
	public double topla(double sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public double topla(int sayi2,double sayi1) {
		return sayi1+sayi2;
	}

}
