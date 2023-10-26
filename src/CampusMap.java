import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CampusMap extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
        
        Image image;
        String imagePath = "map.jpg";
        image = new Image(getClass().getResource(imagePath).toString());
        
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);
        imageView.setFitWidth(500);
        
        Rectangle rectangle = new Rectangle(210, 256, 40, 40);
        rectangle.setFill(Color.rgb(0,0,255,0.45));
        rectangle.setStroke(Color.BLACK);
        
        Text text = new Text();
        text.setFont(new Font(20));
        text.setFill(Color.WHITE);
        text.setText("Rektorat");
        
        rectangle.setOnMouseEntered((me) -> {
            text.setVisible(true);
            System.out.println("Rektorat");
            text.setX(me.getX());
            text.setY(me.getY());
            
        });
        
        rectangle.setOnMouseExited((me) -> {
            text.setVisible(false);
        });
        
        Group root = new Group();
        
        root.getChildren().add(imageView);
        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        
        Scene scene = new Scene(root, 500, 470);
        
        primaryStage.setTitle("Campus Map [ITS]");
        primaryStage.setScene(scene);
        primaryStage.show();
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
