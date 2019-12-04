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

/**
 *
 * @author DELL
 */
public class ThongkeDao {
    public List<Object[]> getSanPham(){
         List<Object[]> list=new ArrayList<>();
         try {
     ResultSet rs = null;
 try {
 String sql="{call sp_ThongKeNguoiHoc}";
 rs = JdbcHelper.executeQuery(sql);
 while(rs.next()){
 Object[] model={
 rs.getInt("Nam"),
 rs.getInt("SoLuong"),
 rs.getDate("DauTien"),
 rs.getDate("CuoiCung")
 };
 list.add(model);

}
 }
 finally{
 rs.getStatement().getConnection().close();

}
 }
 catch (SQLException ex) {
 throw new RuntimeException(ex);

}
 return list;

}
    }
            

