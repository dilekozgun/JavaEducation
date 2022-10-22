package valueReferanceTypeDifferent;

public class Main {

	public static void main(String[] args) {
		// Primitive veri tipleri -> value type (değer tip)
		// deger veritiplerinde bellekteki stack alanı kullanılır sadece. değişkenin
		// içerisindeki değerde burada tutulur. ve biz başka bir değişkenin değerini
		// atarsak
		// diğer bir değişkene içerisindeki değer atanmış olur aslında.

		// value type
		int sayi = 10;
		int sayi2 = 20;
		sayi2 = sayi;
		sayi = 30;
		System.out.println(sayi2);

		// referance type : diziler referance tiplidir.
		// referance veri tiplerinde bellekte hem stack alanı hem heap alanı kullanılır.
		// ve bir değişkenin değeri aslında referans numarasıdır
		// eğer bir değişkenden diğerine atama yaparsak heapteki referans kısmının adresini atamış oluruz.
		// ve artık iki değişkende heap te aynı adresi gösteriyor olur.

		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1; //bellekte bir nesne var, iki değişken aynı nesneyi tutuyor.
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}

}
