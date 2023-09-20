package sunat.gob.pe.canchafutbol;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import sunat.gob.pe.canchafutbol.conexion.ConexionBD;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasenia;
    @FXML
    private Button btnIngresar, btnCancelar;
    @FXML
    private Label lblMensaje;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtUsuario.setText("44649089");
        txtContrasenia.setText("44649089");
    }    
    
    @FXML
    private void actCancelar(ActionEvent e) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void actAceptar(ActionEvent e) {
        if (txtUsuario.getText().isEmpty() || txtContrasenia.getText().isEmpty()) {
            lblMensaje.setText("Por favor introduzca su usuario y contraseña!");
        } else {
            //ConexionBD conexionBD = new ConexionBD();
            //conexionBD.validarLogin(txtUsuario.getText(), txtContrasenia.getText());
            validarLogin();
        }
    }
    
    public void validarLogin() {
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.realizarConexion();
        
        /*
        ConexionBD ccn = new ConexionBD();
        //ccn.conexionDataBase();
        conexionDataBase connectionNow = new conexionDataBase();
        Connection connectDB = connectionNow.conectDataBase();

        String verificarLogin = "SELECT count(1) FROM users WHERE username = '" + txtUsuario.getText()
                + "' AND password = '" + txtContrasenia.getText() + "'AND state = 1";

        try {
            Statement statement = (Statement) connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verificarLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    lblMensaje.setText("Welcome!");
                    FXMLLoader loader = new FXMLLoader(
                            getClass().getResource("/main/com/dota2bet/view/MenuPrincipal.fxml"));
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("MENU DOTA2BET");
                    stage.show();

                    Stage myStage = (Stage) this.btnCancelar.getScene().getWindow();
                    myStage.close();
                } else {
                    lblMensaje.setText("Invalid login, please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
