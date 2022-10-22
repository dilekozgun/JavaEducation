package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		//Verileri Hibernate ile veritabanına eklemek istediğimizde, JDBC yerine bunu kullanmak istersek
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
