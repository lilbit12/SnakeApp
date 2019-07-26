import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameMenu extends Application {
	
	private Button playBtn;
	private Button highScoreBtn;
	private Button exitBtn;
	
	
	public static void run(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox menu = new VBox();
		menu.setPadding(new Insets(20));
	    menu.setSpacing(10);
	    menu.setAlignment(Pos.CENTER);
	    
	   
		Scene scene = new Scene(menu,400,300);
		primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
        scene.getStylesheets().add(getClass().getResource("gameMenu.css").toExternalForm());
		
        
        playBtn = new Button("Play");
        highScoreBtn = new Button("High Scores");
        exitBtn = new Button("Exit");
        
        menu.getChildren().addAll(playBtn,highScoreBtn,exitBtn);
        
        playBtn.setOnAction(e -> {
        	SnakeGame newGame = new SnakeGame();
        });
       
	}
	
	

}
