# Modern Appliances Management System

## Project Overview
This Java-based console application allows users to manage and explore various home appliances. It supports loading appliance data, filtering by appliance type, brand, or attributes, and randomly selecting appliances. Users can also save appliance information to a file.

## Features
- **Load Appliances**: Load appliance data from a text file.
- **Search Appliances**: 
  - By type (Refrigerators, Vacuums, Microwaves, Dishwashers).
  - By brand.
  - Filter by specific attributes (e.g., number of doors for refrigerators, battery voltage for vacuums).
- **Random Appliance Selection**: Display a random list of appliances.
- **Save and Exit**: Save the current appliance list to a file.

## How to Run
1. Clone or download the repository.
2. Compile the project using a Java IDE or command line.
3. Ensure the `appliances.txt` file is in the correct location (contains the appliance data).
4. Run the `Main` class from the console or your IDE.
5. Follow the menu prompts to interact with the system.

## File Structure
- **ApplianceManager.java**: Manages loading, saving, and searching appliances.
- **Main.java**: User interface for interacting with the system.
- **Appliance.java**: Base class for all appliance types.
- **Subclasses**: (Refrigerator, Vacuum, Microwave, Dishwasher) handle specific appliance details.

## Requirements
- Java 8+
- Text file containing appliance data (`appliances.txt`).

## Appliance Data Format
Each line in `appliances.txt` should be structured as:

ItemNumber;Brand;Quantity;Wattage;Color;Price;Attribute1;Attribute2;Attribute3


## Author
Muhammad Faisal
