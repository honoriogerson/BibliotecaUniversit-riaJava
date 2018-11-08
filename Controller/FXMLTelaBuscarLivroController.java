package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTelaBuscarLivroController implements Initializable {

	
	  	@FXML private TableView<?> grdBuscarLivro;
	    @FXML private Button bntEditar;
	    @FXML private TextField txtBuscarLivro;
	    @FXML private Button bntExcluir;
	    @FXML private RadioButton rbAtivar;
	    @FXML private RadioButton rbblocked;
	    @FXML private Button bntBuscar;
	    @FXML private Button bntAtulaizar;
	    @FXML private Button bntSalvar;
	    @FXML private Button bntCancelar;
		
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
}
