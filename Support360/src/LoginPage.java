import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class LoginPage extends Application
{
	@Override
	public void start(Stage stage)
	{
		stage.setTitle("Support360 Login Page");
		
		//set up page as grid
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		
		//Username label and entry field
		Label userLabel = new Label("Username:");
		grid.add(userLabel, 0, 1);
		TextField userField = new TextField();
		grid.add(userField, 1, 1);
		
		//Password label and entry field
		Label passLabel = new Label("Password:");
		grid.add(passLabel, 0, 2);
		PasswordField passField = new PasswordField();
		grid.add(passField, 1, 2);
		
		//login button
		Button loginButton = new Button("Login");
		grid.add(loginButton, 1, 3);
		
		//One-time code account creation
		Label otcLabel = new Label("One-time code:");
		grid.add(otcLabel, 0, 4);
		TextField otcField = new TextField();
		grid.add(otcField, 1, 4);
		
		//create account button
		Button createAccount = new Button("Create Account");
		grid.add(createAccount, 1, 5);
		
		//scene creation
		Scene scene = new Scene(grid, 300, 250);
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}
