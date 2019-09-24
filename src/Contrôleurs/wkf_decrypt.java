package Contrôleurs;

import java.io.IOException;
import java.nio.file.Files;

import Modèles.Fichier;

public class wkf_decrypt {

	static Boolean pcs_decrypter() {
		// TODO Auto-generated method stub
		Fichier o1;
		String reponse;
		try {
			o1 = new Fichier();
			o1.setData("C:\\Users\\julien liguori\\eclipse-workspace\\Projet Mad Max\\Source.txt", "j'ai faim");
			
			reponse = o1.getData("C:\\Users\\julien liguori\\eclipse-workspace\\Projet Mad Max\\Source.txt");
			System.out.println(reponse);
			
			reponse = o1.crypter(reponse, "adhyudertjutl");
			System.out.println(reponse);
			o1.setData("C:\\Users\\julien liguori\\eclipse-workspace\\Projet Mad Max\\Test.txt", reponse);
			
			reponse = o1.getData("C:\\Users\\julien liguori\\eclipse-workspace\\Projet Mad Max\\Test.txt");
			reponse = o1.crypter(reponse, "adhyudertjutl");
			o1.setData("C:\\Users\\julien liguori\\eclipse-workspace\\Projet Mad Max\\Resultat.txt", reponse);
			System.out.println(reponse);
			
			System.out.println("Terminé");
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
