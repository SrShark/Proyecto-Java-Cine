package DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dao {
  protected Connection conexion;
  protected String servidor = "localhost";
  protected String usuario = "root";
  protected String puerto = "3306";
  protected String baseDatos = "cine";
  protected String password = "khZPGjBnQfU8FHK";
  protected String motor="jdbc:mysql://";
  protected String nameClass="com.mysql.jdbc.Driver";
  protected boolean conecta;

  public void conectar() throws Exception {
    try {
      Class.forName(nameClass);
      conexion = DriverManager.getConnection(motor + servidor + ":" + puerto + "/" + baseDatos +"?useSSL=false", usuario, password);
      conecta=true;
      JOptionPane.showMessageDialog(null, "Se conecto exitosamente..." + conecta);
    }
    catch (Exception e) {
      JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR A BASE" + e.toString());
      throw e;
    }
  }

  public void cerrar() throws Exception  {
    try {
      if (conexion != null) {
        if (conexion.isClosed() == false) {
          conexion.close();
          conecta=false;
          JOptionPane.showMessageDialog(null, "Se pudo terminar la conexion" + conecta);
        }
      }
    } catch (SQLException e)
    {
      JOptionPane.showMessageDialog(null, "Error no se pudo terminar la conexion" + e.toString());
      throw e;
    }
  }
}
