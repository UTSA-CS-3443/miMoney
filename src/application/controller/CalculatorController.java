package application.controller;

import javafx.scene.control.TextField;
import application.model.CalculatorModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;


/**
 * This code manages button and text inputs for the savings calculator
 * @author Sam Dash
 *
 */

public class CalculatorController implements EventHandler<ActionEvent>{
	
    @FXML
    private TextField goal;
    
    @FXML
    private TextField deposit;
    
    @FXML
    private TextField time;
    
    private double num1 = 0;
    private double num2 = 0;
    private CalculatorModel model = new CalculatorModel(num1, num2);
    
    @Override
    public void handle(ActionEvent event)
    {
    	String g = goal.getText();
    	String d = deposit.getText();
    	num1 = Double.parseDouble(g);
    	num2 = Double.parseDouble(d);
    	time.setText(String.valueOf(model.savingsTime(num1,num2)));
    }

    public void clear(ActionEvent event)
    {
    	this.goal.setText("");
    	this.deposit.setText("");
    	this.time.setText("");
    }
}