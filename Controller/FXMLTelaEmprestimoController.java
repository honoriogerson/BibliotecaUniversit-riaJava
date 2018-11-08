package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTelaEmprestimoController implements Initializable {
	
	@FXML private TableView<?> grdEmpLivro;
    @FXML private Button btnBuscar;
    @FXML private TextField txtRaAluno;
    @FXML private DatePicker dateRetirada;
    @FXML private Button bntEfetuarEmp;
    @FXML private Button btnCancelar;
    @FXML private TextField txtBuscarLivroEmp;
    @FXML private DatePicker dateDevolução;
	
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}
