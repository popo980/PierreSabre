package personnage;

public class Humain {
	private String boissonPref;
	private int qttArgent;
	private String nom;
	
	public Humain(String nom, String boissonPref, int qttArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.qttArgent = qttArgent;
	}
	
	protected void parler(String texte) {
		System.out.println('('+this.nom+") - "+ texte);
	}
	
	public String getBoissonPref() {
		return boissonPref;
	}
	public String getNom() {
		return nom;
	}
	public int getQttArgent() {
		return qttArgent;
	}
	public void setBoissonPref(String boissonPref) {
		this.boissonPref = boissonPref;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setQttArgent(int qttArgent) {
		this.qttArgent = qttArgent;
	}
	
	public void direBonjour() {
		parler("Bonjour, je m'appelle "+ this.nom + " et j'aime boire du "+this.boissonPref);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ this.boissonPref+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int somme) {
		this.qttArgent += somme;
	}
	
	public void perdreArgent(int somme) {
		this.qttArgent -= somme;
	}
	
	public void acheter(String bien, int prix) {
		if (qttArgent>prix) {
			parler("J'ai "+ qttArgent + " sous en poche. Je vais pouvoir m'acheter "+ bien
					+" a "+ prix+ " sous");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que "+ qttArgent+ " sous en poche. Je ne peux meme pas m'offrir"
					+bien + " a "+ prix+ " sous");
			 
		}
		
	}
}
