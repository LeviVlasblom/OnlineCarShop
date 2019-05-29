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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

import org.jfree.fx.FXGraphics2D;
import org.jfree.fx.ResizableCanvas;

public class GUI extends Application {
    private ResizableCanvas canvas;
    private VBox vbox;
    private BorderPane mainPane = new BorderPane();
    private TextField txtFEmail;
    private TextField txtFPw;
    private Text lblEmail;
    private Text lblPw;

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainPane = new BorderPane();
        canvas = new ResizableCanvas(g -> draw(g), mainPane);
        mainPane.setCenter(canvas);
        FXGraphics2D g2d = new FXGraphics2D(canvas.getGraphicsContext2D());
        stage.setScene(new Scene(mainPane, 1920, 1080));
        stage.setTitle("CAA");
        stage.show();
        draw(g2d);
    }


    public void draw(FXGraphics2D graphics) {
        graphics.setTransform(new AffineTransform());
        graphics.setBackground(Color.LIGHT_GRAY);
        graphics.clearRect(0, 0, (int)canvas.getWidth(), (int)canvas.getHeight());

        loginMenu();
    }

    public void loginMenu(){

        vbox = new VBox();
        txtFEmail = new TextField();
        txtFPw = new TextField();
        lblEmail = new Text("Email");
        lblPw = new Text("Password");

//        lblEmail.setFill();

        lblEmail.setTranslateX(canvas.getWidth() / 2);
        lblEmail.setTranslateY(canvas.getHeight() / 2);
        lblPw.setTranslateX(canvas.getWidth() / 2);
        lblPw.setTranslateY(canvas.getHeight() / 2 + 20);




        vbox.getChildren().add(lblEmail);
        vbox.getChildren().add(lblPw);
        mainPane.getChildren().add(vbox);

    }


    public static void main(String[] args) {
        launch(GUI.class);
    }

}

