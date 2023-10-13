package conversortemperatura;

public class Conversor{
    public double celsiusFahrenheit(double celsius){
        double resultado = (celsius*1.8)+32;
        //System.out.printf("Temperatura em Fahrenheit: %.1f\n", resultado);
        return resultado;
    }
    public double fahrenheitCelsius(double fahrenheit){
        double resultado = (fahrenheit-32)/1.8;
        //System.out.printf("Temperatura em Celsius: %.1f\n", resultado);
        return resultado;
    }
}
