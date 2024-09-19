package src;



public class Dishwasher extends Appliance {
 private String feature;
 private String soundRating;

 public Dishwasher(String itemNumber, String brand, int quantity, int wattage, String color, double price, String feature, String soundRating) {
     super(itemNumber, brand, quantity, wattage, color, price);
     this.feature = feature;
     this.soundRating = soundRating;
 }
 
 public String getfeature() { return feature; }
 public String getsoundRating() { return soundRating; }
 
 @Override
 public String getData() {
     String soundRatingDescription = switch (getsoundRating()) {
         case "Qt" -> "Quietest";
         case "Qr" -> "Quieter";
         case "Qu" -> "Quiet";
         case "M" -> "Moderate";
         default -> "Unknown sound rating";
     };
     
     return "******** Dishwasher Details: ********\n" +
            "Item Number: " + getItemNumber() + "\n" +
            "Brand: " + getBrand() + "\n" +
            "Quantity: " + getQuantity() + "\n" +
            "Wattage: " + getWattage() + " Watts\n" +
            "Color: " + getColor() + "\n" +
            "Price: $" + getPrice() + "\n" +
            "Feature: " + getfeature() + "\n" +
            "Sound Rating: " + getsoundRating();
 }

 
// @Override
// public String getData() {
//     return getItemNumber() + ";" + getBrand() + ";" + getQuantity() + ";" +
//    		 getWattage() + ";" + getColor() + ";" + getPrice() + ";" + 
//    		 getfeature() + ";" + getsoundRating();
// }
 
 
 @Override
 public String toString() {
     return String.format("%s;%s;%d;%d;%s;%.2f;%s;%s", 
         getItemNumber(), 
         getBrand(), 
         getQuantity(), 
         getWattage(), 
         getColor(), 
         getPrice(), 
         getfeature(),
         getsoundRating());
 }
 
// 
// @Override
// public String toString() {
//     return "Item Number: " + getItemNumber() + "\nBrand: " + getBrand() +
//            "\nQuantity: " + getQuantity() + "\nWattage: " + getWattage() + 
//            "\nColor: " + getColor() + "\nPrice: " + getPrice() + 
//            "\nFeature: " + feature + "\nSound Rating: " + soundRating;
// }
}

