package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class FXMLTelaConfigController{
	
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
	
   //SAIR DO SISTEMA
    public void sair()throws IOException {
        Stage stage = (Stage) mnSair.getScene().getWindow();
        stage.close();
    }
    //CADASTRAR ALUNO
    @FXML
    	void cadAluno() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaCadastroUsuario.fxml"));
        Pane root = loader.load();
        Controller.FXMLTelaCadastroUsuarioController controller = (Controller.FXMLTelaCadastroUsuarioController) loader.getController();
       ((Stage) mnCadastrarAluno.getScene.getWindow()).hide();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setResizable(false);     
        stage.setTitle("Cadastro de Aluno");
        stage.setScene(scene);
        stage.show();
    }
	
    //BUSCAR ALUNO  
    @FXML
	void buscarAluno() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaBuscarUsuario.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaBuscarUsuarioController controller = (Controller.FXMLTelaBuscarUsuarioController) loader.getController();
   ((Stage) mnBuscarAluno.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Buscar de Aluno");
    stage.setScene(scene);
    stage.show();
    } 
    
    //CASDASTRAR LIVRO 
    @FXML
	void cadLivro() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaCadastroLivro.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaCadastroLivroController controller = (Controller.FXMLTelaCadastroLivroController) loader.getController();
   ((Stage) mnCadastrarLivro.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Cadastrar de Livro");
    stage.setScene(scene);
    stage.show();
    } 
    
  //BUSCAR LIVRO 
    @FXML
	void buscarLivro() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaBuscarLivro.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaBuscarLivroController controller = (Controller.FXMLTelaBuscarLivroController) loader.getController();
   ((Stage) mnBuscarLivros.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Buscar de Livro");
    stage.setScene(scene);
    stage.show();
    } 
    
  //EMPRESTAR LIVRO 
    @FXML
	void empLivro() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaEmprestimo.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaEmprestimoController controller = (Controller.FXMLTelaEmprestimoController) loader.getController();
   ((Stage) mnEmpLivro.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Emprestimo de livro");
    stage.setScene(scene);
    stage.show();
    } 
    
  //BUSCAR EMPRESTIMO 
    @FXML
	void buscarEmprestimo() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaBuscarEmprestimo.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaEmprestimoController controller = (Controller.FXMLTelaEmprestimoController) loader.getController();
   ((Stage) mnBuscarEmp.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Listar livros emprestados");
    stage.setScene(scene);
    stage.show();
    } 
    
  //FAZER RESERVA 
    @FXML
	void fazReserva() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaReserva.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaReservaController controller = (Controller.FXMLTelaReservaController) loader.getController();
   ((Stage) mnFazerReserva.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Fazer reserva de livro");
    stage.setScene(scene);
    stage.show();
    } 
    
  //BUSCAR RESERVA 
    @FXML
	void buscarReserva() throws IOException{
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/FXMLTelaReserva.fxml"));
    Pane root = loader.load();
    Controller.FXMLTelaReservaController controller = (Controller.FXMLTelaReservaController) loader.getController();
   ((Stage) mnFazerReserva.getScene.getWindow()).hide();
    Scene scene = new Scene(root);
    Stage stage = new Stage();
    stage.setResizable(false);     
    stage.setTitle("Livros reservados");
    stage.setScene(scene);
    stage.show();
    } 
    
}
