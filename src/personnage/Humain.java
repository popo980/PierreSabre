package personnage;

public class Humain {
	private String boissonPref;
	private int qttArgent;
	private String nom;
	protected int nbConnaissances;
	protected Humain[] connaissances;
	
	public Humain(String nom, String boissonPref, int qttArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.qttArgent = qttArgent;
		this.nbConnaissances = 0;
		this.connaissances = new Humain[30];
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
	
	protected void gagnerArgent(int somme) {
		this.qttArgent += somme;
	}
	
	protected void perdreArgent(int somme) {
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
	
	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
		humain.repondre(this);
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		int maxHumain=30;
		if (this.nbConnaissances<maxHumain) {
			this.connaissances[this.nbConnaissances] = humain;
			this.nbConnaissances++;
		}else {
			for (int i=0; i<maxHumain-1; i++) {
				this.connaissances[i] = this.connaissances[i+1];
			}
		this.connaissances[maxHumain-1] = humain;

		}
	}
	
	
	public void listerConnaissance() {
		String texte ="Je connais beaucoup de monde dont :";
		for (int i=0; i<this.nbConnaissances; i++) {
			texte += " " +  this.connaissances[i].getNom();
			if (i!=this.nbConnaissances-1) {
				texte += ",";
			}
		}
		this.parler(texte);
	}
	
}
