package Controller;

import java.awt.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import javafx.stage.Stage;

public class FXMLTelaLoginController {

	@FXML
	private PasswordField txtPassword;
	@FXML
	private TextField txtUser;
	@FXML
	private Button btnEntrar;
	@FXML
	private Button btnFechar;

	@FXML
	public void fechar() {
		Stage stage = (Stage) btnFechar.getScene().getWindow();
		stage.close();
	}
}