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
	TextField txt_mine;
    TextField txt_com;
    TextField txt_result;
	@Override
	public void start(Stage primaryStage) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("main3.fxml"));
            Scene scene = new Scene(root,400,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();
            
            Button btn = (Button)scene.lookup("#btn");
             txt_mine = (TextField)scene.lookup("#txt_mine");
             txt_com = (TextField)scene.lookup("#txt_com");
             txt_result = (TextField)scene.lookup("#txt_result");
            
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
		String mine = txt_mine.getText();
		String com = "";
		String result = "";
		
		double rnd = Math.random();
		if(rnd>0.5) {
			com = "홀";
		}else {
			com = "짝";
		}
		if(mine.equals(com)) {
			result = "이김";
		}else {
			result = "짐";
		}
		
		txt_com.setText(com);
		txt_result.setText(result);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
