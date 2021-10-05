package com.manoelcampos.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe para inclusão dos testes unitários para
 * os métodos mdc() da classe {@link MathUtil},
 * que calcula o Máximo Divisor Comum de dois ou mais números.
 *
 * <p>Cada teste unitário deve verificar uma determinada propriedade
 * do MDC. Os métodos de teste indicam o número da 
 * <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">propriedade<</a> 
 * testada (como p1) no nome.</p>
 * 
 * @author Manoel Campos da Silva Filho <http://github.com/manoelcampos>
 */
class MathUtilMdcTest {

    @Test
    void mdcP1(){
        int a = 6;
        int b = 3;
        int esperado = 3;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcP2(){
        int a = 16;
        int b = 8;
        int divisor = 4;
        //int esperado = 0;
        int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);

    }

    @Test
    void mdcp3(){
        int a = 15;
        int b = 0;
        int esperado = 15;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcp4(){
        int a = 9;
        int b = 3;
        int m = 2;
        int esperado = 6;
        int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcp5(){
        int a = 7;
        int b = 3;
        int c = 5;
        int esperado = MathUtil.mdc(a*b, c);
        int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcp6(){
        int a = 8;
        int b = 2;
        int esperado = MathUtil.mdc(a, b);
        int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcp7(){
        int a = -12;
        int b = -6;
        int esperado = 6;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    void testMdcMultValor(){
        int a = 30;
        int b = 12;
        int c = 4;
        int esperado = 2;
        int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
}
