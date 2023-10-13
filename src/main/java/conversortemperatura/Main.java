package conversortemperatura;

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