package Exercice1;

public class FatherPanda {

	private boolean isPredator;
	protected int weight = 89;
	private int age = 57;


	public FatherPanda() {
		super();
	}

	public static void main(String[] args) {
		new FatherPanda().eat();
	}
	
	public static void eat() {
		System.out.println("Après chaque repas, Père Panda prend du poids : " + this.weight);
		System.out.println("Et son âge est : " + this.age);
	}


}
