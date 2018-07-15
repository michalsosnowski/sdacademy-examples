package pl.sdacademy.odwiedzajacy;

interface CarElement {
	void accept(CarElementVisitor visitor);
}