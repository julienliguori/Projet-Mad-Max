package Modèles;

public class Decrypt {
	static String crypt(String data, String key) {
		String chaineCryptee = "";
	    for(int i = 0, j = 0; i < data.length(); i++)
	    {
	        chaineCryptee += (char)((int)data.charAt(i) ^ (int)key.charAt(j));
	        System.out.println((int)key.charAt(j)); 
	        j++;
	        if(j >= key.length()) j = 0;
	    }
	    return chaineCryptee;
	}
	static String decrypt(String data) {
		String chaineCryptee = "";
		for(int a = 0; a < 128; a++) {
			System.out.println("a : " + a);
			for(int b = 0; b < 128; b++) {
				for(int c = 0; c < 128; c++) {
					for(int d = 0; d < 128; d++) {
						
					    for(int i = 0, j = 0; i < data.length(); i++){
					    	if(j==0) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ a);
					    	}else if(j==1) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ b);
					    	}
					        j++;
					        if(j >= 2) j = 0;
					    }
					    
					    if (a == 109) {
				        	if (b == 112) {
				        		if (c == 99) {
				        			if (d == 100) {
				        				chaineCryptee += "JULIEN";
				        				}
				        			}
				        		}
				        	}
					    
				        }
					}
				}
			}chaineCryptee += "\n"; 
		return chaineCryptee;
	}
	
	/*//////////   Version 27 Letters   //////////*/ 
	
	static String decryptV27(String data, String attente) {
		String chaineCryptee = "";
		for(int a = 97; a < 122; a++) {
			for(int b = 97; b < 122; b++) {
				for(int c = 97; c < 122; c++) {
					for(int d = 97; d < 122; d++) {
			//			System.out.println("a : " + a + " b : " + b + " c : " + c + " d : " + d);
					    for(int i = 0, j = 0; i < data.length(); i++){
					    	if(j==0) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ a);
					    	}else if(j==1) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ b);
					    	}else if(j==2) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ c);
					    	}else if(j==3) {
					    		chaineCryptee += (char)((int)data.charAt(i) ^ d);
					    	}
					        j++;
					        if(j >= 4) j = 0;
					    }
					    
					    chaineCryptee += "\n"; 
				        	if (chaineCryptee.contains(attente)) {
				        		a = 122;
				        		b = 122;
				        		c = 122;
				        		d = 121;
				        	}
					    
				        }
					}
				}
			}
		
		return chaineCryptee;
	}
}
