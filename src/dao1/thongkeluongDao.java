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
import model.tongketluong;


/**
 *
 * @author DELL
 */
public class thongkeluongDao {
      public void insert( tongketluong model) {
        String sql = "INSERT INTO tongketluong (MaNv,TenNv LuongNv,Songaycong,Luongthuong,Tongluong ) VALUES ( ?, ?, ?, ?,?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaNv(),
                model.getTenNv(),
                model.getLuongnv(),
                model.getSongaycong(),
                model.getLuongthuong(),
                model.getTongluong());
    
    
    }

    private  tongketluong readFromResultSet(ResultSet rs) throws SQLException {
      tongketluong model = new  tongketluong();
      model.setMaNv(rs.getString("MaNv")) ;
      model.setTenNv(rs.getString("TenNv"));
      model.setLuongnv(rs.getFloat("Luongnv"));
      model.setSongaycong(rs.getFloat("Songaycong"));
      model.setLuongthuong(rs.getFloat("Luongthuong"));
      model.setTongluong(rs.getFloat("Tongluong"));
        return model;
    }
              
             

    public List< tongketluong> select(String sql, Object... args) {
      
        List< tongketluong> list = new ArrayList<>();

        ResultSet rs ;
        try {
            rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                 tongketluong model = readFromResultSet(rs);
                list.add(model);
            }

            rs.close();

        } catch (SQLException ex) {
        }
        return list;
    }

    public List<tongketluong> select() {
        
             String sql="SELECT * FROM tongketluong";   
            return select(sql);  
             } 
}
