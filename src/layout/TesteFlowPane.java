package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {
	
	public TesteFlowPane() {
	
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		setHgap(10);//espaçamento lateral
		setVgap(10);//espaçamento de cima
		setPadding(new Insets(10));//espaçamento entre as bordas 
		
		setOrientation(Orientation.VERTICAL);//quebra automaticamente na vertical
		setAlignment(Pos.CENTER_RIGHT);//alinhando do lado direito
		
		getChildren().addAll(q1,q2,q3,q4,q5);
	}

}
