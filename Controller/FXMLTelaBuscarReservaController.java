package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTelaBuscarReservaController implements Initializable{
	
	 	@FXML private Button bntBuscar;
	    @FXML private TextField txtBuscarReserva;
	    @FXML private TableView<?> grdBuscarReserva;
	    @FXML private Button bntCanReserva;
	    @FXML private Button bntAtReserva;
	    @FXML private Button bntSalvar;
	    @FXML private Button btnCancelar;
		
	    
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	
}
