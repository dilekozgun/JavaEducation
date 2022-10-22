package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//Dao : Data Access Object, isimlendirmede data access nesnesi olduğunu belirtmek için kullanılır.

public class JdbcProductDao implements ProductDao { //ProductDao nun kurallarına uyan bir sınıfsın. Ve JdbcProductDao, bir ProductDao'dur. Yani ProductDao onun referansını tutar.
	//sadece ve sadece db erişim kodları buraya yazılır..SQL
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}

}
