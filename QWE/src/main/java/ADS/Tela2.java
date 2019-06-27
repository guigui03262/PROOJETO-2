package ADS;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Tela2 extends Application {

	private AnchorPane pane;
	private Button Voltar, Sair;
	private Alert alert;
	private static Stage stage;
	private Label LB1;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		initComponents();
		A();
		
		Scene scene = new Scene(pane);
		
		stage.setScene(scene);
		stage.setTitle("T2");
		stage.show();
		initLayout();
		Tela2.stage = stage;
       
		
		 
	}
		private void initLayout() {
			
			Voltar.setLayoutX((pane.getWidth() - Voltar.getWidth()) / 9);
			Voltar.setLayoutY(500);
			
			Sair.setLayoutX((pane.getWidth() - Sair.getWidth()) / 9);
			Sair.setLayoutY(550);
		
	}
		
		private void initComponents() {
		
			
			
			
			pane = new AnchorPane();
			pane.setPrefSize(800, 600);
			pane.setStyle("-fx-background-color: linear-gradient(to right, rgba(0,45,666,2), rgba(0,0,555,1));");
			
			Voltar = new Button("		Voltar		");
			Voltar.getStyleClass().add("Voltar");
			Sair = new Button("		Sair			");
			Sair.getStyleClass().add("Sair");
			
			Image F = new Image("https://vignette.wikia.nocookie.net/dwai/images/5/57/Blombo_the_Big_Blobman_Boi.png/revision/latest?cb=20170619234405", 500, 500, true, false);
	        ImageView IF = new ImageView(F);
	        IF.setTranslateX(100);
	        IF.setTranslateY(0);
			
	        
	        LB1 = new Label("BLombo 2019");
			LB1.setFont(Font.font ("Verdana", 50));
			LB1.setTranslateX(100);
			LB1.setTranslateY(400);
			
			pane.getChildren().addAll(IF, Voltar, Sair, LB1);

		}
		
		private void A() {
			Sair.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					alert = new Alert(AlertType.WARNING);
			        alert.setTitle("AVISO");
			        alert.setHeaderText("SAINDO AQUI MEU IRMAO.");
			        alert.setContentText("FLWSS");
			        alert.showAndWait();
					System.exit(0);
				}
			});
		
			Voltar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				try {
					new Tela1().start(new Stage());
						Tela2.stage.close();
					} catch (Exception e) {
						e.printStackTrace();}
					}});
		}
			
		public static void main(String[] args) {
			launch(args);
		}
}