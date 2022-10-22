package javaEducation3;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void save() {
		System.out.println("Asker kredisi kaydedildi");
	}

	@Override
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı");
	}

}
