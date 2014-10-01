package factory;

import button.CButton;
import button.OSXButton;

public class OSXFactory implements GUIFactory {

	public CButton createButton() {
		// TODO Auto-generated method stub
		return new OSXButton();
	}

}
