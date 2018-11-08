package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FXMLTelaCadastroLivroController implements Initializable {
	

    @FXML private TextField txtNomeLivro;
    @FXML private TextField txtID;
    @FXML private TextField txtAutor;
    @FXML private TextField txtEditora;
    @FXML private DatePicker datePublicacao;
    @FXML private TextField txtEdicao;
    @FXML private TextField txtISBN;
    @FXML private ChoiceBox<?> cbStatus;
    @FXML private Button btnSalvar;
    @FXML private Button btnCancelar;
	
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	
}
