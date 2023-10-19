package conversortemperatura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste3 {
    private Conversor testeConversor;

    @BeforeEach
    public void setup(){
        testeConversor = new Conversor();
    }

    @Test
    public void testeCF(){
        assertEquals(testeConversor.celsiusFahrenheit(-30.0), -21.0, "Valor incorreto");
    }

    @Test
    public void testeFC(){
        assertEquals(testeConversor.fahrenheitCelsius(-40.0), -41.0, "Valor incorreto");
    }

}
