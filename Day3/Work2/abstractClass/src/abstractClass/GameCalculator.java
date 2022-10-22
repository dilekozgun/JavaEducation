package abstractClass;

public abstract class GameCalculator {
	public abstract void hesapla();
	// abstract method : GameCalculator'ı hangi sınıf extends veya implements ettiyse bu methodu içermek zorunda
	//Ve override etmek burdaki şablonu doldurarak o methodu doldurmak zorunda.Kendi methodunu yazmalı
	//abstract bir imza methodu sınıfların içermesini zorunlu kılıyor.
	//tüm sınıflarda olması gereken methodlarda bu kullanılabilir.Yani diğer sınıflarda farklı methodlarla puanlama sistemi çalışacak ve sonuç belirlenecek.
	
	
	public final void gameOver() { //gameOver override edilemez, bu sınıfı kullananan sınıflar bu methodu olduğu gibi kullanmak zorunda
		System.out.println("Oyun Bitti");
	}
	
	
	//abstract sınıfta abstract method olmak zorunda değil
	
	//Bir oyunda kadın,erkek ve çocuk kullanıcılar için puan hesaplama yapacağız.
	//Burda her biri için hesaplama olacağından base bir hesaplama sınıfı olmalı
	//Birbirinin alternatifi olan şeylerde inheritance gelmeli aklımıza.
}
