package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// Bir class sadece bir class ı extends edebilir.
		
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.Hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(ogretmenKrediManager); 
		
		krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
