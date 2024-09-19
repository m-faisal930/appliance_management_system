package src;



public class Refrigerator extends Appliance {
 private int numberOfDoors;
 private int height;
 private int width;

 public Refrigerator(String itemNumber, String brand, int quantity, int wattage, String color, double price, int numberOfDoors, int height, int width) {
     super(itemNumber, brand, quantity, wattage, color, price);
     this.numberOfDoors = numberOfDoors;
     this.height = height;
     this.width = width;
 }
 
 
 public int getnumberOfDoors() { return numberOfDoors; }
 public int getheight() { return height; }
 public int getwidth() { return width; }
 
 @Override
 public String getData() {
     String doorsDescription = switch (getnumberOfDoors()) {
         case 2 -> "Double Doors";
         case 3 -> "Three Doors";
         case 4 -> "Four Doors";
         default -> "Unknown number of doors";
     };
     
     return "******** Refrigerator Details: ********\n" +
            "Item Number: " + getItemNumber() + "\n" +
            "Brand: " + getBrand() + "\n" +
            "Quantity: " + getQuantity() + "\n" +
            "Wattage: " + getWattage() + " Watts\n" +
            "Color: " + getColor() + "\n" +
            "Price: $" + getPrice() + "\n" +
            "Number of Doors: " + getnumberOfDoors() + "\n" +
            "Height: " + getheight() + " inches\n" +
            "Width: " + getwidth() + " inches";
 }

 
// @Override
// public String getData() {
//     return getItemNumber() + ";" + getBrand() + ";" + getQuantity() + ";" +
//    		 getWattage() + ";" + getColor() + ";" + getPrice() + ";" + 
//    		 getnumberOfDoors() + ";" + getheight() + ";" + getwidth();
// }
 
 
 @Override
 public String toString() {
     return String.format("%s;%s;%d;%d;%s;%.2f;%d;%d;%d", 
         getItemNumber(), 
         getBrand(), 
         getQuantity(), 
         getWattage(), 
         getColor(), 
         getPrice(), 
         getnumberOfDoors(), 
         getheight(), 
         getwidth());
 }
 
 
 
//
// @Override
// public String toString() {
//     return "Item Number: " + getItemNumber() + "\nBrand: " + getBrand() +
//            "\nQuantity: " + getQuantity() + "\nWattage: " + getWattage() + 
//            "\nColor: " + getColor() + "\nPrice: " + getPrice() + 
//            "\nNumber of Doors: " + numberOfDoors + "\nHeight: " + height + 
//            "\nWidth: " + width;
// }
}



