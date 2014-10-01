package application;

import factory.GUIFactory;
import button.CButton;

public class ButtonService {

	public ButtonService(GUIFactory factory){
		CButton button =factory.createButton();
		button.paint();
	}
}
