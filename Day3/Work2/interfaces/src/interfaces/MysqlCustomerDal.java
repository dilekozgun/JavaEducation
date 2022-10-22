package interfaces;

public class MysqlCustomerDal implements ICustomerDal, IRepository{ //Bir class birden fazla implementasyon yapabilir.

	@Override
	public void add() {
		System.out.println("Mysql veri eklendi");
		
	}

}
