package personnage;

public class Samourai extends Ronin{
	String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonPref, int qttArgent) {
		super(nom, boissonPref, qttArgent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur "+ this.seigneur);
	}
	
	public void boire(String boisson) {
		parler("Qu est ce que je vais choisir comme boisson ? Tiens je vais prendre du "+boisson);
	}
	
	
}
