package by.jacviah.jc1.flowerComposition.entity;

import java.util.Objects;

public class Container extends CompositionElement {
	
	Size size;
	ContainerType type;
	Material material;

	public Container(int price, Size size, ContainerType type, Material material) {
		super(price);
		this.size = size;
		this.type = type;
		this.material = material;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public ContainerType getType() {
		return type;
	}

	public void setType(ContainerType type) {
		this.type = type;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Container container = (Container) o;
		return size == container.size &&
				type == container.type &&
				material == container.material;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), size, type, material);
	}

	@Override
	public String toString() {
		return "Container{" +
				"type=" + type +
				", material=" + material +
				", size=" + size +
				", price=" + this.getPrice() +
				'}';
	}
}
