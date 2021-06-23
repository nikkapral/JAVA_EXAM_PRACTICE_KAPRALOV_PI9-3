import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    // Запуск программы
    public void start(Stage primaryStage) throws Exception {
        // Указываем Сцену и задаем параметры окна
        Parent root = FXMLLoader.load(getClass().getResource("mainApp.fxml"));
        primaryStage.setTitle("KAPRALOV PI19-3");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
