package gui.entities;

import javafx.scene.control.TextField;

import javax.xml.soap.Text;

public class EqualActions {

    private Long number1 = null;
    private Long number2 = null;
    private Long result;
    private String text;

    private boolean operationPressed = false;
    private boolean plusPressed = false;
    private boolean minusPressed = false;
    private boolean multPressed = false;
    private boolean divPressed = false;

    public EqualActions(){
    }

    public EqualActions(Long number1, Long number2, Long result, String text, boolean operationPressed, boolean plusPressed, boolean minusPressed, boolean multPressed, boolean divPressed) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
        this.text = text;
        this.operationPressed = operationPressed;
        this.plusPressed = plusPressed;
        this.minusPressed = minusPressed;
        this.multPressed = multPressed;
        this.divPressed = divPressed;
    }

    public Long getNumber1() {
        return number1;
    }

    public void setNumber1(Long number1) {
        this.number1 = number1;
    }

    public Long getNumber2() {
        return number2;
    }

    public void setNumber2(Long number2) {
        this.number2 = number2;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isOperationPressed() {
        return operationPressed;
    }

    public void setOperationPressed(boolean operationPressed) {
        this.operationPressed = operationPressed;
    }

    public boolean isPlusPressed() {
        return plusPressed;
    }

    public void setPlusPressed(boolean plusPressed) {
        this.plusPressed = plusPressed;
    }

    public boolean isMinusPressed() {
        return minusPressed;
    }

    public void setMinusPressed(boolean minusPressed) {
        this.minusPressed = minusPressed;
    }

    public boolean isMultPressed() {
        return multPressed;
    }

    public void setMultPressed(boolean multPressed) {
        this.multPressed = multPressed;
    }

    public boolean isDivPressed() {
        return divPressed;
    }

    public void setDivPressed(boolean divPressed) {
        this.divPressed = divPressed;
    }

    public void equalEqual(TextField textField) {

        if (result != null){
            textField.setText(null);
            if (plusPressed) {
                result += result;
//                textField.setText((String.format("%d", result)));
            } else if (minusPressed) {
                result -= result;
//                textField.setText((String.format("%d", result)));
            } else if (multPressed) {
                result *= result;
//                textField.setText((String.format("%d", result)));
            } else if (divPressed) {
                result /= result;
//                textField.setText((String.format("%d", result)));
            }
            setResult(result);
            checkSize(textField);
        }
    }

    public void checkSize (TextField textField){
        if (result > 999999999) {
            text = String.format("%d", result);
            int i;
            i = text.length() - 1;
            textField.setText("aprox 1e" + i);
        }else if (result < -999999999){
            text = String.format("%d", result);
            int i;
            i = (text.length() - 1) * -1;
            textField.setText("aprox 1e" + i);
        } else {
            textField.setText((String.format("%d", result)));
        }
    }

    public void onEqualAction (TextField textField) {
        if (plusPressed && result == null) {
            textField.setText(null);
            result = (number1 + number2);

            checkSize(textField);

            System.out.println(result);

        } else if (multPressed && result == null) {
            textField.setText(null);
            result = number1 * number2;

            checkSize(textField);

            System.out.println(result);

        }

        setResult(result);

    }

    public void onBtAction(String number, TextField textField) {
        if (textField.getText() == null || textField.getText() == "") {
            textField.setText(number);

            text = textField.getText();
            if (operationPressed) {
                setNumber2(Long.parseLong(textField.getText()));
            } else {
                setNumber1(Long.parseLong(textField.getText()));
            }
        } else {
            text = textField.getText();
            textField.setText(text + number);

            if (text.length() >= 9) {
                if (operationPressed) {
                    textField.setText(String.format("%d", number2));
                }else {
                    textField.setText(String.format("%d", number1));
                }
            }else if (operationPressed) {
                setNumber2(Long.parseLong(textField.getText()));
            } else {
                setNumber1(Long.parseLong(textField.getText()));
            }
        }
    }
}
