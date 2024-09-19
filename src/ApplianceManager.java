
import src.*;
import java.util.*;
import java.io.*;

public class ApplianceManager {
 private List<Appliance> appliances = new ArrayList<>();

 public void loadAppliances(String filename) throws FileNotFoundException {
     Scanner scanner = new Scanner(new File(filename));
     while (scanner.hasNextLine()) {
         String line = scanner.nextLine();
         String[] data = line.split(";");
         String itemNumber = data[0];
         char type = itemNumber.charAt(0);
         
         switch (type) {
             case '1':
                 appliances.add(new Refrigerator(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]), Integer.parseInt(data[8])));
                 break;
             case '2':
                 appliances.add(new Vacuum(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), data[6], data[7]));
                 break;
             case '3':
                 appliances.add(new Microwave(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), data[7]));
                 break;
             case '4':
             case '5':
                 appliances.add(new Dishwasher(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], Double.parseDouble(data[5]), data[6], data[7]));
                 break;
         }
     }
     scanner.close();
 }

 public void saveAppliances(String filename) throws IOException {
     FileWriter writer = new FileWriter(filename);
     for (Appliance appliance : appliances) {
         writer.write(appliance.toString() + "\n");
     }
     writer.close();
 }

 public Appliance findApplianceByItemNumber(String itemNumber) {
     for (Appliance appliance : appliances) {
         if (appliance.getItemNumber().equals(itemNumber)) {
             return appliance;
         }
     }
     return null;
 }

 public List<Appliance> findAppliancesByBrand(String brand) {
     List<Appliance> matchingAppliances = new ArrayList<>();
     for (Appliance appliance : appliances) {
         if (appliance.getBrand().equalsIgnoreCase(brand)) {
             matchingAppliances.add(appliance);
         }
     }
     return matchingAppliances;
 }

 public List<Appliance> getRandomAppliances(int number) {
     List<Appliance> randomAppliances = new ArrayList<>();
     Random rand = new Random();
     for (int i = 0; i < number; i++) {
         int randomIndex = rand.nextInt(appliances.size());
         randomAppliances.add(appliances.get(randomIndex));
     }
     return randomAppliances;
 }
 
 
 
 
 public List<Appliance> findAppliancesByTypeAndAttribute(String type, String attribute) {
	    List<Appliance> matchingAppliances = new ArrayList<>();
	    
	    for (Appliance appliance : appliances) {
	        if (type.equalsIgnoreCase("Refrigerator") && appliance instanceof Refrigerator) {
	            Refrigerator refrigerator = (Refrigerator) appliance;
	            if (String.valueOf(refrigerator.getnumberOfDoors()).equals(attribute)) {
	                matchingAppliances.add(appliance);
	            }
	        } else if (type.equalsIgnoreCase("Vacuum") && appliance instanceof Vacuum) {
	            Vacuum vacuum = (Vacuum) appliance;
	            if (vacuum.getbatteryVoltage().equals(attribute)) {
	                matchingAppliances.add(appliance);
	            }
	        } else if (type.equalsIgnoreCase("Microwave") && appliance instanceof Microwave) {
	            Microwave microwave = (Microwave) appliance;
	            if (microwave.getroomType().equalsIgnoreCase(attribute)) {
	                matchingAppliances.add(appliance);
	            }
	        } else if (type.equalsIgnoreCase("Dishwasher") && appliance instanceof Dishwasher) {
	            Dishwasher dishwasher = (Dishwasher) appliance;
	            if (dishwasher.getsoundRating().equalsIgnoreCase(attribute)) {
	                matchingAppliances.add(appliance);
	            }
	        }
	    }
	    
	    return matchingAppliances;
	}

 
 
 
 
 
 
 
 
 
 
 
}
