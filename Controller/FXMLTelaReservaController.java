package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTelaReservaController implements Initializable{
	
	
		@FXML private TableView<?> grdReservaLivro;
	    @FXML private Button bntBuscar;
	    @FXML private TextField txtRaAluno;
	    @FXML private DatePicker dateReserva;
	    @FXML private Button bntEfeturReserva;
	    @FXML private Button bntCancelar;
	    @FXML private TextField txtBuscarLivroReserva;
		
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}

}
