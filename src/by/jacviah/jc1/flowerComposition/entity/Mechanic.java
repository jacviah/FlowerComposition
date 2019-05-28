package by.jacviah.jc1.flowerComposition.entity;

import java.util.Objects;

public class Mechanic extends CompositionElement {
	
	MechanicType type;

	public Mechanic(int price, MechanicType type) {
		super(price);
		this.type = type;
	}

	public MechanicType getType() {
		return type;
	}

	public void setType(MechanicType type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Mechanic mechanic = (Mechanic) o;
		return type == mechanic.type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), type);
	}

	@Override
	public String toString() {
		return "Mechanic{" +
				"type=" + type +
				", price=" + this.getPrice() +
				'}';
	}
}
