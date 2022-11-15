package histoire;
import personnage.Commercant;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Ronin roro = new Ronin("Roro", "shoshu", 60);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Whisky", 30 , "Warsong");

		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yakuLeNoir);

		
//_______________________________________________________ premier test
//		Humain prof = new Humain("Prof", "kombucha", 54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
	}
}
