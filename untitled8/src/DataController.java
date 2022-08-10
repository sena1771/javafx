import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DataController {
    @FXML
    Label nameLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    ImageView Image;
    Stage stage;
    Image myImage= new Image(getClass().getResourceAsStream("confirmed.png"));
    public void displayImage() { //change the photo when pressed the button and with mouse entered property you can change it when mouse is on the photo's above
        Image.setImage(myImage);
    }
    public void displayName(String username)  {
        nameLabel.setText("Hello " + username);

    }
    public void logout(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("logout");
        alert.setHeaderText("You are about to log out!!!");
        alert.setContentText("Are you sure that you wanna exit???");
        if(alert.showAndWait().get()== ButtonType.OK){
        stage=(Stage)scenePane.getScene().getWindow();
        System.out.println("Successfully logged out");
        stage.close();
    } }

}
