package pl.sdacademy.stan;

class StateMultipleUpperCase implements StateLike {
	/** Counter local to this state */
	private int count = 0;

	@Override
	public void writeName(final StateContext context, final String name) {
		System.out.println(name.toUpperCase());
		/* Change state after StateMultipleUpperCase's writeName() gets invoked twice */
		if(++count > 1) {
			context.setState(new StateLowerCase());
		}
	}
}
