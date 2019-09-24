package gui;

import application.Main;
import gui.entities.EqualActions;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.Alerts;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class MainViewController {

    private FXMLLoader loader = new FXMLLoader();
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
        equalActions.setModPressed(false);
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
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt2Action() {
        if (equalActions.getResult() != null){
             resetResults();
        }

        try {
            equalActions.onBtAction("2", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt3Action() {
        if (equalActions.getResult() != null){
             resetResults();
        }

        try {
            equalActions.onBtAction("3", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt4Action() {
        if (equalActions.getResult() != null){
           resetResults();
        }

        try {
            equalActions.onBtAction("4", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt5Action() {
        if (equalActions.getResult() != null){
           resetResults();
        }

        try {
            equalActions.onBtAction("5", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt6Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("6", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt7Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("7", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt8Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("8", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt9Action() {
        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("9", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBt0Action() {

        if (equalActions.getResult() != null){
            resetResults();
        }

        try {
            equalActions.onBtAction("0", textField);
        } catch (NumberFormatException e){
            equalActions.onCatchButton(textField);
        }
    }

    public void onBtPlusAction() {
        equalActions.operationPressed(textField);
        equalActions.setPlusPressed(true);
    }

    public void onBtMultAction() {
        equalActions.operationPressed(textField);
        equalActions.setMultPressed(true);

    }

    public void onBtDivAction() {
        equalActions.operationPressed(textField);
        equalActions.setDivPressed(true);
    }

    public void onBtMinusAction() {
        equalActions.operationPressed(textField);
        equalActions.setMinusPressed(true);
    }

    public void onBtModAction() {
        equalActions.operationPressed(textField);
        equalActions.setModPressed(true);
    }

    public void onBtEraseAction() {
        equalActions.eraseAction(textField);
    }

    public void onBtPosNegAction() {
        equalActions.onBtNegPos(textField);
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

    //MenuBar

    public void onAboutAction () {
        try {
            loader.setLocation(getClass().getResource("/gui/About.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(loader.load());
            stage.setTitle("About");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            Alerts.showAlert("IOException", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    public void onGithubAction() {
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/PanzerBerg/CalculatorProject"));
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }
    }
}
