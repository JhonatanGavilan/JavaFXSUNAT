package sunat.gob.pe.canchafutbol.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
 /*       
    private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bd_canchaFutbol";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    static {
        try {
            Class.forName(CONTROLADOR);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }
    }

    public Connection conectDataBase() {
        Connection connect = null;
        try {
            connect = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion OK!");
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos Dota2Bet");
            e.printStackTrace();
        }
        return connect;
    }
    
   */ 
    
    
    Connection con = null;
    
    public ConexionBD(){
        
    }
    
    public void realizarConexion(){
        try {
            String user = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/bd_canchaFutbol";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión realizada!");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos bd_canchaFutbol!)");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    /*
    public Boolean validarLogin(String usuario, String contrasenia){
        
        realizarConexion();
        
        String verificarLogin = "SELECT count(1) FROM usuarios WHERE usuario = '" + usuario + "' AND contrasenia = '" + contrasenia + "'AND estado = 1";

        try {
            Statement statement = (Statement) connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verificarLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    
                    return true;
                    /*
                    lblMensaje.setText("Welcome!");
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/com/dota2bet/view/MenuPrincipal.fxml"));
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("MENU DOTA2BET");
                    stage.show();

                    Stage myStage = (Stage) this.btnCancelar.getScene().getWindow();
                    myStage.close();
                    
                } else {
                    return false;
                    //lblMensaje.setText("Invalid login, please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    /*
    public boolean registrarCancha(Cancha cancha){
        
    }
    */
    
}
