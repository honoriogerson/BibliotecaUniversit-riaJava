package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLTelaBuscarEmprestimoController implements Initializable {
	
	 	@FXML private Button btnBuscarEmp;
	    @FXML private TextField txtBuscarEmp;
	    @FXML private TableView<?> grdBuscarEmp;
	    @FXML private Button bntDevolverLivro;
	    @FXML private Button bntRelQuitacao;
	    @FXML private Button bntSalvar;
	    @FXML private Button bntCancelar;
		
	    
	    @Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub
			
		}
	
}
