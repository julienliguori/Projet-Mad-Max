package Contrôleurs;

import java.io.IOException;
import java.nio.file.Files;

import Modèles.Fichier;

public class wkf_decrypt {

	Boolean pcs_decrypter(String source_path, String destination_path) throws IOException {
		// TODO Auto-generated method stub
		Fichier o1;
		String reponse;
		
		o1 = new Fichier();
		o1.setData("C:\\Users\\julien liguori\\Desktop\\fichier\\a.txt", "Bonjour a tous. Ca va ?");
		
		reponse = o1.getData("C:\\\\Users\\\\julien liguori\\\\Desktop\\\\fichier\\\\a.txt");
		System.out.println(reponse);
		
		reponse = o1.crypter(reponse, "adhyudertjutl");
		System.out.println(reponse);
		o1.setData("C:\\\\Users\\\\julien liguori\\\\Desktop\\\\fichier\\\\b.txt", reponse);
		
		reponse = o1.getData("C:\\\\Users\\\\julien liguori\\\\Desktop\\\\fichier\\\\b.txt");
		reponse = o1.crypter(reponse, "adhyudertjutl");
		o1.setData("C:\\\\Users\\\\julien liguori\\\\Desktop\\\\fichier\\\\c.txt", reponse);
		System.out.println(reponse);
		
		System.out.println("Terminé");
		return true;
	}
}
