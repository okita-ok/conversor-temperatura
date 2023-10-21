package conversortemperatura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste1 {
    private Conversor testeConversor;

    @BeforeEach
    public void setup(){
        testeConversor = new Conversor();
    }

    @Test
    public void testeCF(){
        assertEquals(testeConversor.celsiusFahrenheit(30.0), 86.0, "Valor incorreto");
    }

    @Test
    public void testeFC(){
        assertEquals(testeConversor.fahrenheitCelsius(86.0), 30.0, "Valor incorreto");
    }

}
