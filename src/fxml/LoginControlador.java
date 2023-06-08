package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	
	@FXML
	private PasswordField campoSenha;
	
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@hotmail.com");
		boolean senhaValida = campoSenha.getText().equals("12345");
		
		if (emailValido && senhaValida) {
			Notifications.create()
			.position(Pos.CENTER)
			.title("Login FXML")
			.text("login efetuado com sucesso")
			.showInformation();
			
		} else {
			Notifications.create()
			.position(Pos.CENTER)
			.title("Login FXML")
			.text("Usuario ou Senha incorretos")
			.showError();

		}
		
	}

	
	
}
