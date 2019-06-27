package ADS;

import Auxiliar.DB;
import Auxiliar.Strings;
import Auxiliar.User;
import ifsc.job2.Main;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Admins {
	private Button btnAdd;
	private TextField txtUser;
	private PasswordField txtPass;

	public void AdminsStage(Stage stage) {

		// creating the classes hierarchy (pane -> scene -> stage)
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		BackgroundImage myBI = new BackgroundImage(new Image("https://i.imgur.com/aXNyIrk.png", 0, 0, false, true),
				BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				BackgroundSize.DEFAULT);
		// then you set to your node
		pane.setBackground(new Background(myBI));

		Tooltip tooltip1 = new Tooltip();
		tooltip1.setText("Voltar para o Menu");

		Button botaovoltar = new Button("Voltar");
		botaovoltar.setLayoutX(10);
		botaovoltar.setLayoutY(8);
		botaovoltar.setOnAction(e -> botaovoltaracao(stage));
		botaovoltar.setTooltip(tooltip1);

		// creating the username textfield
		txtUser = new TextField();
		txtUser.setLayoutX(10);
		txtUser.setLayoutY(40);
		txtUser.setMaxWidth(150);
		txtUser.setMinWidth(150);
		txtUser.setPrefWidth(150);
		txtUser.setPromptText(Strings.username);

		// creating the password textfield
		txtPass = new PasswordField();
		txtPass.setLayoutX(10);
		txtPass.setLayoutY(80);
		txtPass.setMaxWidth(150);
		txtPass.setMinWidth(150);
		txtPass.setPrefWidth(150);
		txtPass.setPromptText(Strings.password);

		// creating the add button
		btnAdd = new Button(Strings.btnAdd);
		btnAdd.setLayoutX(10);
		btnAdd.setLayoutY(130);
		btnAdd.setMaxWidth(150);
		btnAdd.setMinWidth(150);
		btnAdd.setPrefWidth(150);

		TableView<User> usersTable = new TableView<User>();
		usersTable.setLayoutX(180);
		usersTable.setLayoutY(40);
		usersTable.setPrefSize(300, 350);
		usersTable.setEditable(true);
		usersTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		Button botaoremover = new Button("Deletar Usuário");
		botaoremover.setLayoutX(10);
		botaoremover.setLayoutY(160);
		botaoremover.setMaxWidth(150);
		botaoremover.setMinWidth(150);
		botaoremover.setPrefWidth(150);
		botaoremover.setOnAction(e -> botaoremoveracao(usersTable));

		TableColumn<User, String> colName = new TableColumn<>(Strings.name);
		TableColumn<User, String> colPass = new TableColumn<>(Strings.password);
		usersTable.getColumns().add(colName);
		usersTable.getColumns().add(colPass);

		colName.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
		colName.setCellFactory(TextFieldTableCell.forTableColumn());
		colName.setMinWidth(100);

		colPass.setCellValueFactory(new PropertyValueFactory<User, String>("pass"));
		colPass.setCellFactory(TextFieldTableCell.forTableColumn());
		colPass.setMinWidth(100);
		colPass.setOnEditCommit(e -> {
			DB.users.changePass(e.getRowValue().getName(), e.getNewValue());
		});

		// setting the login button behavior using a lambda expression
		btnAdd.setOnMouseClicked(e -> {
			// verificações

			DB.users.addUser(txtUser.getText(), txtPass.getText());
			usersTable.setItems(DB.users.getUsers());

			// alertar

		});

		// adding all created components to the pane
		pane.getChildren().addAll(usersTable, botaovoltar, botaoremover);
		pane.getChildren().add(btnAdd);
		pane.getChildren().add(txtUser);
		pane.getChildren().add(txtPass);

		// setting some stage (window) properties
		stage.setTitle(Strings.appTitle);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
	}

	public void botaovoltaracao(Stage stage) {

		try {
			new Menu().start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void botaoremoveracao(TableView usersTable) {

		ObservableList<User> usuarioselecionado, todosusuarios;
		todosusuarios = usersTable.getItems();
		usuarioselecionado = usersTable.getSelectionModel().getSelectedItems();
		usuarioselecionado.forEach(todosusuarios::remove);

	}

	public void botaoeditaracao(TableView usersTable) {

	}

}