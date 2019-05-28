package by.jacviah.jc1.flowerComposition.entity;

import java.util.Objects;

public abstract class CompositionElement {
	private int price;

	public CompositionElement(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CompositionElement that = (CompositionElement) o;
		return price == that.price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
}
