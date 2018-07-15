package pl.sdacademy.budowniczy;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
class PizzaLombok {

	String dough;
	private String sauce;
	private String topping;


}
