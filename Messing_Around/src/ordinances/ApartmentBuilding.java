package ordinances;

public class ApartmentBuilding extends Building {
	private int totalUnits;
	private int maxOccupantsPerUnit;
	
	public ApartmentBuilding() {
		super();
	}
	
	public int getRequiredEmptySpace() {
		return super.requiredEmptySpace + (maxOccupantsPerUnit * totalUnits);
		
	}
}
