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

import model.tongketsanpham;

/**
 *
 * @author DELL
 */
public class tongketsanphamdao {

    public void insert(tongketsanpham model) {
        String sql = "INSERT INTO tongketsanpham (masp, tensp, ngaynhap, soluong, tongso) VALUES ( ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                model.getMasp(),
                model.getTensp(),
                model.getNgaynhap(),
                model.getDongia(),
                model.getSoluong(),
                model.getTongso());
    
    
    }

    private tongketsanpham readFromResultSet(ResultSet rs) throws SQLException {
        tongketsanpham model = new tongketsanpham();
      model.setMasp(rs.getString("Masp")) ;
      model.setTensp(rs.getString("Tensp"));
      model.setNgaynhap(rs.getDate("Ngaynhap"));
      model.setDongia(rs.getFloat("Dongia"));
      model.setSoluong(rs.getFloat("Soluong"));
      model.setTongso(rs.getFloat("Tongso"));
        return model;
    }
              
             public List<tongketsanpham> select(){      
             String sql="SELECT * FROM tongketsanpham ";   
            return select(sql);  
             } 

    public List<tongketsanpham> select(String sql, Object... args) {
      
        List<tongketsanpham> list = new ArrayList<>();

        ResultSet rs ;
        try {
            rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {
                tongketsanpham model = readFromResultSet(rs);
                list.add(model);
            }

            rs.close();

        } catch (SQLException ex) {
        }
        return list;
    }


    
}
  