package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		//apertando no botão ele fecha e encerra programa
		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> {  System.exit(0);   });
		
		//Faz tudo na Vertical VHbox , HBox		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		
		//Faz tudo na horizontal
		Scene unicaCena = new Scene(box, 150, 100);
		
		
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
