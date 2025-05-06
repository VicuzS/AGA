/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo03;

/**
 *
 * @author Usuario
 */
public class CalculadoraRecursiva {

    public int sumar(int a, int b) {
        if (b == 0) return a;
        return sumar(a + 1, b - 1);
    }

    public int restar(int a, int b) {
        if (b == 0) return a;
        return restar(a - 1, b - 1);
    }

    public int multiplicar(int a, int b) {
        if (b == 0) return 0;
        return a + multiplicar(a, b - 1);
    }

    public int dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        if (a < b) return 0;
        return 1 + dividir(a - b, b);
    }
}
/*
sumar:
if (b == 0) return a;
return sumar(a + 1, b - 1);
Número de llamadas recursivas: se realiza una llamada por cada decremento de b hasta llegar a 0.
Complejidad temporal: O(b)
----------------------------------------------------------------------------------------------------
restar(int a, int b)
if (b == 0) return a;
return restar(a - 1, b - 1);
Número de llamadas recursivas: se realiza una llamada por cada decremento de b.
Complejidad temporal: O(b)
------------------------------------------------------------------------------------------
multiplicar(int a, int b)
if (b == 0) return 0;
return a + multiplicar(a, b - 1);
Número de llamadas recursivas: se realiza una llamada por cada decremento de b hasta 0.
Complejidad temporal: O(b)
-----------------------------------------------------------------------------------------
dividir(int a, int b)
if (b == 0) throw new ArithmeticException("División por cero");
if (a < b) return 0;
return 1 + dividir(a - b, b);
Número de llamadas recursivas: se realiza una llamada por cada resta de b a a, hasta que a < b.
Número de iteraciones aproximado: a / b
Complejidad temporal: O(a / b)
*/ 
