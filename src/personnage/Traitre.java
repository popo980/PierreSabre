package personnage;

public class Traitre extends Samourai {
	private int niveauTraitrise;
	
	public Traitre(String seigneur, String nom, String boissonPref, int qttArgent) {
		super(seigneur, nom, boissonPref, qttArgent);
		this.niveauTraitrise = 0;
		}
	
	public void ranconner(Commercant commercant) {
		if (this.niveauTraitrise<=3) {
			int rancon = (commercant.getQttArgent()/10)*2;
			commercant.perdreArgent(rancon);
			this.gagnerArgent(rancon);
			this.niveauTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !\n"
					+"Donne-moi "+ rancon+" sous ou gare a toi !");
			commercant.parler("Tout de suite grand " + this.getNom());
		}
		else {
			parler("Mince je ne peux plus ranconner personne"
					+" sinon un samourai risque de me demasquer !");
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traitre et mon niveau de"
				+" traitrise est: "+ this.niveauTraitrise+". Chut !");
	}

}
