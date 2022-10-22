package methods2;

//Ekrana birşey yazdırmak return etmek demek değildir. 
//void() fonksiyonları bir değişkene atayamayız çünkü değer döndürmez
//Fonksiyon sonlarındaki return ifadesi iki amaçla kullanılabilir. Bunlardan birincisi fonksiyonun çalışmasını sona erdirmek için isteğe bağlı olarak kullanılması, ikincisi ise fonksiyonda üretilen değeri ana programa aktarmaktır.

public class Main {

	public static void main(String[] args) {

		// void ve return methodlar

		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		
		int sayi = topla(5,7);
		System.out.println(sayi);
		String sehir = sehirVer();

	}

	private static String sehirVer() {
		
		return "Ankara";
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}

}
