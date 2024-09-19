import src.*;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;


public class Main {
//	Function to Display appliance in Readable format
	public static void displayAppliance(Appliance appliance) {
		String className = appliance.getClass().getSimpleName();
		if (className.equals("Vacuum")) {

	        String data = appliance.getData();  
	        System.out.println("");
	        System.out.println(data);
	        
	    } else if (className.equals("Refrigerator")) {

	        String data = appliance.getData(); 
	        System.out.println("");
	        System.out.println(data);
	        

	    } else if (className.equals("Microwave")) {

	        String data = appliance.getData();  
	        System.out.println("");
	        System.out.println(data);
	        

	    } else if (className.equals("Dishwasher")) {
	        String data = appliance.getData();
	        System.out.println("");
	        System.out.println(data);

	    } else {
	    	System.out.println("");
	        System.out.println("Unknown appliance type.");
	    }
		
	}
	
 public static void main(String[] args) {
     ApplianceManager manager = new ApplianceManager();
     Scanner scanner = new Scanner(System.in);

     try {
    	 manager.loadAppliances("../appliances.txt");
//    	 manager.loadAppliances("E:/java/ApplianceManagementSystem/appliances.txt");
    	 System.out.println("");
    	 System.out.println("                               ********** Welcome to Modern Appliances! **********");
         while (true) {
        	 System.out.println("");
//        	 System.out.println("");
        	 System.out.println("How May We Assist You? ");
        	 System.out.println("1. Checkout an Item");
        	 System.out.println("2. Search by Brand");
             System.out.println("3. Display Appliance by Type");
             System.out.println("4. View Random Appliances");
             System.out.println("5. Search by Item Number");
             System.out.println("0. Save & Exit");
             System.out.print("Select an option: ");
             int option = scanner.nextInt();
             scanner.nextLine(); // Consume newline

             if (option == 0) break;

             switch (option) {
             
             case 3:
                 // Display appliances by type
                 System.out.println("Appliance Types");
                 System.out.println("1\t– Refrigerators");
                 System.out.println("2\t– Vacuums");
                 System.out.println("3\t– Microwaves");
                 System.out.println("4\t– Dishwashers");
                 int typeOption = scanner.nextInt();
                 scanner.nextLine(); // Consume newline
                 
                 String type = "";
                 String attribute = "";
                 
                 if (typeOption == 1) {
                     type = "Refrigerator";
                     System.out.println("Enter number of doors: 2 (double door), 3 (three doors) or 4 (four doors):");
                     attribute = scanner.nextLine();
                 } else if (typeOption == 2) {
                     type = "Vacuum";
                     System.out.println("Enter battery voltage value. 18 V (low) or 24 V (high):");
                     attribute = scanner.nextLine();
                 } else if (typeOption == 3) {
                     type = "Microwave";
                     System.out.println("Room where the microwave will be installed: K (kitchen) or W (work site):");
                     attribute = scanner.nextLine();
                 } else if (typeOption == 4) {
                     type = "Dishwasher";
                     System.out.println("Enter the sound rating of the dishwasher: Qt (Quietest), Qr (Quieter), Qu(Quiet) or M (Moderate):");
                     attribute = scanner.nextLine();
                 }
                 
                 List<Appliance> matchingAppliances = manager.findAppliancesByTypeAndAttribute(type, attribute);
                 if (matchingAppliances.isEmpty()) {
                     System.out.println("No matching appliances found.");
                 } else {
                     for (Appliance appliance : matchingAppliances) {
                         displayAppliance(appliance);
                     }
                 }
                 break;

                 case 5:
                     System.out.print("Enter item number: ");

                     String itemNumber = scanner.nextLine();
                     
                     Appliance appliance = manager.findApplianceByItemNumber(itemNumber);
                     if (appliance != null) {
                    	 displayAppliance(appliance);
                    	 
//                         System.out.println(appliance);
                     } else {
                    	 System.out.println("");
                         System.out.println("Appliance not found.");
                     }
                     break;

                 case 2:
                     System.out.print("Enter brand name: ");
                     String brand = scanner.nextLine();
                     List<Appliance> appliances = manager.findAppliancesByBrand(brand);
                     if (!appliances.isEmpty()) {
                         for (Appliance a : appliances) {
                        	 displayAppliance(a);
//                             System.out.println(a);
                         }
                     } else {
                    	 System.out.println("");
                         System.out.println("No appliances found for brand " + brand);
                     }
                     break;

                 case 1:
                     System.out.print("Enter item number to purchase: ");
                     itemNumber = scanner.nextLine();
                     Appliance toPurchase = manager.findApplianceByItemNumber(itemNumber);
                     if (toPurchase != null) {
                         if (toPurchase.getQuantity() > 0) {
                             toPurchase.setQuantity(toPurchase.getQuantity() - 1);
                             System.out.println("");
                             System.out.println("*** Item Checked out. Thanks for purchasing! ***");
                         } else {
                        	 System.out.println("");
                             System.out.println("*** Appliance is out of stock. ***");
                         }
                     } else {
                    	 System.out.println("");
                         System.out.println("*** Appliance not found. ***");
                     }
                     break;

                 case 4:
                     System.out.print("Enter number of random appliances to view: ");
                     int number = scanner.nextInt();
                     List<Appliance> randomAppliances = manager.getRandomAppliances(number);
                     for (Appliance a : randomAppliances) {
                    	 displayAppliance(a);
//                         System.out.println(a);
                     }
                     break;

                 default:
                	 System.out.println("");
                     System.out.println("Invalid option. Try again.");
                     break;
             }
         }

         manager.saveAppliances("../appliances.txt");
//         manager.saveAppliances("E:/java/ApplianceManagementSystem/appliances.txt");

     } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
     } catch (IOException e) {
         System.out.println("Error saving file: " + e.getMessage());
     }
 }
}
