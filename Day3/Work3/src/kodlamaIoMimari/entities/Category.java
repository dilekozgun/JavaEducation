package kodlamaIoMimari.entities;

public class Category {
	private int id;
	private String name;

	public Category(String categoryName) {
		this.name = categoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return name;
	}

	public void setCategoryName(String categoryName) {
		this.name = categoryName;
	}

}
