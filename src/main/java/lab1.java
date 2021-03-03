import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.*;

public class lab1 extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Line line = new Line(0,0,100,100); //Line
        line.setStroke(Color.DARKBLUE);

        Circle circle = new Circle(150,50, 50);
        circle.setFill(Color.VIOLET);

        Ellipse ellipse = new Ellipse (250,50,30,40);
        ellipse.setFill(Color.SILVER);

        Rectangle rectangle = new Rectangle (350,25,50,50);
        rectangle.setFill(Color.OLIVE);

        Polygon triangle = new Polygon(450.0, 10.0, 410.0, 80.0, 490.0, 80.0);
        triangle.setFill(Color.LIGHTGREEN);

        Polygon star = new Polygon(550.0, 10.0,
                540.0, 50.0,
                510.0, 40.0,
                535.0, 60.0,
                530.0, 90.0,
                550.0, 70.0,
                570.0, 90.0,
                565.0, 60.0,
                590.0, 40.0,
                560.0, 50.0);
        star.setFill(Color.DARKVIOLET);

        Polyline polyline = new Polyline (610.0, 0.0, 600.0, 15.0, 650.0, 50.0, 690.0, 20.0);

        Text text = new Text(20,150,"Вывод простейших фигур на экран!");
        text.setFont(Font.font(25));

        Group group = new Group();
        Scene scene = new Scene(group,800,200);
        group.getChildren().addAll(line,circle,ellipse,rectangle,triangle,star,polyline,text);

        stage.setTitle("Лаба1");
        stage.setScene(scene);
        stage.show();
    }
}
