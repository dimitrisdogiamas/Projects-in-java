package ergasia3;
import java.util.Scanner;
import java.util.ArrayList;
public class Transport {
	public static void main (String[] args) {
		ArrayList<Vechicle> al = new ArrayList<Vechicle>();
		Scanner scanner = new Scanner(System.in);
		String continueInput="";
		
		while (continueInput.equalsIgnoreCase("y")|| continueInput.equalsIgnoreCase("yes")) {
			System.out.println("enter vechicle details: ");
			System.out.println("owners name: ");
			String fullnameofowner= scanner.nextLine();
			System.out.println("license plate: ");
			String arithmoskykloforias= scanner.nextLine();
			System.out.println("year of manifacture: ");
			int etosKat= scanner.nextInt();
			scanner.nextLine();
			
			 System.out.println("Enter address system details:");
	            System.out.print("Address system status (vazeiEmpros/svinei/striveiAristera/striveiDexia): ");
	            String addressSystemStatus = scanner.nextLine();
			
	            System.out.println("Enter engine details:");
	            System.out.print("Engine displacement: ");
	            int kyvismos= scanner.nextInt();
	            System.out.print("Engine horsepower: ");
	            int ippodynami= scanner.nextInt();
	            scanner.nextLine();
	            
	            
	            
	            SystimaDieythynsis addressSystem = new SystimaDieythynsis();
	            addressSystem.setStatus(addressSystemStatus);
	            
	            Mihani engine = new Mihani();
	            engine.setKyvismos(kyvismos);
	            engine.setIppodynami(ippodynami);
	            
	            Vechicle vechicle = new Vechicle(fullnameofowner,arithmoskykloforias,etosKat,addressSystem,eng);
	            vechicle.put(arithmoskykloforias,vechicle);
	            
	            System.out.print("Continue entering vehicle details? (y/n): ");
	            continueInput = scanner.nextLine();
		}
		
		System.out.println("\nMenu:");
        System.out.println("0) Exit");
        System.out.println("1) Get engine displacement of a vehicle");
        System.out.println("2) Get engine horsepower of vehicles by year of manufacture");
        System.out.println("3) Get owner and year of manufacture of a vehicle");
        System.out.println("4) Perform an action on an engine or address system");
		
        
        
        int choice;
        do {
            System.out.print("\nEnter your choice (0-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter license plate number: ");
                    String licensePlateNumber = scanner.nextLine();
                    if (Vechicle.contains(arithmoskykloforias)) {
                        Vechicle selectedVehicle = vehicle.get(arithmoskykloforias);
                        System.out.println("Engine displacement: " + selectedVehicle.getEngine();
                    
                    }
            
        
                    else {
                        System.out.println("Vehicle not found.");
                    }
                    break;
                case 2:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter year of manufacture: ");
                    int selectedYear = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    int totalHorsepower = 0;
                    int vehicleCount = 0;
                    for (Vechicle v : vechicle.values()) {
                        if (v.getYearOfManufacture() == selectedYear) {
                            totalHorsepower += ((Mihani) v.getEngine()).getIppodynami();
                            vehicleCount++;
                        }
                    }
            }
        
        }

                        
                    

            
        
	

	

	


