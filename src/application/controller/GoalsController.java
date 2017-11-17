package application.controller;

/**
 * @author Manuel Deaguinaga
 */

import java.io.IOException;

import application.Main;
import application.model.Goals.Goals;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GoalsController implements EventHandler<ActionEvent> {
	
	@FXML
	private TextField Cmodel;	// Name of the project
	
	@FXML
	private TextField Cyear;	// Cost in shop
	
	@FXML
	private TextField Ccost;	//
	
	@FXML
	private TextField Ctime;	//
	
	@FXML
	private TextField Cinteres;	//
	
	@FXML
	private TextField Cdown;	//
	
	@FXML
	private Button Continue;
	
	@FXML
	private Button Cancel;
	
	/**
	 * @param ActionEvent event
	 * is using to create the function of each 
	 * button and update the information
	 * in the displayed
	 */
	public void cContinue(ActionEvent event) {
			
			Goals carGoal = new Goals("CarGoal", this.Cmodel.getText(), Ccost.getText(),
					this.Cinteres.getText(), this.Cdown.getText(), this.Cyear.getText(), this.Ctime.getText());
			//Close window and open goal
	}
	
	public void cCancel(ActionEvent event){
		this.Cmodel.setText("");
		this.Ccost.setText("");
		this.Cinteres.setText("");
		this.Cdown.setText("");
		this.Cyear.setText("");
		this.Ctime.setText("");
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}