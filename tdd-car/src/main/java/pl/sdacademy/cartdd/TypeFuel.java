package pl.sdacademy.cartdd;

public enum TypeFuel {PETROL(6), DIESEL(5), ELECTRIC(4);
private int price;
	TypeFuel(int i) {
	this.price=i;
	}
	public int getPrice(){
		return price;
	}
}
