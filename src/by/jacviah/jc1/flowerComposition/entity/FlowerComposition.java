package by.jacviah.jc1.flowerComposition.entity;

import java.util.ArrayList;
import java.util.Objects;

public class FlowerComposition {

	private Shape shape;
	private ArrayList<Flower> flowers;
	private ArrayList<Leaf> leaves;
	private ArrayList<Mechanic> mechanics;
	private ArrayList<Stem> stems;
	private ArrayList<Accessory> accessories;	
	private Container container;
	private Base base;

	public FlowerComposition(Shape shape, ArrayList<Flower> flowers, ArrayList<Leaf> leaves,
							 ArrayList<Mechanic> mechanics, ArrayList<Stem> stems, ArrayList<Accessory> accessories,
							 Container container, Base base) {
		this.shape = shape;
		this.flowers = flowers;
		this.leaves = leaves;
		this.mechanics = mechanics;
		this.stems = stems;
		this.accessories = accessories;
		this.container = container;
		this.base = base;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public ArrayList<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(ArrayList<Flower> flowers) {
		this.flowers = flowers;
	}

	public ArrayList<Leaf> getLeaves() {
		return leaves;
	}

	public void setLeaves(ArrayList<Leaf> leaves) {
		this.leaves = leaves;
	}

	public ArrayList<Mechanic> getMechanics() {
		return mechanics;
	}

	public void setMechanics(ArrayList<Mechanic> mechanics) {
		this.mechanics = mechanics;
	}

	public ArrayList<Stem> getStems() {
		return stems;
	}

	public void setStems(ArrayList<Stem> stems) {
		this.stems = stems;
	}

	public ArrayList<Accessory> getAccessories() {
		return accessories;
	}

	public void setAccessories(ArrayList<Accessory> accessories) {
		this.accessories = accessories;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		FlowerComposition that = (FlowerComposition) o;
		return shape == that.shape &&
				Objects.equals(flowers, that.flowers) &&
				Objects.equals(leaves, that.leaves) &&
				Objects.equals(mechanics, that.mechanics) &&
				Objects.equals(stems, that.stems) &&
				Objects.equals(accessories, that.accessories) &&
				Objects.equals(container, that.container) &&
				Objects.equals(base, that.base);
	}

	@Override
	public int hashCode() {
		return Objects.hash(shape, flowers, leaves, mechanics, stems, accessories, container, base);
	}

	@Override
	public String toString() {
		return "FlowerComposition{" +
				"\n shape=" + shape +
				",\n flowers=" + flowers +
				",\n leaves=" + leaves +
				",\n mechanics=" + mechanics +
				",\n stems=" + stems +
				",\n accessories=" + accessories +
				",\n container=" + container +
				",\n base=" + base +
				"\n}";
	}
}
