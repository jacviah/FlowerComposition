package by.jacviah.jc1.flowerComposition.entity;

import java.util.Date;
import java.util.Objects;

public abstract class PlantMaterial extends CompositionElement {
	
	private Date shipDate;

	public PlantMaterial(int price, Date shipDate) {
		super(price);
		this.shipDate = shipDate;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		PlantMaterial that = (PlantMaterial) o;
		return Objects.equals(shipDate, that.shipDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), shipDate);
	}
}
