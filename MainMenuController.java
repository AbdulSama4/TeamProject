package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

	public class MainMenuController {

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private AnchorPane mainMenu;

	    @FXML
	    void initialize() {
	        assert mainMenu != null : "fx:id=\"mainMenu\" was not injected: check your FXML file 'mainMenu.fxml'.";

	    }

	}
	
	
