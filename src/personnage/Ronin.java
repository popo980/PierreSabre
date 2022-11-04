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
		this.perdreArgent(sommeADonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur*2;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as"
				+" fait à ce pauvre marchand!");
		
		if (force>=adversaire.getReputation()) {
			//gagner !!!!
			this.honneur++;
			this.parler("Je t’ai eu petit yakusa!");
			int sommeRecup = adversaire.perdre();
			this.gagnerArgent(sommeRecup);
			
		}else {
			//perdre !!!!
			adversaire.gagner(this.getQttArgent());
			this.parler("J'ai perdu contre ce yakuza, mon"
					+" honneur et ma bourse ont en pris un coup.");
			this.honneur--;
			this.setQttArgent(0);
		}
	}
}
