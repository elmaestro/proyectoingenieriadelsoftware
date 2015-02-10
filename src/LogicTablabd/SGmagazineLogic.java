package LogicTablabd;
import DataTablabd.SGmagazine;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class SGmagazineLogic {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL="";
    
    public boolean insertar(SGmagazine dts){
        sSQL="insert into magazine (id,title,editorial,price,quanty) values (?,?,?,?,?)";
        try {
            
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getId());
            pst.setString(2, dts.getTitle());
            pst.setString(3, dts.getEditorial());
            pst.setDouble(4, dts.getPrice());
            pst.setInt(5, dts.getQuanty());
            
            int n=pst.executeUpdate();
            
            if (n!=0) {
                return true;
            }
            else{
                return false;
            }
            
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    public boolean editar(SGmagazine dts){
        sSQL="update magazine set title=?, editorial=?, price=?, quanty=? where id=?";
        try {
            PreparedStatement pst = cn.prepareCall(sSQL);
            
            
            pst.setString(1, dts.getTitle());
            pst.setString(2, dts.getEditorial());
            pst.setDouble(3, dts.getPrice());
            pst.setInt(4, dts.getQuanty());
            pst.setInt(5, dts.getId());
            
            int n=pst.executeUpdate();
            if (n!=0) {
                return true;
            }
            else{
                return false;
            }
                
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        
    }
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        String [] titulos={"ID","Title","editorial","Price","Quanty"};
        String [] registro=new String[5];
        
        modelo=new DefaultTableModel(null,titulos);
        
        sSQL="select*from magazine where title like '%"+ buscar + "%' order by id";
        try {
            Statement st =cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            
            while(rs.next()){
                registro [0]=rs.getString("id");
                registro [1]=rs.getString("title");
                registro [2]=rs.getString("editorial");
                registro [3]=rs.getString("price");
                registro [4]=rs.getString("quanty");                
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
        
    }
    
    public boolean eliminar (SGmagazine dts){
        sSQL="delete from magazine where id=?";
        try {
            PreparedStatement pst = cn.prepareCall(sSQL);
            pst.setInt(1, dts.getId());
            int n = pst.executeUpdate();
            if (n!=0) {
                return true;
            }
            else{
                return false;
            }
               
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    
    
    
    
    
}
