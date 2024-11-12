package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();//passando o caminho do css
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");//passando o caminho do login.fxml
		GridPane raiz = FXMLLoader.load(arquivoFXML);//recebendo a url de cima
		
		Scene cena = new Scene(raiz,350,350);
		cena.getStylesheets().add(arquivoCSS);//add o css na cena
		
		primaryStage.setResizable(false);//não deixa mexer na tela
		primaryStage.setScene(cena);
		primaryStage.setTitle("Telade Login");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
