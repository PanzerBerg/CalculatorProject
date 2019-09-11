package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainViewController {

    private Integer number1;
    private Integer number2;
    private Integer result;
    private String text;

    private boolean operationPressed;

    @FXML
    private TextField textField;
    @FXML
    private Button bt1;
    @FXML
    private Button bt2;
    @FXML
    private Button bt3;
    @FXML
    private Button bt4;
    @FXML
    private Button bt5;
    @FXML
    private Button bt6;
    @FXML
    private Button bt7;
    @FXML
    private Button bt8;
    @FXML
    private Button bt9;
    @FXML
    private Button bt0;
    @FXML
    private Button btDot;
    @FXML
    private Button btEqual;
    @FXML
    private Button btAC;
    @FXML
    private Button btPosNeg;
    @FXML
    private Button btMod;
    @FXML
    private Button btDiv;
    @FXML
    private Button btMult;
    @FXML
    private Button btPlus;
    @FXML
    private Button btMinus;
    @FXML
    private Button btErase;

    public void onBt1Action(ActionEvent event) {
        if(textField == null){
            textField.setText("1");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "1");
        }
    }

    public void onBt2Action(ActionEvent event) {

    }
    public void onBt3Action(ActionEvent event) {

    }
    public void onBt4Action(ActionEvent event) {

    }
    public void onBt5Action(ActionEvent event) {

    }
    public void onBt6Action(ActionEvent event) {

    }
    public void onBt7Action(ActionEvent event) {

    }
    public void onBt8Action(ActionEvent event) {

    }
    public void onBt9Action(ActionEvent event) {

    }
    public void onBt0Action(ActionEvent event) {

    }
//    public void onBtAction(ActionEvent event) {
//
//    }
//    public void onBt1Action(ActionEvent event) {
//
//    }
//    public void onBt1Action(ActionEvent event) {
//
//    }
}
