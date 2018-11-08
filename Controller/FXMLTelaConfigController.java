package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;


public class FXMLTelaConfigController  implements Initializable{
	
	@FXML private Menu mnAluno;
    @FXML private MenuItem mnCadastrarAluno;
    @FXML private MenuItem mnBuscarAluno;
    @FXML private Menu mnLivros;
    @FXML private MenuItem mnCadastrarLivro;
    @FXML private MenuItem mnBuscarLivros;
    @FXML private Menu mnEmprestimo;
    @FXML private MenuItem mnEmpLivro;
    @FXML private MenuItem mnBuscarEmp;
    @FXML private Menu mnReserva;
    @FXML private MenuItem mnFazerReserva;
    @FXML private MenuItem mnBuscarReserva;
    @FXML private Menu mnSair;
	
    
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
    	
    }
	
}
