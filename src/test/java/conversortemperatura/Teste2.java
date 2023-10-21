package conversortemperatura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste2 {
    private Conversor testeConversor;

    @BeforeEach
    public void setup(){
        testeConversor = new Conversor();
    }

    @Test
    public void testeCF(){
        assertEquals(testeConversor.celsiusFahrenheit(0.0), 32.0, "Valor incorreto");
    }

    @Test
    public void testeFC(){
        assertEquals(testeConversor.fahrenheitCelsius(212.0), 100.0, "Valor incorreto");
    }

}
