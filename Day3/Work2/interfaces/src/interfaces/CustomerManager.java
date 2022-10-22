package interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;

	//İkinci yöntem aşağıdaki gibi bir constructor oluşturmak ve buradaki customeDal ı private yapmak
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// İş kodları
		customerDal.add();
	}
}
