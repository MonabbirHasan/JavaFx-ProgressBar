package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller implements Initializable{

	
	@FXML
	private Label myLabel;
	@FXML
	private Button myButton;
	@FXML
	private ProgressBar myProgress;
	
	BigDecimal progress=new BigDecimal(String.format("%.2f", 0.0));
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myProgress.setStyle("-fx-accent:#00FF00;");
		
	}
	
	public void IncressProgress() {
		if(progress.doubleValue()<1) {
			progress=new BigDecimal(String.format("%.2f",progress.doubleValue()+0.1));
			myProgress.setProgress(progress.doubleValue());
			myLabel.setText(Double.toString(Math.round(progress.doubleValue()*100))+"%");
		}
		
	}
	
}
