import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import org.jfree.fx.FXGraphics2D;
import org.jfree.fx.ResizableCanvas;

public class GUI extends Application {
    private ResizableCanvas canvas;

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane mainPane = new BorderPane();
        canvas = new ResizableCanvas(g -> draw(g), mainPane);
        mainPane.setCenter(canvas);
        FXGraphics2D g2d = new FXGraphics2D(canvas.getGraphicsContext2D());
        stage.setScene(new Scene(mainPane, 1920, 1080));
        stage.setTitle("Moving Character");
        stage.show();
        draw(g2d);
    }


    public void draw(FXGraphics2D graphics) {
        graphics.setTransform(new AffineTransform());
        graphics.setBackground(Color.white);
        graphics.clearRect(0, 0, (int)canvas.getWidth(), (int)canvas.getHeight());
    }


    public static void main(String[] args) {
        launch(GUI.class);
    }

}
