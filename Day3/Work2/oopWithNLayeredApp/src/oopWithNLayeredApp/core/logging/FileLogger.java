package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override // override : üzerine yazma,base(ana sınıftan) geldiğini söyler.
	public void log(String data) {
		System.out.println("Dosyaya loglandı : " + data);

	}

}
