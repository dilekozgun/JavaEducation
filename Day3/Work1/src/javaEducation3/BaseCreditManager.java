package javaEducation3;

public abstract class BaseCreditManager implements ICreditManager {

	@Override
	public void save() {
		// bu method aynı hepsinde o yüzden burada yazıp sınıfları inherite edicez.
		// ileride bu methodun içine tek bir sınıfta eklentiler yapmak istersek ancak
		// diğer sınıflarda aynı olsun diyorsak o zaman virtual(sanal) anahtar
		// kelimesini vermeliyiz methoda
		// o zaman istediğimiz sınıf içerisinde eklentiler yapabiliriz
		// ancak javada zaten methodlar default olarak virtual tanımlanır. Başka bir sınıfta ezebilmek için 
		System.out.println("xxx");
	}

	@Override
	public abstract void calculate(); // abstract methodun gövdesi olamaz. biz ICreditManager burdan implements
									  // ettiğimiz için doldurmamak için abstract verdik çünkü bu method her sınıfta
									  // farklı doldurulacak

}
