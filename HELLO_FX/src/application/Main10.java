package application;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main10 extends Application {
	Label lbl;
	int count = 1;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("main10.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("타이머");
			primaryStage.setScene(scene);
			primaryStage.show();

			lbl = (Label) scene.lookup("#lbl");
			Button btn = (Button) scene.lookup("#btn");

			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
//					startCount();
					semCode();
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void semCode() {
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 9; i++) {
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							String a = lbl.getText();
							int aa = Integer.parseInt(a);
							aa++;
							lbl.setText(aa + "");
						}
					});
				}
			}
		}).start();
	}

	void startCount() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (count < 9) {
					Runnable run = new Runnable() {
						@Override
						public void run() {
							count++;
							lbl.setText(count + "");
						}
					};

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					Platform.runLater(run);
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
