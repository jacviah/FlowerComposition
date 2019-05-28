package by.jacviah.jc1.flowerComposition.entity;

import java.util.Date;
import java.util.Objects;

public class Flower extends PlantMaterial {
	
	private FlowerType type;

	public Flower(int price, Date shipDate, FlowerType type) {
		super(price, shipDate);
		this.type = type;
	}

	public FlowerType getType() {
		return type;
	}

	public void setType(FlowerType type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Flower flower = (Flower) o;
		return type == flower.type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), type);
	}

	@Override
	public String toString() {
		return "Flower{" +
				"type=" + type +
				", shipDate=" + this.getShipDate() +
				", price=" + this.getPrice() +
				'}';
	}
}
