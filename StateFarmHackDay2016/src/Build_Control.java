import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.image.*;

public class Build_Control {

	ObservableList<String> buildingBox = FXCollections.observableArrayList("A", "B", "C", "D");
	
	@FXML
	private Label buildingLabel;
	
	@FXML
	private Label floorLabel;
	
	@FXML
	private Label timeLabel;
	
	@FXML
	private ComboBox<String> Building;
	
	@FXML 
	private ComboBox<String> Floor;
	
	@FXML
	private ComboBox<String> Time;
	
	@FXML
	private ImageView MapView;
	
	public void initialize()
	{
		//Sets the combo box with its items
		Building.setValue("A");
		Building.setItems(buildingBox);
		Building.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override public void changed(ObservableValue<? extends String> ov,
					final String old, final String newS) {
						if(old != null) {
							
						}
			}
		});
		
	}
	public void convertButtonListener()
	{
	
	}
}
