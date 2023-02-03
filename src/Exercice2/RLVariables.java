package Exercice2;

public class RLVariables {

	private int mySecretNumber = 10;

	public static void main(String[] args) {
		 RLVariables secret =  new RLVariables();
		 RLVariables notSoPrivate = new RLVariables();
		
		 System.out.println("Variable de référence accédant à la variable d'instance : " + secret.mySecretNumber);
		 secret.mySecretNumber = 45;
		 notSoPrivate.displaySecret();
		 System.out.println("Variable de référence accédant à la variable d'instance qui pointe vers la variable locale : " + secret.mySecretNumber);
	}
	
	public void displaySecret() {
		this.mySecretNumber = 45;
		System.out.println("Variable locale : " + this.mySecretNumber);
	}

}
