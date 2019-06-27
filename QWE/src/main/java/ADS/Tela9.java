package ADS;



import java.io.File;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Tela9 extends Application {

	private AnchorPane pane;
	private Button Voltar, Sair;
	private Alert alert;
	private static Stage stage;
		
		@Override
	    public void start(Stage primaryStage) throws Exception  {
	        String workingDir = System.getProperty("user.dir");
	        final File f = new File(workingDir, "src\\Arte no Egito Antigo.mp4");

	        final Media m = new Media(f.toURI().toString());
	        final MediaPlayer mp = new MediaPlayer(m);
	        final MediaView mv = new MediaView(mp);

	        final DoubleProperty width = mv.fitWidthProperty();
	        final DoubleProperty height = mv.fitHeightProperty();

	        width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
	        height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));

	        mv.setPreserveRatio(true);

	        StackPane root = new StackPane();
	        root.getChildren().add(mv);

	        final Scene scene = new Scene(root, 960, 540);
	        scene.setFill(Color.BLACK);

	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Video Player");
	        primaryStage.show();

	        mp.play();
	    }
		
		public static void main(String[] args) {
			launch(args);
		}
}