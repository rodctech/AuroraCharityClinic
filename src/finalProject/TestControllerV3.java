package finalProject;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class TestControllerV3 implements Initializable {
    @FXML
    private TextField textIDNumber;

    @FXML
    private PasswordField textPassword;

    @FXML
    private Label labelDisplayMessage;

    @FXML
    private TextField createAllow;

    //@FXML private Button button = new Button();

    Stage dialogStage = new Stage();
    Scene scene;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    PreparedStatement isAdmin = null;
    ResultSet adminResult = null;
    //Stage newStage = new Stage();

    public TestControllerV3() {
        connection = ConnectionUtilV3.conDB();
    }


    public void loginAction(ActionEvent event) {
        String idNum = textIDNumber.getText().toString();
        String EMP_PASSWORD = textPassword.getText().toString();
        //String CREATE_DELETE_ITEM_ALLOW = createAllow.getText().toString();

        String sql = "SELECT * FROM EMPLOYEE WHERE ID_NUMBER = ? and EMP_PASSWORD = ?";


        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, idNum);
            preparedStatement.setString(2, EMP_PASSWORD);
            resultSet = preparedStatement.executeQuery();


            if (!resultSet.next()) {
                labelDisplayMessage.setTextFill(Color.TOMATO);
                labelDisplayMessage.setText("Login Failed");

            } else {
                //labelDisplayMessage.setTextFill(Color.GREEN);
                //labelDisplayMessage.setTextFill(Color.rgb(0, 100, 0));
                labelDisplayMessage.setTextFill(Color.rgb(0, 0, 128));
                labelDisplayMessage.setText("Login Successful");
                System.out.println("Login Successful");

                String sqlAdmin = "SELECT CREATE_DELETE_ITEM_ALLOW FROM EMPLOYEE WHERE ID_NUMBER = ?";
                //String CREATE_DELETE_ITEM_ALLOW = createAllow.getText().toString();
                isAdmin = connection.prepareStatement(sqlAdmin);
                isAdmin.setString(1, idNum);
                adminResult = isAdmin.executeQuery();

                adminResult.next();
                String theUserIsAdmin = adminResult.getString("CREATE_DELETE_ITEM_ALLOW");

               // Boolean isAdminYesNo = adminResult.next();
                System.out.println(theUserIsAdmin);

                if (theUserIsAdmin.equals("Y")) {
                    logInSuccessAdmin();
                }

                else {
                    logInSuccess();
                }



            }
            if (textIDNumber.getText().isEmpty() || textPassword.getText().isEmpty()) {
                labelDisplayMessage.setTextFill(Color.TOMATO);
                labelDisplayMessage.setText("Please fill out all valid fields");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void logInSuccessAdmin() {

        Stage stage = new Stage();
        Main_ACC_WF mainPage = new Main_ACC_WF();

        try {
            mainPage.start(stage);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }


    @FXML
    public void logInSuccess() {

        Stage stage = new Stage();
        Main_NotAdmin mainPage = new Main_NotAdmin();

        try {
            mainPage.start(stage);
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
