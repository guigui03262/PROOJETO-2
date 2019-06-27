package Main;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import ADS.Tela1;

public class Main extends Application {

	private AnchorPane pane;
	private Button btEntrar, btSair;
	private Alert alert;
	private static Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		initComponents();
		A();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("BBZ");
		stage.show();
		initLayout();
		stage.setResizable(false);
		Main.stage = stage;
       
	
	}
		private void initLayout() {
			
			btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
			btEntrar.setLayoutY(150);
			btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
			btSair.setLayoutY(200);
		
	}
		
		private void initComponents() {
		
			pane = new AnchorPane();
			pane.setPrefSize(400, 300);
			pane.setStyle("-fx-background-color: linear-gradient(to right, rgba(255,45,666,2), rgba(255,0,555,1));");
			btEntrar = new Button("Entrar");
			btEntrar.getStyleClass().add("btEntrar");
			btSair = new Button("Sair");
			btSair.getStyleClass().add("btSair");
			pane.getChildren().addAll(btEntrar, btSair);

		}
		
		private void A() {
			btSair.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					alert = new Alert(AlertType.WARNING);
			        alert.setTitle("AVISO");
			        alert.setHeaderText("SAINDO AQUI MEU IRMAO.");
			        alert.setContentText("FLWSS");
			        alert.showAndWait();
					System.exit(0);
				}
			});
		
			btEntrar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				try {
					new Tela1().start(new Stage());
						Main.stage.close();
					} catch (Exception e) {
						e.printStackTrace();}
					}});
		}
			
		public static void main(String[] args) {
			launch(args);
		}
}