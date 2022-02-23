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


public class Main6 extends Application {
	TextField txtMine;
	TextField txtCom;
	TextField txtResult;
	
	@Override
	public void start(Stage primaryStage) {
		try {
            Parent root = FXMLLoader.load(getClass().getResource("main6.fxml"));
            Scene scene = new Scene(root,400,400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setTitle("AppMain");
            primaryStage.setScene(scene);
            primaryStage.show();
            
             txtMine = (TextField)scene.lookup("#txtMine");
             txtCom = (TextField)scene.lookup("#txtCom");
             txtResult = (TextField)scene.lookup("#txtResult");
            
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
		String mine = txtMine.getText();
		String com = txtCom.getText();
		String result = "";
		
		int rnd = (int) (Math.random()*3);
		if(rnd == 0) {
			com = "가위";
		}else if(rnd == 1) {
			com = "바위";
		}else {
			com = "보";
		}
		if(com.equals(mine)) {
			result = "비겼습니다.";
		} else if( (com.equals("가위") && mine.equals("바위")) || 
					(com.equals("바위") && mine.equals("보")) ||
					(com.equals("보") && mine.equals("가위")) ) {
			result = "이겼습니다.";
		} else {
			result = "졌습니다.";
		}
		txtCom.setText(com);
		txtResult.setText(result);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
