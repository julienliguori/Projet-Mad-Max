package Modèles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Fichier {
	public Fichier() {
		String file = new String();
	}
	
	public String getData(String path) {
		String ligne = "";
		try{
			InputStream flux=new FileInputStream(path); 
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			while ((ligne=buff.readLine())!=null){
				return ligne;
			}
			buff.close(); 
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}
		return ligne;
	}
	public void setData(String path, String texte) throws IOException {
		FileWriter fichier = new FileWriter(path);
	    fichier.write (texte);
	    fichier.close();
	}
	
	public String crypter(String texte, String key) {
		return Decrypt.crypt(texte,key);
	}
	public String decrypter(String texte) {
		return Decrypt.decryptV27(texte);
	}
}
