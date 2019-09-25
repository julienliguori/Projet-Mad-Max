package Modeles;

public class Map_P {
public	String selectlDbyLoginPassword(String login, String password) {
		return "SELECT * FROM `users` where `username` = '" + login + "' AND `password` = '" + password + "';" ;
		
	}
}
