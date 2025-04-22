package TP3;

public class Voiture extends Vehicule{
	
	private int nombreportes;

	
	public Voiture(String modele, int nombreportes) {
		super(modele);
		this.nombreportes = nombreportes;
	}

	public int getNombreportes() {
		return nombreportes;
	}

	public void setNombreportes(int nombreportes) {
		this.nombreportes = nombreportes;
	}
	
	public void affichedetails()
	{
		super.affichedetails();
		System.out.println(nombreportes);
        
	}
	
}
