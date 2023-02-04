/**
 * 
 */
package Exercice3;

import java.util.Scanner;

/**
 * @author digitalci
 *
 */
public class Employe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.print("Veillez entre votre salaire de base ");
		Scanner scanner = new Scanner(System.in);

		double salaireBase = scanner.nextDouble();
		double salaireBrute = 0;
		double HRA = 0, DA = 0;

		if (salaireBase <= 10000) {
			HRA = salaireBase * 0.2;
			DA = salaireBase * 0.8;

		} else if (salaireBase <= 20000) {
			HRA = salaireBase * 0.25;
			DA = salaireBase * 0.9;
			
		} else if (salaireBase > 20000) {
			HRA = salaireBase * 0.3;
			DA = salaireBase * 0.95;
		}
		
		salaireBrute = salaireBase + (HRA + DA);
		System.out.println("Salaire de base : " + salaireBase);
		System.out.println("Salaire brut : " + salaireBrute);

	}

}
