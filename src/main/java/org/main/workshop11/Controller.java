package org.main.workshop11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private Button ACButton;

    @FXML
    private Button DivisionButton;

    @FXML
    private Button EightButton;

    @FXML
    private Button EqualsButton;

    @FXML
    private Button FiveButton;

    @FXML
    private Button FloatPointButton;

    @FXML
    private Button FourButton;

    @FXML
    private Button MultiplyButton;

    @FXML
    private Button NineButton;

    @FXML
    private Button OneButton;

    @FXML
    private TextField OutputTextField;

    @FXML
    private Button SevenButton;

    @FXML
    private Button SixButton;

    @FXML
    private Button SubButton;

    @FXML
    private Button SumButton;

    @FXML
    private Button ThreeButton;

    @FXML
    private Button TwoButton;

    @FXML
    private Button ZeroButton;
    private String string = "";

    public void keyboardPressed (KeyEvent event){
        String key = event.getCode().toString();
        switch (key){
            case "DIGIT1" :
                string += "1";
                OutputTextField.setText(string);
                break;
            case "DIGIT2" :
                string += "2";
                OutputTextField.setText(string);
                break;
            case "DIGIT3" :
                string += "3";
                OutputTextField.setText(string);
                break;
            case "DIGIT4" :
                string += "4";
                OutputTextField.setText(string);
                break;
            case "DIGIT5" :
                string += "5";
                OutputTextField.setText(string);
                break;
            case "DIGIT6" :
                string += "6";
                OutputTextField.setText(string);
                break;
            case "DIGIT7" :
                string += "7";
                OutputTextField.setText(string);
                break;
            case "DIGIT8" :
                string += "8";
                OutputTextField.setText(string);
                break;
            case "DIGIT9" :
                string += "9";
                OutputTextField.setText(string);
                break;
            case "DIGIT0" :
                string += "0";
                OutputTextField.setText(string);
                break;
            case "ADD" :
                string += "+";
                OutputTextField.setText(string);
                break;
            case "SUBTRACT" :
                string += "-";
                OutputTextField.setText(string);
                break;
            case "DIVIDE" :
                string += "÷";
                OutputTextField.setText(string);
                break;
            case "MULTIPLY" :
                string += "×";
                OutputTextField.setText(string);
                break;
            case "PERIOD" :
                string += ".";
                OutputTextField.setText(string);
                break;
            case "ENTER" :
                if (string.contains("+")){
                    String[] numbers = string.split("\\+");
                    string = String.valueOf(Float.parseFloat(numbers[1]) + Float.parseFloat(numbers[0]));
                }
                else if (string.contains("-")){
                    String[] numbers = string.split("-");
                    string = String.valueOf(Float.parseFloat(numbers[0]) - Float.parseFloat(numbers[1]));
                }
                else if (string.contains("×")){
                    String[] numbers = string.split("×");
                    string = String.valueOf(Float.parseFloat(numbers[1]) * Float.parseFloat(numbers[0]));
                }
                else if (string.contains("÷")){
                    String[] numbers = string.split("÷");
                    string = String.valueOf(Float.parseFloat(numbers[0]) / Float.parseFloat(numbers[1]));
                }
                //TODO : handle the calculation
                OutputTextField.setText(string);
        }
    }
    @FXML
    void ACButtonPressed(ActionEvent event) {
        string = "";
        OutputTextField.setText(string);
    }
    @FXML
    void DivisionButtonPressed(ActionEvent event) {
        string += "÷";
        OutputTextField.setText(string);
    }
    @FXML
    void EightButtonPressed(ActionEvent event) {
        string += "8";
        OutputTextField.setText(string);
    }
    @FXML
    void EqualsButtonPressed(ActionEvent event) {
        if (string.contains("+")){
            String[] numbers = string.split("\\+");
            string = String.valueOf(Float.parseFloat(numbers[1]) + Float.parseFloat(numbers[0]));
        }
        else if (string.contains("-")){
            String[] numbers = string.split("-");
            string = String.valueOf(Float.parseFloat(numbers[0]) - Float.parseFloat(numbers[1]));
        }
        else if (string.contains("×")){
            String[] numbers = string.split("×");
            string = String.valueOf(Float.parseFloat(numbers[1]) * Float.parseFloat(numbers[0]));
        }
        else if (string.contains("÷")){
            String[] numbers = string.split("÷");
            string = String.valueOf(Float.parseFloat(numbers[0]) / Float.parseFloat(numbers[1]));
        }
        //TODO : handle the calculation
        OutputTextField.setText(string);
    }
    @FXML
    void FiveButtonPressed(ActionEvent event) {
        string += "5";
        OutputTextField.setText(string);
    }
    @FXML
    void FloatPointButtonPressed(ActionEvent event) {
        string += ".";
        OutputTextField.setText(string);
    }
    @FXML
    void FourButtonPressed(ActionEvent event) {
        string += "4";
        OutputTextField.setText(string);
    }
    @FXML
    void MultiplyButtonPressed(ActionEvent event) {
        string += "×";
        OutputTextField.setText(string);
    }
    @FXML
    void NineButtonPressed(ActionEvent event) {
        string += "9";
        OutputTextField.setText(string);
    }
    @FXML
    void SevenButtonPressed(ActionEvent event) {
        string += "7";
        OutputTextField.setText(string);
    }
    @FXML
    void SixButtonPressed(ActionEvent event) {
        string += "6";
        OutputTextField.setText(string);
    }
    @FXML
    void SubButtonPressed(ActionEvent event) {
        string += "-";
        OutputTextField.setText(string);
    }
    @FXML
    void SumButtonPressed(ActionEvent event) {
        string += "+";
        OutputTextField.setText(string);
    }
    @FXML
    void ThreeButtonPressed(ActionEvent event) {
        string += "3";
        OutputTextField.setText(string);
    }
    @FXML
    void TwoButtonPressed(ActionEvent event) {
        string += "2";
        OutputTextField.setText(string);
    }
    @FXML
    void OneButtonPressed(ActionEvent event) {
        string += "1";
        OutputTextField.setText(string);
    }
    @FXML
    void ZeroButtonPressed(ActionEvent event) {
        string += "0";
        OutputTextField.setText(string);
    }
}