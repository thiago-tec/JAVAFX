package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox box = new HBox();//definindo o direcionamento da box
		
		Button botaoA = new Button("A");//definindo os botões
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		box.getChildren().add(botaoA);//add botões na cena
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
				
		botaoA.setOnAction( e -> System.out.println("a"));//defindo regra dos botões
		botaoB.setOnAction( e -> System.out.println("b"));
		botaoC.setOnAction( e -> System.exit(0));//defindo saisse
		box.setAlignment(Pos.CENTER);//alianhando no centro
		box.setSpacing(10);//com espaçamento 10
		
		Scene unicaCena = new Scene(box, 150, 100); //definindo o tamanho da cena
		
		primaryStage.setScene(unicaCena);//setando a cena
		primaryStage.show();//mostrando a cena
		
	}
	
	public static void main(String[] args) {
		
		launch(args);//rodando a cena sem isso a cena não abre(janela)
		
	}
	
}
