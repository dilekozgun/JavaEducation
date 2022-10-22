package kodlamaIoMimari.business;

import kodlamaIoMimari.core.logging.Logger;
import kodlamaIoMimari.dataAccess.CategoryDao;
import kodlamaIoMimari.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {

		Category[] categories = { new Category("Programlama"), new Category("Yabancı Dil Eğitimi") };

		for (Category category2 : categories) {
			if (category2.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Aynı isimde bir kategori zaten bulunuyor.");
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
