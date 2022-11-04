package histoire;
import personnage.Commercant;
import personnage.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Whisky", 30 , "Warsong");
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);

//______________________________________________________ deuxieme test		
//		Commercant marco = new Commercant("Marco", 20);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
//		
//_______________________________________________________ premier test
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
	}
}
