package pl.sdacademy.odwiedzajacy;


class Body implements CarElement {
	public void accept(final CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
