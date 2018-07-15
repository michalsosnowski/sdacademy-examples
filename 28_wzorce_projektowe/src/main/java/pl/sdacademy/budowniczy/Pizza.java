package pl.sdacademy.budowniczy;

/**
 * "Produkt"
 */
class Pizza {


	String dough = "";
	private String sauce = "";
	private String topping = "";

	private Pizza(Builder builder) {
		setDough(builder.dough);
		setSauce(builder.sauce);
		setTopping(builder.topping);
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public static final class Builder {
		private String dough;
		private String sauce;
		private String topping;

		private Builder() {
		}

		public Builder withDough(String val) {
			dough = val;
			return this;
		}

		public Builder withSauce(String val) {
			sauce = val;
			return this;
		}

		public Builder withTopping(String val) {
			topping = val;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}
	@Override
	public String toString() {
		return "Pizza{" + "dough='" + dough + '\'' + ", sauce='" + sauce + '\'' + ", topping='" + topping +
			'\'' + '}';
	}
}


/**
 * "Abstrakcyjny budowniczy"
 * <p>
 * "Konkretny budowniczy"
 * <p>
 * "Konkretny budowniczy"
 * <p>
 * "Nadzorca"
 * <p>
 * Klient zamawiający pizzę.
 */
/*
abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();
}

*/
/**
 * "Konkretny budowniczy"
 *//*

class HawaiianPizzaBuilder extends PizzaBuilder {
	public void buildDough() {
		pizza.setDough("cross");
	}

	public void buildSauce() {
		pizza.setSauce("mild");
	}

	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
	}
}

*/
/**
 * "Konkretny budowniczy"
 *//*

class SpicyPizzaBuilder extends PizzaBuilder {
	public void buildDough() {
		pizza.setDough("pan baked");
	}

	public void buildSauce() {
		pizza.setSauce("hot");
	}

	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}
}


*/
/**
 * "Nadzorca"
 *//*

class Waiter {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}


*/
/**
 * Klient zamawiający pizzę.
 *//*

class BuilderExample {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();

		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();

		Pizza pizza = waiter.getPizza();
	}
}*/
