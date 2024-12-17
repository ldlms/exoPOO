package exoPOO;

public class Wilder {

	public String name;
	public boolean aware;
	
	public Wilder(String name,boolean aware) {
		this.name = name;
		this.aware = aware;
	}
	
	public void whoAmI() {
		if(this.aware == true) {
		System.out.print("Je m'apelle " + this.name + " et je suis aware \n" );
		}else {
			System.out.print("Je m'apelle " + this.name + " et je ne suis pas aware \n" );	
		}
	}
}
