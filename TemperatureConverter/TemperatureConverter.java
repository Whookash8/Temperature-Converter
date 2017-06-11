package TemperatureConverter;

import java.util.Scanner;

/**
 * Created by Łukasz on 2017-06-11.
 */
public class TemperatureConverter {

    public static void main(String[] args){
        Temperature temperature = new Temperature(0, 0, 0);
        Scanner load = new Scanner(System.in);

        System.out.println("Select input temperature scale:\n" +
                "1) Celsius\n" +
                "2) Fahrenheit\n" +
                "3) Kelvin");

        int select = load.nextInt();

        System.out.println("Insert your temperature:");
        float givenTemperature = load.nextFloat();

        switch (select){
            case 1:
                temperature = Temperature.createCelsius(givenTemperature);
                break;
            case 2:
                temperature = Temperature.createFahrenheit(givenTemperature);
                 break;
            case 3:
                temperature = Temperature.createKelvin(givenTemperature);
                 break;
        }

        System.out.println("Select scale to which you wish get your temperature converted:\n" +
                "1) Celsius\n" +
                "2) Fahrenheit\n" +
                "3) Kelvin");
        select = load.nextInt();

        switch (select){
            case 1:
                TemperatureConverter.convertToCelsius(temperature);
                break;
            case 2:
                TemperatureConverter.convertToFahrenheit(temperature);
                break;
            case 3:
                TemperatureConverter.convertToKelvin(temperature);
                break;
        }
    }

    public static void convertToCelsius(Temperature temperature){
        System.out.println(temperature.getCelsius());
    }

    public static void convertToFahrenheit(Temperature temperature){
        System.out.println(temperature.getFahrenheit());
    }

    public static void convertToKelvin(Temperature temperature){
        System.out.println(temperature.getKelvin());
    }
}
