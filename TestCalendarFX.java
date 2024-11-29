import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.calendarfx.view.CalendarView
public class TestCalendarFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        // 创建一个 CalendarView 控件
        CalendarView calendarView = new CalendarView();

        // 设置场景
        StackPane root = new StackPane();
        root.getChildren().add(calendarView);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("CalendarFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
