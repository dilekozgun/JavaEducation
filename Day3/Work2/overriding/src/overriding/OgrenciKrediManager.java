package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;

		// BaseKrediManager daki hesapla fonksiyonunu override ettik. Bu işlemi
		// yapabilmemiz için inheritance(kalıtım) ilişkisi gerekiyor.Yani extends
		// etmeliyiz ki fonksiyon miras olarak çocuğa geçsin.
		
		//Java da biz aksini belirtmedikçe bir sınıftaki fonksiyonlar overridable : üzerine yazılabilir.
		//Eğer fonksiyonun ezilmesini engellemek istiyorsak 'final' anahtar kelimesini vermeliyiz.

	}

}
