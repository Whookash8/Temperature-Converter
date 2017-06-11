package TemperatureConverter;

/**
 * Created by Łukasz on 2017-06-11.
 */
public class Temperature {
    private float celsius;
    private float fahrenheit;
    private float kelvin;

    public Temperature(float celsius, float fahrenheit, float kelvin){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    public static Temperature createCelsius(float degrees){
        float k = degrees + 273.15f;
        float f = degrees * 1.8f + 32;
        return new Temperature(degrees, f, k);
    }

    public static Temperature createFahrenheit(float degrees){
        float k = degrees + 459.67f * 5f/9f;
        float c = (degrees  - 32) * 5f/9f;
        return new Temperature(c, degrees, k);
    }

    public static Temperature createKelvin(float degrees){
        float c = degrees - 273.15f;
        float f = degrees * 9f/5f - 459.67f;
        return new Temperature(c, f, degrees);
    }

    public float getCelsius(){
        return this.celsius;
    }

    public float getFahrenheit(){
        return this.fahrenheit;
    }

    public float getKelvin(){
        return this.kelvin;
    }
}
