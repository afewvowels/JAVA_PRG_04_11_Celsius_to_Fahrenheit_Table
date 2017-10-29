/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_11_celsius_to_fahrenheit_table;

/**
 *
 * @author bluebackdev
 * Write a program that displays a table of the Celsius temperatures 0 through
 * 20 and their Fahrenheit equivalents. The formula for converting a temperature
 * from Celsius to Fahrenheit is
 * 
 *      F = (9/5)C + 32
 * 
 * where F is the Fahrenheit temperature and C is the Celsius temperature. Your
 * program must use a loop to display the table.
 */
public class JAVA_PRG_04_11_Celsius_to_Fahrenheit_Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Constant value for maximum and minimum values to calculate
        final int INT_MIN_TEMP = 0;
        final int INT_MAX_TEMP = 20;
        
        // Integer value for Celsius
        int intCelsius = INT_MIN_TEMP;
        
        // Float value for calculated Fahrenheit values
        float fltFahrenheit;
        
        // Header for table
        System.out.println("Celsius\t\tFahrenheit");
        
        // Loop through and calculate Fahrenheit temperature and increment
        // Celsius value each time through the loop and output to console
        for(int i = INT_MIN_TEMP ; i < INT_MAX_TEMP ; i++)
        {
            fltFahrenheit = (9/5) * (float)intCelsius + 32.0f;
            System.out.println(intCelsius + "\t\t" + fltFahrenheit);
            intCelsius++;
        }
    }
    
}
