package ADS;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Tela5 extends Application {

	private AnchorPane pane;
	private Button Voltar, Sair;
	private Alert alert;
	private Label LB1;
	private static Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		initComponents();
		A();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("T5");
		stage.show();
		initLayout();
		Tela5.stage = stage;
       
	
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
			
			LB1 = new Label("Clarissa Borges");
			LB1.setFont(Font.font ("Verdana", 50));
			LB1.setTranslateX(80);
			LB1.setTranslateY(300);
			
			TextArea textArea = new TextArea();
			textArea.setPrefSize(280, 140);
			textArea.setTranslateX(280);
			textArea.setTranslateY(400);
			textArea.setFont(Font.font ("Verdana", 15));
			textArea.setText("\n" 
					+ " Clarissa Borges mora atualmente em Uberlândia, é artista, mãe e professora de fotografia" + "/n"
					+  "no Curso de Artes Visuais da Universidade Federal de Uberlândia (UFU) desde 2008. Entre" +  "/n"
					+  "1995 e 1999 cursou o Bacharelado em Artes Visuais na Universidade de Brasília, onde" +  "/n"
					+  "concluiu o Mestrado em Arte em 2002.\r\n" 
					+  "Universidade Federal de Santa Catarina (UFSC).."+ "\n" + " \n");
			
			
			
			Voltar = new Button("		Voltar		");
			Voltar.getStyleClass().add("Voltar");
			Sair = new Button("		Sair			");
			Sair.getStyleClass().add("Sair");
			
			Image F = new Image("http://correio.rac.com.br/_midias/jpg/2012/12/13/feiraarte-145257-50ca6ab4394e8.jpg", 500, 300, true, false);
	        ImageView IF = new ImageView(F);
	        IF.setTranslateX(100);
	        IF.setTranslateY(0);
			
	        Image F2 = new Image("https://pbs.twimg.com/profile_images/716796438152417280/o4MX8M23_400x400.jpg", 200, 200, true, false);
	        ImageView IF2 = new ImageView(F2);
	        IF2.setTranslateX(600);
	        IF2.setTranslateY(450);
	        
			
			pane.getChildren().addAll(IF, IF2, Voltar, Sair, textArea, LB1);

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
						Tela5.stage.close();
					} catch (Exception e) {
						e.printStackTrace();}
					}});
		}
			
		public static void main(String[] args) {
			launch(args);
		}
}