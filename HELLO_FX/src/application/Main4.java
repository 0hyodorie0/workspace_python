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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class Main4 extends Application {
	
	TextField tf;
	TextArea ta;
	@Override
	public void start(Stage primaryStage) {
		try {
			
            Parent root = FXMLLoader.load(getClass().getResource("main4.fxml"));
            Scene scene = new Scene(root,300,300);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            tf = (TextField)scene.lookup("#tf");
            ta = (TextArea)scene.lookup("#ta");
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
		String mytext = tf.getText();
		int mynum = Integer.parseInt(mytext);
		String result = "";
		
		for(int i = mynum; i<=mynum; i++) {
			for(int j = 1; j<=9; j++) {
				result += i+"*"+j+"="+i*j+"\n";
			}
		}
		
		ta.setText(result);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
