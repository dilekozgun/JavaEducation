package arraysDemo;

public class arrays {

	public static void main(String[] args) {
		// Array
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "engin";
		ogrenciler[1] = "murat";
		ogrenciler[2] = "burak";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);	
		}
		
		System.out.println("-------------------");
		
		for (String ogrenci : ogrenciler) {
		System.out.println(ogrenci);	
		}
		
		
		
		

	}

}
