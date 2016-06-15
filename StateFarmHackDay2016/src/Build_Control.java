import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

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
						Building.setValue(newS);
			}
		});
		BufferedImage img = null;
		try {
		    File file = new File("/StateFarmHackDay2016/src/FloorPlanModel.png");
		    img = ImageIO.read(file);
		} catch (IOException e) {
		}
		
		WritableImage wr = null;
        if (img != null) {
            wr = new WritableImage(img.getWidth(), img.getHeight());
            PixelWriter pw = wr.getPixelWriter();
            for (int x = 0; x < img.getWidth(); x++) {
                for (int y = 0; y < img.getHeight(); y++) {
                    pw.setArgb(x, y, img.getRGB(x, y));
                }
            }
        }
 
        ImageView imView = new ImageView(wr);
        MapView = imView;
	}
}
