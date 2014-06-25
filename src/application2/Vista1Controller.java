package application2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * Controller class for the first vista.
 */
public class Vista1Controller implements Initializable{

    /**
     * Event handler fired when the user requests a new vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void nextPane(ActionEvent event) {
        VistaNavigator.loadVista(VistaNavigator.VISTA_2);
    }
    
    @FXML
    void mainPanel()
    {
    	ControlPantallas.getInstance().gotoMain();
    }
    @FXML
    void vistaDos()
    {
    	ControlPantallas.getInstance().gotoVista2();
    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inicializando Vista 1");
	}

}