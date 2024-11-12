package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

	public TesteBorderPane() {

		Caixa c1 = new Caixa().comTexto("topo");
		setTop(c1);
		Caixa c2 = new Caixa().comTexto("esquerda");
		setLeft(c2);
		Caixa c3 = new Caixa().comTexto("direita");
		setRight(c3);
		Caixa c4 = new Caixa().comTexto("fundo");
		setBottom(c4);
		Caixa c5 = new Caixa().comTexto("fundo");
		setCenter(c5);
	}

}
