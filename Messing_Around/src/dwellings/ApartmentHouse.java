package dwellings;

public class ApartmentHouse extends RentableDwelling {
	private int numberOfApartments;
	
	public ApartmentHouse(double rentPerUnit, int numberOfApartments) {
		super(rentPerUnit);
		this.numberOfApartments = numberOfApartments;
	}
	
	public double getRentalIncome() {
		return (double)numberOfApartments * super.getRentPerUnit();
	}
}
