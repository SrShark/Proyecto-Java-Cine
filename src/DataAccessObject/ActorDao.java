package DataAccessObject;

import cine.Actor;
import cine.Sexo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ActorDao extends Dao {

  public void probarConexion() throws Exception {
    this.conectar();
    this.cerrar();
  }

  public void agregarActor(Actor actor) throws Exception {
    try {
      this.conectar();
      PreparedStatement st = conexion.prepareStatement("INSERT INTO tb_actor(nombre,apellido,esanimado,idSexo) VALUES(?,?,?,?)" );

      // Nombre,apellido,esanimado,idsexo
      st.setString(1, actor.getNombre());
      st.setString(2, actor.getApellido());
      st.setBoolean(3, actor.isAnimado());
      st.setInt(4, actor.getSexo().getIdSexo());
      st.executeUpdate();
      JOptionPane.showMessageDialog(null, "Se registro correctamente el Actor \n" + actor.toString());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "No se pudo registrar \n" + e.toString());
      throw e;
    }
  }

  public Actor traerActor() throws Exception {
    ResultSet reader;
    Actor objActor = new Actor();

    try {
      this.conectar();
      PreparedStatement st = conexion.prepareCall("SELECT * FROM tb_actor AS a INNER JOIN tb_sexo AS s ON a.idSexo=s.idSexo where idactor=?");
      reader = st.executeQuery();

      while (reader.next()) {
        objActor = new Actor();
        objActor.setNombre(reader.getString("nombre"));
        objActor.setApellido(reader.getString("apellido"));
        objActor.setAnimado(true);
        Sexo sexo = new Sexo();
        sexo.setIdSexo(reader.getInt("idsexo"));
        sexo.setNombre(reader.getString("s.nombre"));
        objActor.setSexo(sexo);
      }

//    objActor(reader.getString("nombre"));
    } catch (Exception e) {
      throw e;
    } finally {
      this.cerrar();
    }

    return objActor;
  }
}