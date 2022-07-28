package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class restaTest {
    @Test
    public void testRestar() {
        System.out.println("restar ");
        int numero1 = 5;
        int numero2 = 1;
        resta Resta = new resta();
        int resultadoesperado = 4;
        int resultado = Resta.restar(numero1, numero2);
        assertEquals(resultadoesperado, resultado);

    }
}
