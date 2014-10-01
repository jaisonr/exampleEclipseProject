package client;

import factory.*;
import application.ButtonService;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonService(createUserButton());
	}

	private static GUIFactory createUserButton() {
		// TODO Auto-generated method stub
		return new OSXFactory();
	}

}
