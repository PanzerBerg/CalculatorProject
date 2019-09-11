package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import util.Alerts;

public class MainViewController {

    private Integer number1 = 0;
    private Integer number2 = 0;
    private Integer result = null;
    private String text;

    private boolean operationPressed = false;
    private boolean plusPressed = false;
    private boolean minusPressed = false;
    private boolean multPressed = false;
    private boolean divPressed = false;

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
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("1");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(textField.getText());
            } else {
                number1 = Integer.parseInt(textField.getText());
            }
        } else {
            text = textField.getText();
            textField.setText(text + "1");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(textField.getText());
            } else {
                number1 = Integer.parseInt(textField.getText());
            }
        }
    }

    public void onBt2Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("2");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "2");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }
    }

    public void onBt3Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("3");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "3");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }
    }

    public void onBt4Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("4");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "4");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }
    }

    public void onBt5Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("5");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "5");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }
    }

    public void onBt6Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("6");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "6");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }

    }

    public void onBt7Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("7");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "7");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }

    }

    public void onBt8Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("8");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "8");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }

    }

    public void onBt9Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("9");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "9");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }

    }

    public void onBt0Action(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            result = null;
            number1 = 0;
            number2 = 0;
            operationPressed = false;
            plusPressed = false;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
        }

        if(textField.getText() == null){
            textField.setText("0");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        } else {
            text = textField.getText();
            textField.setText(text + "0");

            text = textField.getText();
            if (operationPressed == true) {
                number2 = Integer.parseInt(text);
            } else {
                number1 = Integer.parseInt(text);
            }
        }

    }

    public void onBtPlusAction(ActionEvent event) {
        if (textField.getText() == null || textField.getText() == ""){
            number1 = 0;
        }
        if (plusPressed || minusPressed || multPressed || divPressed){
            plusPressed = true;
            minusPressed = false;
            multPressed = false;
            divPressed = false;
            textField.setText(null);
        } else {
            operationPressed = true;
            plusPressed = true;
            textField.setText(null);
        }
    }

    public void onBtEqualAction(ActionEvent event) {
        if (result == null){
            //
        } else {
            textField.setText(null);
            if (plusPressed) {
                result += result;
                textField.setText((String.format("%d", result)));
            } else if (minusPressed) {
                result -= result;
                textField.setText((String.format("%d", result)));
            } else if (multPressed) {
                result *= result;
                textField.setText((String.format("%d", result)));
            } else if (divPressed) {
                result /= result;
                textField.setText((String.format("%d", result)));
            }
        }

        if (textField.getText() == null || textField.getText() == "" && number1 != 0){
            number2 = 0;
        }
        if (operationPressed == false) {
            Alerts.showAlert("Cannot complete", "No Operations pressed", "A operation must be pressed in order to finalize the complete. \nPlease press on either +, -, x or /", Alert.AlertType.WARNING);
        }

        if (plusPressed == true && result == null) {
            textField.setText(null);
            result = number1 + number2;
            textField.setText((String.format("%d", result)));
        }


    }

//    public void onBt1Action(ActionEvent event) {
//
//    }
}
