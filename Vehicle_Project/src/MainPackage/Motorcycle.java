package MainPackage;

public class Motorcycle extends Vehicle implements Vehicle_Interface {
	boolean hasSideCar;
	
	public Motorcycle(){
	}
	
	public Motorcycle(boolean hasSideCar){
		this.hasSideCar=hasSideCar;
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

}
