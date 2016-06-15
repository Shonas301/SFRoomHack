import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

public class BuildingLayout extends Application	{
	
	public void start(Stage stage) throws Exception
	{
		Parent parent = FXMLLoader.load(getClass().getResource("BuildingLayout.fxml"));
		Scene scene = new Scene(parent);
		final ComboBox<String> buildingBox = new ComboBox<>();
		buildingBox.getItems().addAll(
				"A", "B", "C");
		buildingBox.setPromptText("Building");
		buildingBox.setEditable(true);
		buildingBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> ov,
					final String old, final String newS) {
						
			}
		});
		stage.setTitle("Meeting Mapper");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
