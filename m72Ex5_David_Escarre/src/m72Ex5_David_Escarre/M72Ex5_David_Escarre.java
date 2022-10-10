package m72Ex5_David_Escarre;

import java.util.Scanner;

/*L’usuari/ària introdueix un nombre per teclat i el programa crida a
un mètode que indiqui si el número és primer o no. */

// Los números primos son aquellos que solo, muy importante, solo son divisibles
//(al dividirse entre otro da un número entero) entre ellos mismos y el 1.

public class M72Ex5_David_Escarre {

	public static void main(String[] args) {

		Scanner inputData = new Scanner(System.in);
		int numberUser = 0;
		boolean result = false;

		System.out.println("Enter an number ");
		numberUser = inputData.nextInt();

		result = isPrime(numberUser);
		
		if (result) {
			System.out.println("SI és primer");
		} else {
			System.out.println("NO és primer");
		}

		

	}

	public static boolean isPrime(int numberUser) {

		if (numberUser == 0 || numberUser == 1) {
			return false;
		}

		for (int i = 2; i < numberUser; i++) {
			if (numberUser % i == 0)
				return false;
		}

		return true;

	}

}