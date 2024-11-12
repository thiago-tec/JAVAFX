package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	
	private void AtualizarLabelNum(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		}else {
			label.getStyleClass().add("vermelho");
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox boxPrincipal = new VBox();
		
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		labelTitulo.getStyleClass().add("titulo");
		
		Button botaoMais = new Button("+");
		botaoMais.getStyleClass().add("botoes");
		botaoMais.setOnAction(e -> {
			contador++;
			AtualizarLabelNum(labelNumero);
		
		});
		
		Button botaoMenos = new Button("-");
		botaoMenos.getStyleClass().add("botoes");
		botaoMenos.setOnAction(e -> {
			contador--;
			AtualizarLabelNum(labelNumero);
		});
		
		
		HBox boxBotao = new HBox();
		boxBotao.getChildren().add(botaoMenos);
		boxBotao.getChildren().add(botaoMais);
		
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotao);
		
		boxBotao.setSpacing(10);
		boxPrincipal.setSpacing(10);
		
		boxPrincipal.setAlignment(Pos.CENTER);
		boxBotao.setAlignment(Pos.CENTER);
		
		Scene cenaPrincipal = new Scene(boxPrincipal, 200,200);
		
		String caminhoCss = getClass().getResource("/basico/Contador.css").toExternalForm(); //passando caminho do css para uma var
		cenaPrincipal.getStylesheets().add(caminhoCss); // informando que ele vai estar na cena principal informando a var de cima
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald"); // informando que ele vai estar na cena principal informando a o link da fonte 
		boxPrincipal.getStyleClass().add("conteudo"); //add a classe css de fato agora conforme o nome que foi declarado na classe css
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
