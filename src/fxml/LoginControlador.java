package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML //declarando os campos preenchidos no fx:id, perceba também que ele te o mesmo nome da tag "<TextField> ee <PasswordField>
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@teste.org.br");
		boolean senhaValido = campoSenha.getText().equals("123");
		
		if (senhaValido && emailValido) {
			Notifications.create().position(Pos.CENTER).title("login FXML").text("LOGIN EFETUADO COM SUCESSO").showInformation();
		}else {
			Notifications.create().position(Pos.CENTER).title("login FXML").text("LOGIN NÃO EFETUADO").showError();
		}
		
	}
}
