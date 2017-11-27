/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_07_05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio_07_05 {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

		int[] Númerosdistintos = new int[10]; // Array of length 10;
		int num; 				// User input
		int contar = 0;			// Number of distinct numbers

		// Prompt the user to enter ten numbers
		System.out.print("Ingresa diez números: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			// Test if num is distinct
			if (isDistinct(Númerosdistintos, num)) {
				Númerosdistintos[contar] = num;
				contar++;	// Increment count
			}
		}

		// Displays the number of distinct numbers and the  
		// distinct numbers separated by exactly one space
		System.out.println("La cantidad de números distintos es " + contar);
		System.out.print("Los números distintos son");
		for (int i = 0; i < Númerosdistintos.length; i++) {
			if (Númerosdistintos[i] > 0)
				System.out.print(" " + Númerosdistintos[i]);
		}
		System.out.println();
	}

	/** Method isDistinct returns true if number is not in array false otherwise */
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}

           
    

