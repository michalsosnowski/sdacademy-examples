package pl.sdacademy.stan;

class StateLowerCase implements StateLike {
	@Override
	public void writeName(final StateContext context, final String name) {
		System.out.println(name.toLowerCase());
		context.setState(new StateMultipleUpperCase());
	}
}
