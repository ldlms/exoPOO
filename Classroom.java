package exoPOO;

public class Classroom {

	public static void main(String[] args) {
		Wilder jean = new Wilder("jean",true);
		Wilder paul = new Wilder("paul",false);
		Wilder michel = new Wilder("michel",true);
		
		jean.whoAmI();
		paul.whoAmI();
		michel.whoAmI();

	}
}
