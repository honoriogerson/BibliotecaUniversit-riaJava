package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FXMLTelaCadastroUsuarioController implements Initializable{
	
		@FXML private TextField tctCadAluno;
	    @FXML private TextField txtRG;
	    @FXML private TextField txtCPF;
	    @FXML private TextField txtEmail;
	    @FXML private TextField TxtTelefone;
	    @FXML private TextField txtRua;
	    @FXML private TextField txtNumero;
	    @FXML private TextField txtCEP;
	    @FXML private ComboBox<?> cbCidade;
	    @FXML private TextField txtBairro;
	    @FXML private Button btnSalvar;
	    @FXML private Button btnCancelar;
		
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
}
