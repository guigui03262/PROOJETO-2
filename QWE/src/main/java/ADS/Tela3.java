package ADS;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Tela3 extends Application {

	private AnchorPane pane;
	private Alert alert;
	private Button Voltar, Sair, BT;
	private Label LB1, LB2;
	public TextField tx;
	private static Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		initComponents();
		A();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("QUEM SOMOS");
		stage.show();
		initLayout();
		Tela3.stage = stage;
       
	
	}
		private void initLayout() {
			
			Voltar.setLayoutX((pane.getWidth() - Voltar.getWidth()) / 9);
			Voltar.setLayoutY(500);
			
			Sair.setLayoutX((pane.getWidth() - Sair.getWidth()) / 9);
			Sair.setLayoutY(550);
			
			BT.setLayoutX((pane.getWidth() - BT.getWidth()) / 9);
			BT.setLayoutY(450);
		
	}
		
		private void initComponents() {
		
			pane = new AnchorPane();
			pane.setPrefSize(800, 600);
			pane.setStyle("-fx-background-color: linear-gradient(to right, rgba(0,45,666,2), rgba(0,0,555,1));");
			
			LB2 = new Label("BLombo" + "\n" +  "\n"
					+ "A Blombô é uma plataforma de exposição de"+ "\n"
					+ "artes plásticas, fotografia, antiquariato e mais. "+ "\n"
					+ "Descubra todos expositores e artistas, aberto para "+ "\n"
					+ "qualquer pessoa participar."+ "\n"
					+ "Criada para todos, de curiosos a colecionadores e etc. "+ "\n"
					+ "Conheça a Blombô agora!. "+ "\n");
			LB2.setFont(Font.font ("Verdana", 30));
			
			LB1 = new Label("Newsletter");
			LB1.setFont(Font.font ("Verdana", 40));
			LB1.setLayoutX((pane.getWidth() - pane.getWidth()) / 2);
			LB1.setLayoutY(350);
			
			tx = new TextField();
			tx.setPromptText("Email...				");
			tx.setLayoutX((pane.getWidth() - tx.getWidth()) / 2);
			tx.setLayoutY(400);
			
			BT = new Button("		Enviar		");
			BT.getStyleClass().add("BT");
			
			
			Voltar = new Button("		Voltar		");
			Voltar.getStyleClass().add("Voltar");
			Sair = new Button("		Sair			");
			Sair.getStyleClass().add("Sair");
			
			pane.getChildren().addAll(Voltar, Sair, tx, LB1, LB2, BT);

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
						Tela3.stage.close();
					} catch (Exception e) {
						e.printStackTrace();}
					}});
			
			BT.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					alert = new Alert(AlertType.WARNING);
			        alert.setTitle("ENVIADO");
			        alert.setHeaderText("BOA JOVEM.");
			        alert.setContentText("É NOIS");
			        alert.showAndWait();
				}
			});
		}
			
		public static void main(String[] args) {
			launch(args);
		}
}