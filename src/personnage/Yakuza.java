package personnage;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;
	
	public Yakuza(String nom, String boissonPref, int qttArgent, String clan) {
		super(nom, boissonPref, qttArgent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		this.parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse !");
		int argentVole = victime.seFaireExtorquer();
		setQttArgent(argentVole+ getQttArgent());
		this.reputation++;
		this.parler("J'ai piqué les "+ argentVole + " sous de "+ victime.getNom()+ ", ce qui me fait"
				+ this.getQttArgent() + " sous dans ma poche. Hi! Hi!");
	}
	
	
}
