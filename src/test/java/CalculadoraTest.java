import static org.junit.jupiter.api.Assertions.assertEquals;

import org.calculadora.maven.Calculadora;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {
    @Test
    public void testSumar(){
        Calculadora Calculadora = new Calculadora();
        assertEquals(5, Calculadora.sumar(2,3), "El resultado de la suma de: 5");
        assertEquals(0, Calculadora.restar(-1,1), "El resultado de la suma de:  0");

    }

    public void testRestar(){
        Calculadora Calculadora = new Calculadora();
        assertEquals(3, Calculadora.restar(5,2), "El resultado de la resta es : 3");
        assertEquals(-2, Calculadora.restar(3,5), "El resultado de la resta es : -2");
    }
}
