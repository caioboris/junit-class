
import Calculadora.Calculadora;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculadoraTeste {

    private Calculadora calc;

    @Before
    public void setUp() throws Exception{
        int valor1Default = 5;
        int valor2Default = 7;

        calc = new Calculadora(valor1Default, valor2Default);
    }

    @Test
    public void testeSomar29com23(){
        calc.setValor1(29);
        calc.setValor2(23);
        assertEquals(calc.soma(), 52);
    }

    @Test
    public void testeSubtrair29de23(){
        calc.setValor1(29);
        calc.setValor2(23);
        assertEquals(calc.subtracao(), -6);
    }

    @Test
    public void TesteSubtrair2de5(){
        calc.setValor1(2);
        calc.setValor2(5);
        assertEquals(calc.subtracao(), 3);
    }

    @Test
    public void TesteDividir5por2(){
        calc.setValor1(5);
        calc.setValor2(2);
        assertEquals(calc.divisao(), 2.5,0.5);
    }

    @Test
    public void TesteDividir8por3(){
        calc.setValor1(8);
        calc.setValor2(3);
        assertEquals(calc.divisao(), 2.66,0.67);
    }

    @Test
    public void TesteDividir3Por0(){
        calc.setValor1(3);
        calc.setValor2(0);
        assertThrows(calc.divisao(), 0,0.0);
    }



}
