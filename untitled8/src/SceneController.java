import javafx.collections.transformation.TransformationList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.io.IOException;
public class SceneController {
private Stage stage;
private Scene scene;
private Parent root;

public void switchingScene(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("aa.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
