package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application{

	private Stage janela;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		Parent raiz = null;
//		raiz = new TesteAnchorPane();	
//		raiz = new TesteBorderPane();
//		raiz = new TesteFlowPane();
//		raiz = new TesteGridPane();
//		raiz = new TesteStackPane();
		raiz = new TesteTilePane();

		Scene principal = new Scene(raiz, 800, 600);
		
		primaryStage.setScene(principal);
		janela.setTitle("Gerenciadores de Layout");
		janela.show();
		
	}
	
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
}
