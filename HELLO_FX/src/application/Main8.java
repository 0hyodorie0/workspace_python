package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main8 extends Application {

	Label lbl1, lbl2,lbl3,lbl4,lbl5,lbl6;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("main8.fxml"));
			Scene scene = new Scene(root, 300, 200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("🎲로또번호생성기🎲");
			primaryStage.setScene(scene);
			primaryStage.show();

			lbl1 = (Label) scene.lookup("#lbl1");
			lbl2 = (Label) scene.lookup("#lbl2");
			lbl3 = (Label) scene.lookup("#lbl3");
			lbl4 = (Label) scene.lookup("#lbl4");
			lbl5 = (Label) scene.lookup("#lbl5");
			lbl6 = (Label) scene.lookup("#lbl6");
			Button btn = (Button) scene.lookup("#btn");
			
			// 엔터키눌렀을때 게임실행
			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					game();
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void game() {
	      String[] arr = {
	    	         "1","2","3","4","5",   "6","7","8","9","10",   
	    	         "11","12","13","14","15",   "16","17","18","19","20",
	    	         "21","22","23","24","25",   "26","27","28","29","30",
	    	         "31","32","33","34","35",   "36","37","38","39","40",
	    	         "41","42","43","44","45"
	    	      };

		ArrayList<String> arr6 = new ArrayList<>();
		
		while(true) {
			int rnd = (int)(45*Math.random());
			String imsi = arr[rnd];
			if(!imsi.equals("-1")) {
				arr6.add(imsi);
				arr[rnd]="-1";
			}
			if(arr6.size()>=6) {
				break;
			}
		}
		
		lbl1.setText(arr6.get(0));
		lbl2.setText(arr6.get(1));
		lbl3.setText(arr6.get(2));
		lbl4.setText(arr6.get(3));
		lbl5.setText(arr6.get(4));
		lbl6.setText(arr6.get(5));

	}

	public static void main(String[] args) {
		launch(args);
	}
}
