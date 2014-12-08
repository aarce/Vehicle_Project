package MainPackage;
import java.util.UUID;
public class Test_Vehicle {
 public static void main(String[] args){
    	 
		Person a = new Person("Peter", "Lewandowski", UUID.randomUUID());
		Car car1 = new Car();
		car1.transferOwnerShip(a);
		car1.NumberOfDoors = 4;
		
		Truck truck1 = new Truck();
		truck1.transferOwnerShip(a);
		truck1.NumberOfAxels = 2;
		
		Person b = new Person("Mike", "Tomlinson",UUID.randomUUID());
		truck1.transferOwnerShip(b);
		Motorcycle m = new Motorcycle();
		m.hasSideCar = false;
		 System.out.println(car1.Owner.getFirstName()+" "+car1.Owner.getLastName()+" owns a car.");
    	 System.out.println("The car has " +car1.getNumberOfDoors()+" doors.");
    	 System.out.println(truck1.Owner.getFirstName()+" "+truck1.Owner.getLastName()+ " is now the new owner of the truck.");
    	 System.out.println("Motorcycle has sidecar: "+m.hasSideCar);
     }
}

