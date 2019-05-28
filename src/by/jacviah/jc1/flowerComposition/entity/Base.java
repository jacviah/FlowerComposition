package by.jacviah.jc1.flowerComposition.entity;

import java.util.Objects;

public class Base extends CompositionElement {
	
	int height;
	Material meterial;

	public Base(int price, int height, Material meterial) {
		super(price);
		this.height = height;
		this.meterial = meterial;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Material getMeterial() {
		return meterial;
	}

	public void setMeterial(Material meterial) {
		this.meterial = meterial;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Base base = (Base) o;
		return height == base.height &&
				meterial == base.meterial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), height, meterial);
	}

	@Override
	public String toString() {
		return "Base{" +
				"height=" + height +
				", meterial=" + meterial +
				", price=" + this.getPrice() +
				'}';
	}
}
