package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        int menuSelection = 0;
        
        while (menuSelection != 1) {
        
        System.out.println("Please select an option from those listed below:\n");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Fahrenheit to Celcius");
        System.out.println("3. Gallons to Liters");
        System.out.println("4. Quit");
        
        int menu = scanner.nextInt();
        
        
        switch (menu) {
        case 1: System.out.println("Insert the inches you want converted to centimeters: ");
        double inch = scanner.nextDouble();
        double cm = inch * 2.54;
        System.out.println(inch + " inch(es) is " + cm + " centimeters.");
        break;
        
        case 2: System.out.println("Insert the temperature in Fahrenheit you want converted to Celsius: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
        break;
        
        case 3: System.out.println("Enter the number of gallons you want converted to liters: ");
        double gallons = scanner.nextDouble();
        double liters = gallons * 3.78541;
        System.out.println(gallons + " gallons is " + liters + " liter(s).");
        break;
        case 4: System.out.println("Goodbye!");
        menuSelection = 1;
        break;
        }
        
        }
        scanner.close();
	}
}
