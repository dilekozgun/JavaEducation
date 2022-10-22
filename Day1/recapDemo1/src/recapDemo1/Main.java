package recapDemo1;

public class Main {

	public static void main(String[] args) {
		//recapDemo
		
		int sayi1 =20;
		int sayi2 = 25;
		int sayi3 = 2;
		String enBuyukSayi = "En büyük sayı : ";
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println(enBuyukSayi + sayi1);
		}else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println(enBuyukSayi + sayi2);
		}else {
			System.out.println(enBuyukSayi + sayi3);
		}
		
		//-------------------------------------------------------------------
		
		int enBuyuk = sayi1;
		
		if(sayi1<sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3){
			enBuyuk= sayi3;
		}
		System.out.println(enBuyukSayi + enBuyuk);
		

	}

}
