package JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sumaTest {
    @Test
    public void testSumar() {

        System.out.println("sumar");
        int numero1 = 1;
        int numero2 = 2;
        suma instance = new suma();
        int resultadoesperado = 3;
        int resultadotest = instance.sumar(numero1, numero2);
        assertEquals(resultadoesperado, resultadotest);
    }
}
