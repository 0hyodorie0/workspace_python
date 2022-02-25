package application;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main9 extends Application {

	TextField tf1,tf2;
	TextArea ta;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("main9.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("별뽑기");
			primaryStage.setScene(scene);
			primaryStage.show();

			tf1 = (TextField) scene.lookup("#tf1");
			tf2 = (TextField) scene.lookup("#tf2");
			ta = (TextArea) scene.lookup("#ta");
			Button btn = (Button) scene.lookup("#btn");
			
			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					print();
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void print() {
		String tf1Val = tf1.getText();
		String tf2Val = tf2.getText();
		int num1 = Integer.parseInt(tf1Val);
		int num2 = Integer.parseInt(tf2Val);
		
		String star ="";
		for(int i = num1 ; i<=num2 ;i++) {
			star += myStar(i);
		}
		ta.setText(star);
		
	}
	
	public String myStar(int cnt) {
		String ret ="";
		for(int i = 0; i<cnt ; i++) {
			ret+="*";
		}
		ret +="\n";
		return ret;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
