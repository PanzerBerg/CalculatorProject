package gui;

import com.sun.javafx.binding.StringFormatter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import util.Alerts;

import java.math.BigInteger;

public class MainViewController {

    private Long number1 = null;
    private Long number2 = null;
    private Long result;
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

    private void resetResults() {
        textField.setText(null);
        result = null;
        number1 = null;
        number2 = null;
        operationPressed = false;
        plusPressed = false;
        minusPressed = false;
        multPressed = false;
        divPressed = false;

    }

    public void onBtACAction(ActionEvent event) {
        resetResults();
    }

    public void onBt1Action(ActionEvent event) {
        if (result != null){
            resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("1");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(textField.getText());
                } else {
                    number1 = Long.parseLong(textField.getText());
                }
            } else {
                text = textField.getText();
                textField.setText(text + "1");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(textField.getText());
                } else {
                    number1 = Long.parseLong(textField.getText());
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt2Action(ActionEvent event) {
        if (result != null){
             resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("2");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "2");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt3Action(ActionEvent event) {
        if (result != null){
             resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("3");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "3");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt4Action(ActionEvent event) {
        if (result != null){
           resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("4");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "4");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt5Action(ActionEvent event) {
        if (result != null){
           resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("5");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "5");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt6Action(ActionEvent event) {
        if (result != null){
            resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("6");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "6");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt7Action(ActionEvent event) {
        if (result != null){
            resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("7");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "7");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt8Action(ActionEvent event) {
        if (result != null){
            resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("8");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "8");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBt9Action(ActionEvent event) {
        if (result != null){
            resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("9");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "9");

                if (text.length() < 10) {
                    text = textField.getText();
                    if (operationPressed) {
                        number2 = Long.parseLong(text);
                    } else {
                        number1 = Long.parseLong(text);
                    }
                } else {
                    textField.setText(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }

    }

    public void onBt0Action(ActionEvent event) {
        if (result != null){
            resetResults();
        }

        try {
            if (textField.getText() == null) {
                textField.setText("0");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            } else {
                text = textField.getText();
                textField.setText(text + "0");

                text = textField.getText();
                if (operationPressed) {
                    number2 = Long.parseLong(text);
                } else {
                    number1 = Long.parseLong(text);
                }
            }
        } catch (NumberFormatException e){
            if (operationPressed) {
                textField.setText(String.format("%d",number2));
            } else {
                textField.setText(String.format("%d",number1));
            }
        }
    }

    public void onBtPlusAction(ActionEvent event) {
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

    public void onBtMultAction(ActionEvent event) {
        if (plusPressed || minusPressed || multPressed || divPressed){
            plusPressed = false;
            minusPressed = false;
            multPressed = true;
            divPressed = false;
            textField.setText(null);
        } else {
            operationPressed = true;
            multPressed = true;
            textField.setText(null);
        }
    }

    public void onBtEqualAction(ActionEvent event) {
        if (result != null){
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
            Alerts.showAlert("No imput detected", null, "Please input the second number", Alert.AlertType.WARNING);
        }

        if (!operationPressed) {
            Alerts.showAlert("Cannot complete", "No Operations pressed", "A operation must be pressed in order to finalize the complete. \nPlease press on either +, -, x or /", Alert.AlertType.WARNING);
        }

        if (plusPressed && result == null) {
            textField.setText(null);
            result = (long) (number1 + number2);
            if (result > 2147483647) {
                text = String.format("%d", result);
                int i;
                i = text.length() - 1;
                textField.setText("aprox 1e" + i);
            }else if (result < -2147483647){
                text = String.format("%d", result);
                int i;
                i = (text.length() - 1) * -1;
                textField.setText("aprox 1e" + i);
            } else {
                textField.setText((String.format("%d", result)));
            }

            System.out.println(result);

        } else if (multPressed && result == null) {
            textField.setText(null);
            result = number1 * number2;
            if (result > 999999999) {
                text = String.format("%d", result);
                int i;
                Integer first = Integer.parseInt(String.valueOf(text.charAt(0)));
                i = text.length() - 1;
                textField.setText("aprox " + first + "e" + i);
            } else {
                textField.setText((String.format("%d", result)));
            }

            System.out.println(result);

        }

    }

}
