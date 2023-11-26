package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	public static Scene scene;
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public void start(Stage stage){
		try {
			Parent root =  FXMLLoader.load(getClass().getResource("Main.fxml"));
			scene = new Scene(root);
			String css = this.getClass().getResource("/application/application.css").toExternalForm();
			root.requestFocus();
			
			stage.setMinHeight(540);
			stage.setMinWidth(810);
			stage.setHeight(540);
			stage.setWidth(810);
			
			stage.setTitle("GuardKey");
			
			Image icon = new Image("/logo.png");
			stage.getIcons().add(icon);
		
			scene.getStylesheets().add(css);
			
			stage.setScene(scene);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
