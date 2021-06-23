import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {


    public TextField firstNumber;
    public Label firstLabel;

    // На нажатие кнопки получаем значение n, делам тект видимым и вызываем getRange
    public void onCalculate(){

        int n = Integer.parseInt(firstNumber.getText());
        firstLabel.setOpacity(100);
        firstLabel.setText(String.valueOf(getRange(n)));

    }

    // Метод возвращает результат вычисления
    public static float getRange(int n){

        float result = 1.0f;
        float firstParameter = 2f;
        if (n == 1 || n == 0)
            return n;

        else {
            for (int i = 1; i < n; i++){
                result = result + (1/firstParameter);
                firstParameter = firstParameter * 2;
            }
            return result;
        }
    }








}
