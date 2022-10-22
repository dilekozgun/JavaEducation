package classes2;

public class Main {

	public static void main(String[] args) {
		//Class ların amacı gruplama yapmaktır.
				//Referance type : class lar birer referans tipidir.	
				//Bellekte stack ve heap olarak iki alan vardır. biz customerManager tipinde bir değişken oluşturduğumuzda
				// yanii eşittire kadar olan kısım yazıldığında stack alanında o değişkene bi alan ayrılır. ve referans numarası verilir
				// new ile yazılan ikinci kısım yazıldığında ise heap alanında bi yer oluşturulur. ve stackte verilen referans numarası heap teki alanı gösterir
				// biz class ın methodlarını kullandığımızda heap teki alanda gerçekleştirilir. bu sebeple eğer new kısmı yazılmadan methodlar kullanılmaya çalışılırsa
				// hata alırız çünkü çalışacak alanı yoktur.
				// ve değişkenler referans numarasını tutar bu değişkenlerden birinin değerini diğerine aktarır isek artık ikiside aynı referans koduyla heap te aynı alanı gösteriyor olur.
				// ve kullanılmayan bi alan kalır örneğin customerManager ın heapteki alanı şuan boşa çıktı.
				// bu alan kullanılmadığından silinmesi gerekir bellekte kullanılmayan alanları silen 'GarbageCollector' vardır. yani çöp toplayıcısı bu gibi alanları silmeye yarar.
				
				CustomerManager customerManager = new CustomerManager(); 
				CustomerManager customerManager2 = new CustomerManager();
				customerManager = customerManager2;
				customerManager.Add();
				customerManager.Remove();
				customerManager.Update();

	}

}
