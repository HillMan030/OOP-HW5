package fcu.iecs.oop.pokemon;

public class Pokemon {
	public static String name;
	public int cp;
	
	
	public Pokemon(String name, int cp) {
		super();
		this.name = name;
		this.cp = cp;
	}


	public static void main(String[] args) {
		
		
	}


	public String getName() {
		return name;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}

	
}
