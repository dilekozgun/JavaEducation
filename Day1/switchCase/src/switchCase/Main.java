package switchCase;

public class Main {

	public static void main(String[] args) {
		// switch-case
		// Aynı case iki kere yazılmaz!!
		

		char grade = 'B';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':    //İki case için aynı sonuç döndürülsün istiyorsak
		case 'C':
			System.out.println("Çok İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}

	}

}
