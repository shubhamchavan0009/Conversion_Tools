import java.awt.Button;
import java.util.Scanner;

import javax.swing.JFrame;
public class TemperatureConversion {

	public static void main(String[] args) {
		//Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Create two text fields.
        System.out.println("Enter the temperature in Fahrenheit: ");
        String fahrenheitInput = scanner.nextLine();

        System.out.println("Enter the temperature in Celsius: ");
        String celsiusInput = scanner.nextLine();

        // Create a button to convert the temperature.
        Button convertButton = new Button("Convert");
        convertButton.addActionListener(e -> {
            // Convert the temperature.
            double fahrenheit = Double.parseDouble(fahrenheitInput);
            double celsius = (fahrenheit - 32) * 5 / 9;

            // Display the converted temperature.
            System.out.println("The converted temperature is: " + celsius);
        });

        // Add the button to the window.
        JFrame frame = new JFrame("Temperature Converter");
        frame.add(convertButton);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}

