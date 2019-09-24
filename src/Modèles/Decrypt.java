package Modèles;

public class Decrypt {
	String decrypt(String data, String key) {
		String chaineCryptee = "";
	    for(int i = 0, j = 0; i < data.length(); i++)
	    {
	        chaineCryptee += (char)((int)data.charAt(i) ^ (int)key.charAt(j));
	        j++;
	        if(j >= key.length()) j = 0;
	    }
	    return chaineCryptee;
	}
}
