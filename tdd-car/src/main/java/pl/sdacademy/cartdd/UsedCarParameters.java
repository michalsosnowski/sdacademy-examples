package pl.sdacademy.cartdd;

public enum UsedCarParameters {FUEL(2),CLEAN(1),TIRES(3);
private int used;
	UsedCarParameters(int i) {
		this.used=i;
	}

	public int getUsed() {
		return used;
	}
}
