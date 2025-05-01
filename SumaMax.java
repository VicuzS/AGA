/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aga_g3;

/**
 *
 * @author Usuario
 */
public class SumaMax {

    public static void main(String[] args) {
        int[] arr = { -4, 11, -8, 5, -2, 5, 9, -1, 1 };

        Result result = maxSubarraySumBruta(arr);

        System.out.println("La suma maxima es: " + result.maxSum);
        System.out.println("Subarreglo desde indice " + result.comienzo + " hasta " + result.fin);
    }

    static class Result {
        int maxSum;
        int comienzo;
        int fin;

        Result(int maxSum, int start, int end) {
            this.maxSum = maxSum;
            this.comienzo = start;
            this.fin = end;
        }
    }

    static Result maxSubarraySumBruta(int[] arr) {
        int maxSum = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }

        return new Result(maxSum, start, end);
    }
}

