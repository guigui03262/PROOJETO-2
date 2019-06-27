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


public class Tela8 extends Application {

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
		stage.setTitle("T8");
		stage.show();
		initLayout();
		Tela8.stage = stage;
       
	
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
			
			LB1 = new Label("Lu Renata");
			LB1.setFont(Font.font ("Verdana", 50));
			LB1.setTranslateX(80);
			LB1.setTranslateY(300);
			
			TextArea textArea = new TextArea();
			textArea.setPrefSize(280, 140);
			textArea.setTranslateX(280);
			textArea.setTranslateY(400);
			textArea.setFont(Font.font ("Verdana", 15));
			textArea.setText("\n" + "Lu Renata, Artista, professora e doutoranda no programa de pós-graduação em Artes Visuais" + "\n" +
					" da Udesc Ceart, na linha de pesquisa Processos Artísticos Contemporâneos."+ "\n" +
					" Tem participado de exposições coletivas desde 1998,"+"\n" +
					"oi artista selecionada no 1º Projéteis Artes Visuais da\r\n" + 
					"Funarte, no Salão de Arte Contemporânea Luiz Henrique Schwanke"+ "\n" + " \n");
			
			
			
			Voltar = new Button("		Voltar		");
			Voltar.getStyleClass().add("Voltar");
			Sair = new Button("		Sair			");
			Sair.getStyleClass().add("Sair");
			
			Image F = new Image("https://static.ndonline.com.br/2017/09/cropped/f41b3cc2d0f12714260de965d744b1c516f0e96f.jpg", 500, 300, true, false);
	        ImageView IF = new ImageView(F);
	        IF.setTranslateX(100);
	        IF.setTranslateY(0);
			
	        Image F2 = new Image("https://pbs.twimg.com/profile_images/3763142147/a1b6848ba82ea6ca5aa392ee2cae911c_400x400.jpeg", 200, 200, true, false);
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
						Tela8.stage.close();
					} catch (Exception e) {
						e.printStackTrace();}
					}});
		}
			
		public static void main(String[] args) {
			launch(args);
		}
}