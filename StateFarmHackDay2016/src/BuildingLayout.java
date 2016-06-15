import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class BuildingLayout extends Application	{
	
	ComboBox<String> buildingBox;
	public void start(Stage stage) throws Exception
	{
		Parent parent = FXMLLoader.load(getClass().getResource("Kilo.fxml"));
		Scene scene = new Scene(parent);
		buildingBox = new ComboBox<>();
		buildingBox.getItems().addAll(
				"A", "B", "C");
		
		stage.setTitle("Kilometer Converter");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		
		launch(args);
	}

}
