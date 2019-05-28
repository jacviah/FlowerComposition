package by.jacviah.jc1.flowerComposition.entity;

import java.util.Objects;

public class Accessory extends CompositionElement {
	
	AccessoryType type;
	Material material;

	public Accessory(AccessoryType type, Material material, int price) {
		super(price);
		this.type = type;
		this.material = material;
	}

	public AccessoryType getType() {
		return type;
	}

	public void setType(AccessoryType type) {
		this.type = type;
	}

	public Material getMeterial() {
		return material;
	}

	public void setMeterial(Material meterial) {
		this.material = meterial;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Accessory accessory = (Accessory) o;
		return type == accessory.type &&
				material == accessory.material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), type, material);
	}

	@Override
	public String toString() {
		return "Accessory{" +
				"type=" + type +
				", meterial=" + material +
				", price=" + this.getPrice() +
				'}';
	}
}
