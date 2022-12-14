package personnage;

public class Commercant extends Humain {
	
	public Commercant(String nom, int qttArgent) {
		super(nom, "the", qttArgent);
	}
	
	public int seFaireExtorquer() {
		int argentDebut = getQttArgent();
		super.parler("J'ai tout perdu! Le monde est trop injuste...");
		this.setQttArgent(0);
		return argentDebut;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler(argent+ " sous! Je te remercie genereux donateur!");
	}

}
