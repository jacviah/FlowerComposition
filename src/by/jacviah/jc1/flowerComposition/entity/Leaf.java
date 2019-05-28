package by.jacviah.jc1.flowerComposition.entity;

import java.util.Date;
import java.util.Objects;

public class Leaf extends PlantMaterial {
	
	Size size;

	public Leaf(int price, Date date, Size size) {
		super(price, date);
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Leaf leaf = (Leaf) o;
		return size == leaf.size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), size);
	}

	@Override
	public String toString() {
		return "Leaf{" +
				"size=" + size +
				", shipDate=" + this.getShipDate() +
				", price=" + this.getPrice() +
				'}';
	}
}
