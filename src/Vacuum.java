package src;



public class Vacuum extends Appliance {
 private String grade;
 private String batteryVoltage;

 public Vacuum(String itemNumber, String brand, int quantity, int wattage, String color, double price, String grade, String batteryVoltage) {
     super(itemNumber, brand, quantity, wattage, color, price);
     this.grade = grade;
     this.batteryVoltage = batteryVoltage;
 }
 @Override
 public String getData() {
     String batteryVoltageDescription = getbatteryVoltage().equals("18") ? "Low (18V)" : "High (24V)";
     
     return "******** Vacuum Cleaner Details: ********\n" +
            "Item Number: " + getItemNumber() + "\n" +
            "Brand: " + getBrand() + "\n" +
            "Quantity: " + getQuantity() + "\n" +
            "Wattage: " + getWattage() + " Watts\n" +
            "Color: " + getColor() + "\n" +
            "Price: $" + getPrice() + "\n" +
            "Grade: " + getGrade() + "\n" +
            "Battery Voltage: " + getbatteryVoltage();
 }

// @Override
// public String getData() {
//     return getItemNumber() + ";" + getBrand() + ";" + getQuantity() + ";" +
//    		 getWattage() + ";" + getColor() + ";" + getPrice() + ";" + 
//    		 getGrade() + ";" + getbatteryVoltage();
// }
 
 public String getGrade() { return grade; }
 public String getbatteryVoltage() { return batteryVoltage; }
 
 
 
 
 
 
 
 

 
 @Override
 public String toString() {
	 
//	    // Debugging output
//	    System.out.println("Debug: ItemNumber = " + getItemNumber());
//	    System.out.println("Debug: Brand = " + getBrand());
//	    System.out.println("Debug: Quantity = " + getQuantity());
//	    System.out.println("Debug: Wattage = " + getWattage());
//	    System.out.println("Debug: Color = " + getColor());
//	    System.out.println("Debug: Price = " + getPrice());
//	    System.out.println("Debug: Grade = " + getGrade());
//	    System.out.println("Debug: BatteryVoltage = " + getbatteryVoltage());
	 
	 
	 
	 
     return String.format("%s;%s;%d;%d;%s;%.2f;%s;%s", 
         getItemNumber(), 
         getBrand(), 
         getQuantity(), 
         getWattage(), 
         getColor(), 
         getPrice(), 
         getGrade(), 
         getbatteryVoltage());
 }
 
// @Override
// public String toString() {
//     return "Item Number: " + getItemNumber() + "\nBrand: " + getBrand() +
//            "\nQuantity: " + getQuantity() + "\nWattage: " + getWattage() + 
//            "\nColor: " + getColor() + "\nPrice: " + getPrice() + 
//            "\nGrade: " + grade + "\nBattery Voltage: " + batteryVoltage;
// }
}


