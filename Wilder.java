package exoPOO;

public class Wilder {

	private String name;
	private boolean aware;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

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
