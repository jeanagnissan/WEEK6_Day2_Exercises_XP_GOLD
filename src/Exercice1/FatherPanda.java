package Exercice1;

public class FatherPanda {

	private boolean isPredator;
	protected int weight = 89;
	private int age = 57;

	public FatherPanda() {
		super();
	}

	public static void main(String[] args) {
		eat();
	}
	
	public static void eat() {
		FatherPanda fatherPanda = new FatherPanda();
		System.out.println("Après chaque repas, Père Panda prend du poids : " + fatherPanda.weight);
		System.out.println("Et son âge est : " + fatherPanda.age);
	}


}
