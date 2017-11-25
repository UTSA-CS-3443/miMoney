package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.transform.Scale;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import application.model.Session;


/**
 *
 */
public class Main extends Application {
	
			
		public static Stage stage;		// stage for displaying scenes in the application
		
		public static Scene currScene;	// the current scene
		
		public Session session;			// Session to control the state of the application
		
		public Parent root;				// root node of the Scene Graph
		
		final int width = 750;
		
		final int length = 500;
		
	@Override
	public void start(Stage primaryStage) {
		
		// create a new session
		session = new Session();
		
		try {

			/*if(! session.currentUser.isPassAuthenticated())
			
			if(! session.currentUser.isPassAuthenticated())
			{
				root = FXMLLoader.load(getClass().getResource("view/resources/Login.fxml"));
			}
			else
			{
			*/	
			
			root = FXMLLoader.load(getClass().getResource("view/resources/MainView.fxml"));
				
			Scale scale = new Scale(1,1,0,0);
			
			Scene scene = new Scene(root);
			
			scene.getRoot().getTransforms().setAll(scale);
			
			
			//Main.setScene(scene);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		stage = primaryStage;
		
	}
	
	
	
	//entry point for the application
	public static void main(String[] args) {
		launch(args);
	}//END main()
	
	public Scene getScene()
	{
		return currScene;
	}//END getScene()
	
	public static void setScene(Scene scene)
	{
		currScene = scene;
		stage.setScene(currScene);
	}// END setScene()
	
}//END APPLICATION CLASS Main
