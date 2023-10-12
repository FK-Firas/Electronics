# Electronics
This Java program is designed to model and represent various types of electronics equipment, including computers, cell phones, pagers, and digital cameras, through a set of classes. 
The program's primary objective is to encapsulate essential attributes of electronics, such as their weight, cost, power usage, and manufacturer names, within these classes. 
Additionally, each class includes methods with appropriately named actions that allow for displaying information about the electronics.

Here's a breakdown of the program's key components:

Base Class - Electronics: This serves as the foundational class that contains common attributes shared by all electronic devices, including manufacturer, weight, cost, and power usage. 
It also features a method displayInfo() that prints out detailed information about the electronics.

Subclasses - Computer, CellPhone, etc.: These are specialized classes that inherit from the Electronics base class. 
Each subclass represents a specific type of electronic device (e.g., computer or cell phone) and includes additional attributes unique to that type of device. 
The subclasses override the displayInfo() method to include information specific to their type.

Main Driver Class - ElectronicsMain: This class contains the main method and serves as the entry point for the program. 
In the main method, instances of different electronic devices (e.g., computers and cell phones) are created and exercised by invoking their displayInfo() methods, which display detailed information about each device.

Overall, this program provides a clear and object-oriented way to model electronic devices, allowing for easy extension to accommodate new types of electronics by creating additional subclasses. 
It demonstrates fundamental concepts of object-oriented programming, including inheritance, encapsulation, and method overriding.
