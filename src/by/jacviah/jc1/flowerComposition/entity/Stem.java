package by.jacviah.jc1.flowerComposition.entity;

import java.util.Date;
import java.util.Objects;

public class Stem extends PlantMaterial {
	
	int height;
	Size thickness;

	public Stem(int price, Date shipDate, int height, Size thickness) {
		super(price, shipDate);
		this.height = height;
		this.thickness = thickness;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Size getThickness() {
		return thickness;
	}

	public void setThickness(Size thickness) {
		this.thickness = thickness;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Stem stem = (Stem) o;
		return height == stem.height &&
				thickness == stem.thickness;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), height, thickness);
	}

	@Override
	public String toString() {
		return "Stem{" +
				"height=" + height +
				", thickness=" + thickness +
				", shipDate=" + this.getShipDate() +
				", price=" + this.getPrice() +
				'}';
	}
}
