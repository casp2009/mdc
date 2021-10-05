package com.manoelcampos.tdd;

/**
 * Inclui métodos estáticos para fazer cálculos de propósito geral,
 * como o <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum">MDC</a>.
 * 
 * <p>A implementação do cálculo do MDC seguiu as 
 * <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">propriedades matemáticas</a> 
 * de tal método e o processo de Test Driven Development (TDD).
 * Veja a classe MathUtilMdcTest.</p>
 * 
 * @author Manoel Campos da Silva Filho <http://github.com/manoelcampos>
 */
public class MathUtil {
    /**
     * Construtor privado para evitar que a classe seja instanciada.
     * Uma vez que ela só possui métodos estáticos e não
     * tem atributos, é totalmente desnecessário criar instâncias dela.
     */
    private MathUtil(){}
    
    /**
     * Calcula o MDC de dois números.
     * @param a 1º valor pra calcular o MDC
     * @param b 2º valor pra calcular o MDC
     * @return o MDC calculado
     *
     * @see <a href="https://pt.wikipedia.org/wiki/Máximo_divisor_comum#Propriedades">Propriedades MDC</a>
     */
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        if(b>0 && a % b == 0){
            return b;
        }

        if(b == 0){
            return Math.abs(a);
        }

        return mdc( a - b, b);
    }

    public static int mdc(int ...valores){
        int a = valores[0];
        for(int b : valores){
            a = mdc(a, b);
        }
        return a;
    }

    /**
     * Verifica se um número é primo.
     * Um primo é um número natual maior que 1, que não pode ser formado pela multiplicação
     * de dois números naturais menores.
     *
     * @param numero número a ser testado.
     * @return true se o número for primo, false caso contrário
     *
     * @see <a href="https://pt.wikipedia.org/wiki/Número_primo">Número Primo</a>
     * @see <a href="https://en.wikipedia.org/wiki/Prime_number">Prime Number</a>
     */
    public static boolean isPrimo(final long numero){
        if(numero <= 1){
            return false;
        }

        for(long i = 2; i < numero; i++){
            if(numero%i==0){
                return false;
            }
        }

        return true;
    }
}
