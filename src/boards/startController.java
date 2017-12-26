package boards;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;


public class startController
{
    @FXML
    private void handleButtonPlay(MouseEvent e )
    {
    	((Node)(e.getSource())).getScene().getWindow().hide();
        
         try {
        	 Parent root = FXMLLoader.load(getClass().getResource("/boards/board.fxml"));
        	 
        	 Stage stage = new Stage();
        	 stage.setTitle("Chinese Checker");
        	 stage.setScene(new Scene(root, 704, 464));
             stage.show();
             
		} catch (IOException e2) {
			e2.printStackTrace();
		}
    	
    }
}