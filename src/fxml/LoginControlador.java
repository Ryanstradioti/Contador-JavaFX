package fxml;



import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField CampoEmail;
	
	@FXML
	private PasswordField CampoSenha;
	
	public void entrar() {
		boolean emailValido = CampoEmail.getText().equals("ryan@gmail.com");
		boolean senhaValida = CampoSenha.getText().equals("123456");
		
		if (emailValido && senhaValida) {
			Notifications.create()
			.title("Login FXML")
			.text("login Efetuado com sucesso")
			.showInformation();
		}else {
			Notifications.create()
			.title("Login FXML")
			.text("Usuario e Senha Inválidos!")
			.showError();
		}				
	}

}
