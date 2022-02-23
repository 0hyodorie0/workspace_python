package application;
	


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class Main5 extends Application {
	TextField tf1;
	TextField tf2;
	TextField tf3;
	@Override
	public void start(Stage primaryStage) {
		try {
			
            Parent root = FXMLLoader.load(getClass().getResource("main5.fxml"));
            Scene scene = new Scene(root,400,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            tf1 = (TextField)scene.lookup("#tf1");
            tf2 = (TextField)scene.lookup("#tf2");
            tf3 = (TextField)scene.lookup("#tf3");
            Button btn = (Button)scene.lookup("#btn");
            btn.setOnMouseClicked(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					myclick();
				}
            	
            });
            
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void myclick() {
		String mytext1 = tf1.getText();
		int mynum1 = Integer.parseInt(mytext1);
		String mytext2 = tf2.getText();
		int mynum2 = Integer.parseInt(mytext2);
		int result = 0;
		
		for(int i = mynum1; i<(mynum2+1); i++) {
			result += i;
		}
		tf3.setText(result+"");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
