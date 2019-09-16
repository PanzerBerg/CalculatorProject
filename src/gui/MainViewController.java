package gui;

import gui.entities.EqualActions;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import util.Alerts;

public class MainViewController {

    private EqualActions equalActions = new EqualActions();

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

    private void resetResults() {
        textField.setText(null);
        equalActions.setResult(null);
        equalActions.setNumber1(null);
        equalActions.setNumber2(null);
        equalActions.setOperationPressed(false);
        equalActions.setPlusPressed(false);
        equalActions.setMinusPressed(false);
        equalActions.setMultPressed(false);
        equalActions.setDivPressed(false);

    }

    public void onBtACAction() {
        resetResults();
    }

    public void onBt1Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("1", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt2Action() {
        if (equalActions.getResult() != null){
             resetResults();
        }

        try {
            equalActions.onBtAction("2", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt3Action() {
        if (equalActions.getResult() != null){
             resetResults();
        }

        try {
            equalActions.onBtAction("3", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt4Action() {
        if (equalActions.getResult() != null){
           resetResults();
        }

        try {
            equalActions.onBtAction("4", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt5Action() {
        if (equalActions.getResult() != null){
           resetResults();
        }


        try {
            equalActions.onBtAction("5", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt6Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("6", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt7Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("7", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt8Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("8", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt9Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("9", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBt0Action() {

        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("0", textField);
        } catch (NumberFormatException e){
            if (equalActions.isOperationPressed()) {
                textField.setText(String.format("%d",equalActions.getNumber2()));
            } else {
                textField.setText(String.format("%d",equalActions.getNumber1()));
            }
        }
    }

    public void onBtPlusAction() {
        if (equalActions.isPlusPressed() || equalActions.isMinusPressed() || equalActions.isMultPressed() || equalActions.isDivPressed()){
            equalActions.setPlusPressed(true);
            equalActions.setMinusPressed(false);
            equalActions.setMultPressed(false);
            equalActions.setDivPressed(false);
            textField.setText(null);
        } else {
            equalActions.setOperationPressed(true);
            equalActions.setPlusPressed(true);
            textField.setText(null);
        }
    }

    public void onBtMultAction() {
        if (equalActions.isPlusPressed() || equalActions.isMinusPressed() || equalActions.isMultPressed() || equalActions.isDivPressed()){
            equalActions.setPlusPressed(false);
            equalActions.setMinusPressed(false);
            equalActions.setMultPressed(true);
            equalActions.setDivPressed(false);
            textField.setText(null);
        } else {
            equalActions.setOperationPressed(true);
            equalActions.setMultPressed(true);
            textField.setText(null);
        }
    }

    public void onBtDivAction() {
        if (equalActions.isPlusPressed() || equalActions.isMinusPressed() || equalActions.isMultPressed() || equalActions.isDivPressed()){
            equalActions.setPlusPressed(false);
            equalActions.setMinusPressed(false);
            equalActions.setMultPressed(false);
            equalActions.setDivPressed(true);
            textField.setText(null);
        } else {
            equalActions.setOperationPressed(true);
            equalActions.setDivPressed(true);
            textField.setText(null);
        }
    }

    public void onBtMinusAction() {
        if (equalActions.isPlusPressed() || equalActions.isMinusPressed() || equalActions.isMultPressed() || equalActions.isDivPressed()){
            equalActions.setPlusPressed(false);
            equalActions.setMinusPressed(true);
            equalActions.setMultPressed(false);
            equalActions.setDivPressed(false);
            textField.setText(null);
        } else {
            equalActions.setOperationPressed(true);
            equalActions.setMinusPressed(true);
            textField.setText(null);
        }
    }

    public void onBtEraseAction() {
        equalActions.eraseAction(textField);
    }

    public void onBtEqualAction() {

        equalActions.equalEqual(textField);

        if (textField.getText() == null || textField.getText().equals("") && equalActions.getNumber1() != 0) {
            Alerts.showAlert("No input detected", null, "Please input the second number", Alert.AlertType.WARNING);
        }

        if (!equalActions.isOperationPressed()) {
            Alerts.showAlert("Cannot complete", "No Operations pressed", "A operation must be pressed in order to finalize the complete. \nPlease press on either +, -, x or /", Alert.AlertType.WARNING);
        }

        equalActions.onEqualAction(textField);
    }
}
