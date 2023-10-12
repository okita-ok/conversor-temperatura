package conversortemperatura;

class Conversor{
    public void celsiusFahrenheit(double celsius){
        double resultado = (celsius*1.8)+32;
        System.out.printf("Temperatura em Fahrenheit: %.1f\n", resultado);
    }
    public void fahrenheitCelsius(double fahrenheit){
        double resultado = (fahrenheit-32)/1.8;
        System.out.printf("Temperatura em Celsius: %.1f\n", resultado);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("teste");

        double celsius = 30.0;
        double fahrenheit = 100.0;

        Conversor conversor = new Conversor();
        conversor.celsiusFahrenheit(celsius);
        conversor.fahrenheitCelsius(fahrenheit);
    }
}