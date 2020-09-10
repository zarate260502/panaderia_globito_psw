package Controlador;
import java.sql.*;
import Controlador.ConDB;
import java.util.LinkedList;
import java.util.Vector;
import java.util.logging.Logger;

public class MUsuario {
    
    private int id_usu, priv_usu;
    private String nom_usu, appat_usu, user_usu, pass_usu;
    
    
    
    public MUsuario(){
    
    }

    

    //metodo para agregar un nuevo usuario
 public MUsuario CreateUsuario(String nom_usu,String appat_usu, String user, String pass, int priv_usu) throws ClassNotFoundException{
        MUsuario u = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = ConDB.getConDB();
            String q ="INSERT INTO MUsuario (nom_usu, appat_usu, user_usu, pass_usu, priv_usu) VALUES ('?,?,?,?,?')";
            ps = con.prepareStatement(q);
            ps.setString(1, u.nom_usu);
            ps.setString(2, u.appat_usu);
            ps.setString(3, u.user_usu);
            ps.setString(4, u.pass_usu);
            ps.setInt(5, u.priv_usu);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return u;
    }
 
 
 //metodo para consultar todos los usuarios  
 
   public Vector<MUsuario> Lista_usuarios() throws ClassNotFoundException{
        Vector<MUsuario> ls = new Vector<MUsuario>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = ConDB.getConDB();
            String q = "SELECT id_usu,nom_usu,appat_usu,user_usu,priv_usu FROM MUsuario order by id_usu desc";
            ps = con.prepareStatement(q);
            rs = ps.executeQuery();
            while(rs.next()){
            MUsuario user = new MUsuario();
            user.setId_usu(rs.getInt(id_usu));
            user.setNom_usu(rs.getString(nom_usu));
            user.setAppat_usu(rs.getString(appat_usu));
            user.setUser_usu(rs.getString(user_usu));
                ls.add(user);
            }
        
        }catch(SQLException e){
            System.out.println("No encontro la tabla usuario");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            ls = null;
        
        }finally{
            
            try{
                rs.close();
                ps.close();
                con.close();
            
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        
        }
        return ls;
    }
    
     //metodo para actualizar un usuario
    public MUsuario search_by_id(int iduser) throws ClassNotFoundException{
        MUsuario user = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            con = ConDB.getConDB();
            String q = "select id_usu,user_usu,nom_usu,appat_usu,priv_usu from MUsuario where id_usu = ?";
            ps = con.prepareStatement(q);
            ps.setInt(1, iduser);
            while(rs.next()){
                user = new MUsuario();
                user.setId_usu(rs.getInt("id_pan"));
                user.setUser_usu(rs.getString("user_usu"));
                user.setNom_usu(rs.getString("nom_usu"));
                user.setNom_usu(rs.getString("appat_usu"));
                user.setPriv_usu(rs.getInt("priv_usu"));
            }
        
        }catch(SQLException e){
            System.out.println("No encontro la tabla de usuarios");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            user = null;
        }finally{
            
            try{
                rs.close();
                ps.close();
                con.close();
            
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        
        }
        return user;
    }
    //metodo para eliminar un usuario
    public int deleteUser(int id_usu) throws ClassNotFoundException{
        try{
            
            String q = "delete from MUsuario where id=?";
            PreparedStatement preparedStatement= ConDB.getConDB().prepareStatement(q);
            preparedStatement.setInt(1,id_usu);
            int rows = preparedStatement.executeUpdate();
            return rows;
        }catch(SQLException e){
            System.out.println("Error al eliminar más información: "+ e.getMessage());
            return 0;
        }
    }
    
    
    //metodo para buscar un usuario por id
     public static LinkedList<MUsuario> getUsersbyId()
   {
      LinkedList<MUsuario> user_listbyId=new LinkedList<>();
      try
      {
          Connection con=ConDB.getConDB();
          String q = "select id_usu,nom_usu,user_usu from MUsuario where id_usu = ?";
          ResultSet rs = null;
          PreparedStatement pst = null;
          pst = con.prepareStatement(q);
          rs = pst.executeQuery();
                         
        while (rs.next())
         {
            MUsuario u = new MUsuario();
                u.setId_usu(rs.getInt("id_usu"));
                u.setUser_usu(rs.getString("user_usu"));
                u.setNom_usu(rs.getString("nom_usu"));
                user_listbyId.add(u);
                break;
           
            
         }
         rs.close();
         pst.close();
         con.close();
      }
      catch (Exception e)  { 
          e.printStackTrace(); 
          return null;
      }
      return user_listbyId;
   }   
    
    
    
    
     public MUsuario verificarUsuario(String user, String pass) throws ClassNotFoundException{
        MUsuario u = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            con = ConDB.getConDB();
            String q = "select * from MUsuario where user_usu = ? and pass_usu = ?";
            ps = con.prepareStatement(q);
            //enviar los parametros de user y pass
            ps.setString(1, user);
            ps.setString(2, pass);
            //ejecutamos al querry
            rs = ps.executeQuery();
            //buscar adentro de la tabla de musuario los datos que queremos
            while(rs.next()){
                u = new MUsuario();
                u.setId_usu(rs.getInt("id_usu"));
                u.setNom_usu(rs.getString("nom_usu"));
                u.setAppat_usu(rs.getString("appat_usu"));
                u.setUser_usu(rs.getString("user_usu"));
                u.setPass_usu(rs.getString("pass_usu"));
                u.setPriv_usu(rs.getInt("priv_usu"));
                break;
            }
        }catch(SQLException e){
            System.out.println("No conectó con la tabla");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            u = null;
        
        }finally{
            //vamos a cerrar conexiones
            try{
                rs.close();
                ps.close();
                con.close();
            
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        } 
        return u;
    }
    
        //metodos get and set

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public int getPriv_usu() {
        return priv_usu;
    }

    public void setPriv_usu(int priv_usu) {
        this.priv_usu = priv_usu;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getAppat_usu() {
        return appat_usu;
    }

    public void setAppat_usu(String appat_usu) {
        this.appat_usu = appat_usu;
    }

    public String getUser_usu() {
        return user_usu;
    }

    public void setUser_usu(String user_usu) {
        this.user_usu = user_usu;
    }

    public String getPass_usu() {
        return pass_usu;
    }

    public void setPass_usu(String pass_usu) {
        this.pass_usu = pass_usu;
    }
}
        
        
    
      

  
    
  
    
   
    
   
