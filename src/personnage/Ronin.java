package personnage;

public class Ronin extends Humain{
	private int honneur;
	
	public Ronin(String nom, String boissonPref, int qttArgent) {
		super(nom, boissonPref, qttArgent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int sommeADonner = getQttArgent()/10;
		this.parler(beneficiaire.getNom() +" prend ces "+ sommeADonner + " sous.");
		beneficiaire.recevoir(sommeADonner);
		setQttArgent(getQttArgent()- sommeADonner);
	}
}
