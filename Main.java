package application;

import Controller.FXMLTelaLoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaLogin.fxml"));

		Pane root = loader.load();

		//FXMLTelaLoginController controller = (FXMLTelaLoginController) loader.getController();

		Scene scene = new Scene(root);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Login");

		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}