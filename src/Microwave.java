package src;



public class Microwave extends Appliance {
 private double capacity;
 private String roomType;

 public Microwave(String itemNumber, String brand, int quantity, int wattage, String color, double price, double capacity, String roomType) {
     super(itemNumber, brand, quantity, wattage, color, price);
     this.capacity = capacity;
     this.roomType = roomType;
 }
 
 public double getcapacity() { return capacity; }
 public String getroomType() { return roomType; }
 
 @Override
 public String getData() {
     String roomDescription = getroomType().equalsIgnoreCase("K") ? "Kitchen" : "Work Site";
     
     return "******** Microwave Details: ********\n" +
            "Item Number: " + getItemNumber() + "\n" +
            "Brand: " + getBrand() + "\n" +
            "Quantity: " + getQuantity() + "\n" +
            "Wattage: " + getWattage() + " Watts\n" +
            "Color: " + getColor() + "\n" +
            "Price: $" + getPrice() + "\n" +
            "Capacity: " + getcapacity() + " cubic feet\n" +
            "Room Type: " + getroomType();
 }
 
 
 
// @Override
// public String getData() {
//     return getItemNumber() + ";" + getBrand() + ";" + getQuantity() + ";" +
//    		 getWattage() + ";" + getColor() + ";" + getPrice() + ";" + 
//    		 getcapacity() + ";" + getroomType();
// }
 
 @Override
 public String toString() {
     return String.format("%s;%s;%d;%d;%s;%.2f;%.2f;%s", 
         getItemNumber(), 
         getBrand(), 
         getQuantity(), 
         getWattage(), 
         getColor(), 
         getPrice(), 
         getcapacity(), 
         getroomType());
 }

// @Override
// public String toString() {
//     return "Item Number: " + getItemNumber() + "\nBrand: " + getBrand() +
//            "\nQuantity: " + getQuantity() + "\nWattage: " + getWattage() + 
//            "\nColor: " + getColor() + "\nPrice: " + getPrice() + 
//            "\nCapacity: " + capacity + "\nRoom Type: " + roomType;
// }
}


