package variableArguments;

public class Main {

	public static void main(String[] args) {
		// Variable Arguments : bir methoda istediğimiz kadar eleman gönderebilmemizi sağlar. Bunu yaparkende parametrenin yanına ... koyarak yaparız.				
		System.out.println(topla(5,7,8,10));
	}
	
	public static int topla(int... numbers) { //numbers arka tarafta bir diziye çevrilir. foreach ile içerisinde gezebiliriz.
		int total =0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
