package ADS;


import Main.Main;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Tela1 extends Application {

	private AnchorPane pane;
	private Alert alert;
	private Button T2, T3, T4, T5, T6, T7, T8, T9, T10, Voltar, Sair;
	private static Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		
		initComponents();
		A();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("T1");
		stage.show();
		initLayout();
		Tela1.stage = stage;
       
	
	}
		private void initLayout() {
			
			T2.setLayoutX((pane.getWidth() - T2.getWidth()) / 2);
			T2.setLayoutY(50);
			
			T3.setLayoutX((pane.getWidth() - T3.getWidth()) / 2);
			T3.setLayoutY(100);
			
			T4.setLayoutX((pane.getWidth() - T4.getWidth()) / 2);
			T4.setLayoutY(150);
			
			T5.setLayoutX((pane.getWidth() - T5.getWidth()) / 2);
			T5.setLayoutY(200);
			
			T6.setLayoutX((pane.getWidth() - T6.getWidth()) / 2);
			T6.setLayoutY(250);
			
			T7.setLayoutX((pane.getWidth() - T7.getWidth()) / 2);
			T7.setLayoutY(300);
			
			T8.setLayoutX((pane.getWidth() - T8.getWidth()) / 2);
			T8.setLayoutY(350);
			
			T9.setLayoutX((pane.getWidth() - T9.getWidth()) / 2);
			T9.setLayoutY(400);
			
			T10.setLayoutX((pane.getWidth() - T10.getWidth()) / 2);
			T10.setLayoutY(450);
			
			Voltar.setLayoutX((pane.getWidth() - Voltar.getWidth()) / 9);
			Voltar.setLayoutY(500);
			
			Sair.setLayoutX((pane.getWidth() - Sair.getWidth()) / 9);
			Sair.setLayoutY(550);
		
	}
		
		private void initComponents() {
		
			pane = new AnchorPane();
			pane.setPrefSize(800, 600);
			pane.setStyle("-fx-background-color: linear-gradient(to right, rgba(0,45,666,2), rgba(0,0,555,1));");
			T2 = new Button("		LOGO		");
			T2.getStyleClass().add("T2");
			T3 = new Button("		INFORMACOES		");
			T3.getStyleClass().add("T3");
			T4 = new Button("		Michelangelo Donatello		");
			T4.getStyleClass().add("T4");
			T5 = new Button("		Clarissa Borges			");
			T5.getStyleClass().add("T5");
			T6 = new Button("		Contato		");
			T6.getStyleClass().add("T6");
			T7 = new Button("		Silvana Macêdo		");
			T7.getStyleClass().add("T7");
			T8 = new Button("		Lu Renata		");
			T8.getStyleClass().add("T8");
			T9 = new Button("		Tela9		");
			T9.getStyleClass().add("T9");
			T10 = new Button("		Comentarios		");
			T10.getStyleClass().add("T10");
			Voltar = new Button("		Voltar		");
			Voltar.getStyleClass().add("Voltar");
			Sair = new Button("		Sair			");
			Sair.getStyleClass().add("Sair");
			
			pane.getChildren().addAll(T2, T3, T4, T5, T6, T7, T8, T9, T10, Voltar, Sair);

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
					new Main().start(new Stage());
					alert = new Alert(AlertType.WARNING);
			        alert.setTitle("VOLTANDO");
			        alert.setHeaderText("VOLTEI MEU IRMAO.");
			        alert.setContentText("EH NOIS");
						Tela1.stage.close();
					} catch (Exception e) {
						e.printStackTrace();}
					}});
			
			T2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela2().start(new Stage());
						alert = new Alert(AlertType.WARNING);
				        alert.setTitle("Bem Vindo a BLOMO");
				        alert.setHeaderText("MEU IRMAO.");
				        alert.setContentText("EH NOIS");
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
		
			T3.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela3().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T4.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela4().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T5.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela5().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T6.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela6().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T7.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela7().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T8.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela8().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T9.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela9().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
			
			T10.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent arg0) {
					try {
						new Tela10().start(new Stage());
							Tela1.stage.close();
						} catch (Exception e) {
							e.printStackTrace();}
						}});
		}
			
		public static void main(String[] args) {
			launch(args);
		}
}