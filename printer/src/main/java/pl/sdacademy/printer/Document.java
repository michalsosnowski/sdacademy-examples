package pl.sdacademy.printer;

public class Document {
	private boolean printed;

	public Document(boolean printed) {
		this.printed = printed;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean b) {
		printed = b;
	}
}
