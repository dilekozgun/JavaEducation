package methods;

//Bir değişken tanımladığımızda tanımlandığı blokta geçerlidir. Yani bir methodun içerisinde tanımlanan değişken diğer bir methodda tanımlı olmuyor.
// Dont repeat yourself : Bir methodda bir iş yaparak kendini tekrar etme ve temiz kod yaz. Aşağıda parçalanabilir tüm ifadeleri parçaladık ve dinamik bir kod yazdık

public class Main {

	public static void main(String[] args) {
		numberFind();
	}

	public static void numberFind() {
		int numbers[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int number = 5;
		boolean find = false;

		for (int i : numbers) {
			if (number == i) {
				find = true;
				break;
			}
		}

		if (find) {
			printMessage("Sayı bulundu: " + number); // "Sayı bulundu: number" tek bir message değişkeni olarak
														// printMessage a gönderilir
		} else {
			printMessage("Sayı bulunamadı: " + number);
		}

	}

	public static void printMessage(String message) {
		System.out.println(message);
	}

}
