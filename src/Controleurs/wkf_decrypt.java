package Controleurs;

import java.io.IOException;
import java.nio.file.Files;

import Modeles.Fichier;

public class wkf_decrypt {

	static Boolean pcs_decrypter() {
		// TODO Auto-generated method stub
		Fichier o1;
		String reponse;
		try {
			o1 = new Fichier();
			o1.setData(".Projet Mad Max\\Source.txt", "hello word");
			
			reponse = o1.getData(".Projet Mad Max\\Source.txt");
			System.out.println(reponse);
			
			reponse = o1.crypter(reponse, "aaaa");
			System.out.println(reponse);
			o1.setData(".Projet Mad Max\\Test.txt", reponse);
			
			reponse = o1.getData(".Projet Mad Max\\Test.txt");
			reponse = o1.decrypter(reponse, "hello");
			o1.setData(".Projet Mad Max\\Resultat.txt", reponse);
			System.out.println(reponse);
			
			System.out.println("Termin�");
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
