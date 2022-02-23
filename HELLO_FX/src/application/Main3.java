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


public class Main3 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		TextField tf;
		try {
            Parent root = FXMLLoader.load(getClass().getResource("main3.fxml"));
            Scene scene = new Scene(root,400,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            Label mine = (Label)scene.lookup("#lbl_mine");
            Label com = (Label)scene.lookup("#lbl_com");
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
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
