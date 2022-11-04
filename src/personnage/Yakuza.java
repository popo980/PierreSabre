package personnage;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	
	public Yakuza(String nom, String boissonPref, int qttArgent, String clan) {
		super(nom, boissonPref, qttArgent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		this.parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		this.gagnerArgent(argentVole);
		this.reputation++;
		this.parler("J'ai piqué les "+ argentVole + " sous de "+ victime.getNom()+ ", ce qui me fait"
				+ this.getQttArgent() + " sous dans ma poche. Hi! Hi!");
	}
	
	public int perdre() {
		int argentPerdu = this.getQttArgent();
		this.parler("J'ai perdu mon duel et mes "+ argentPerdu+" sous, snif"
				+ "... J'ai deshonore le clan de "+ this.clan);
		this.setQttArgent(0);
		this.reputation--;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		this.parler("Ce ronin pensait vraiment battre "+ this.getNom()+ " du clan de "+ this.clan 
				+"? Je l'ai depouille de ses "+ gain+ " sous.");
		this.gagnerArgent(gain);
		this.reputation++;
	}
	
}
