package TP3;

public class Moto extends Vehicule{
	
	private int cylindre;
    
	
	public Moto(String modele, int cylindre) {
		super(modele);
		this.cylindre = cylindre;
	}

	public int getCylindre() {
		return cylindre;
	}

	public void setCylindre(int cylindre) {
		this.cylindre = cylindre;
	}
	
	public void affichedetails()
	{
		super.affichedetails();
		System.out.println(cylindre);
        
	}
	
}
