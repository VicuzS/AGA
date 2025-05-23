/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo04;

/**
 *
 * @author Usuario
 */
import java.util.Stack;

public class recursividad {

    public static int ackermann(int m, int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(m);

        while (!stack.isEmpty()) {
            m = stack.pop();

            if (m == 0) {
                n = n + 1;
            } else if (n == 0) {
                stack.push(m - 1);
                n = 1;
            } else {
                stack.push(m - 1);
                stack.push(m);
                n = n - 1;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int resultado = ackermann(m, n);
        System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
    }
}

/*
Complejidad Temporal :

- La función Ackermann crece extremadamente rapido. 
- Para valores pequeños de m y n, se puede calcular sin problemas.

Ejemplos:
  A(0, n) = n + 1          → O(1)
  A(1, n) = n + 2          → O(n)
  A(2, n) = 2n + 3         → O(n)
  A(3, n) = 2^(n + 3) - 3  → O(2^n)
  A(4, 1) = 65533          → Inmenso número de pasos

Notación Asintótica:
    Ω(2^(2^(...)))   → Torre de exponentes de altura n
    (también llamada función hiperbólica o no acotada)

Por lo tanto:
  - Notación: Ω(2^^n) 
*/
