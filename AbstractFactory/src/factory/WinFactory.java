package factory;

import button.CButton;
import button.WinButton;

public class WinFactory implements GUIFactory {

	public CButton createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

}
