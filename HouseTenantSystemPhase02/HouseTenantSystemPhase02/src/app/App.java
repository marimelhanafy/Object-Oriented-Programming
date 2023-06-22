package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.OOMRealStateApp;

/**
 * @author Marim Elhanafy - Mariam Abdelsalam - Hagar Elsayed - Wadha Albadr
 * @date 16/03/2020
 * @version JDK 13.0
 *
 */
public class App extends Application {

	public static final OOMRealStateApp db = new OOMRealStateApp();
	
	@Override
	public void start(Stage stage) throws Exception {
		Pane root = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
		stage.setTitle("OOM Real State");
		stage.setScene(new Scene(root));
		stage.show();

	}//end of start method

	public static void main (String args[]) {
		
		launch(args);
	}//end of main method



}//end of class
