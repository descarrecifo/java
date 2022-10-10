package m72_ex_6_David_Escarre;

/*L’usuari/ària ha d’introduir números fins que introdueixi un nombre primer. 

En el moment que l’usuari/ària introdueixi un nombre primer, el programa ha de treure per 
pantalla el següent missatge: "Exacte, el número “x” és primer!" */
	
	
import java.util.Scanner;

public class M72Ex6_David_Escarre {
	
	public static void main (String[] args) {
		
		Scanner inputData = new Scanner (System.in);
		boolean foundPrime = false;
		int numberUser = 0;
		
		System.out.println("Entre an number ");
		
		while(!foundPrime) {
			
			numberUser = inputData.nextInt();
			foundPrime = isPrime(numberUser);
			if (foundPrime) {
				System.out.println("Exacte, el número " + numberUser + " és primer!");
			}
			
		}

	}

	public static boolean isPrime(int numberUser) {
		
		if (numberUser == 0 || numberUser == 1) {
			return false;
		}
		
		for (int i = 2; i < numberUser ; i++) {
			if (numberUser % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	

		
		
		
		
		
		
	
	

}


