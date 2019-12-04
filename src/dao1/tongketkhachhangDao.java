/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao1;

import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.tongketkhachhang;
import model.tongketsanpham;

/**
 *
 * @author DELL
 */
public class tongketkhachhangDao {
     public void insert( tongketkhachhang model) {
        String sql = "INSERT INTO tongketkhachhang (Makh, Tenkh, Ngaydk,Soluong ) VALUES ( ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMakh(),
                model.getTenkh(),
                model.getNgaydangki(),
                model.getSoluongkh());
    
    
    }

    private  tongketkhachhang readFromResultSet(ResultSet rs) throws SQLException {
      tongketkhachhang model = new  tongketkhachhang();
      model.setMakh(rs.getString("Makh")) ;
      model.setTenkh(rs.getString("Tenkh"));
      model.setNgaydangki(rs.getDate("Ngaydk"));
      model.setSoluongkh(rs.getFloat("Soluong"));
     
        return model;
    }
              
             

    public List< tongketkhachhang> select(String sql, Object... args) {
      
        List< tongketkhachhang> list = new ArrayList<>();

        ResultSet rs ;
        try {
            rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                 tongketkhachhang model = readFromResultSet(rs);
                list.add(model);
            }

            rs.close();

        } catch (SQLException ex) {
        }
        return list;
    }

    public List<tongketkhachhang> select() {
        
             String sql="SELECT * FROM tongketkhachhang";   
            return select(sql);  
             } 

    
}
  

