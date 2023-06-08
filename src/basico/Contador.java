package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private int contador = 0;
	
	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		}else if(contador < 0) {
			label.getStyleClass().add("vermelho");
		}
	}

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label labelTitulo = new Label("Contador");//setando escrita
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");//setando escrita 
		labelNumero.getStyleClass().add("numero");
		
		
		Button botaoDecremento = new Button("-");//setando escrita no botão
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		
		
		Button botaoIncremento = new Button("+");//setando escrita no botão
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);//centrando a posicao
		boxBotoes.setSpacing(10);//tamanho do espaço entre os botao
		boxBotoes.getChildren().add(botaoDecremento);//add botao
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new  VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		//passando o caminho do arquivo css
		String caminhoDoCss = getClass()
				.getResource("/basico/contador.css").toExternalForm();
		
		//setando oque ira ter na cena principal
		Scene cenaPrincipal = new Scene(boxConteudo,400,400);
		
		//setando o caminho para o estilo css
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");
		
		//setando a cena que foi definida
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
