package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTelaBuscarUsuarioController implements Initializable {
	
	  	@FXML private TableView<?> grdBuscarAluno;
	    @FXML private Button bntEditar;
	    @FXML private TextField txtBuscarAluno;
	    @FXML private Button btnExcluir;
	    @FXML private RadioButton rbAtivar;
	    @FXML private RadioButton rbblocked;
	    @FXML private Button btnBuscar;
	    @FXML private Button btnAtualizar;
	    @FXML private Button btnSalvar;
	    @FXML private Button btnCancelar;
		
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	
}
