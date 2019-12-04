/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class tongketkhachhang {
    private String Makh;
    private String Tenkh;
    private Date Ngaydangki;
    private float  Soluongkh;

    public tongketkhachhang() {
    }

    public tongketkhachhang(String Makh, String Tenkh, Date Ngaydangki, float Soluongkh) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.Ngaydangki = Ngaydangki;
        this.Soluongkh = Soluongkh;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getTenkh() {
        return Tenkh;
    }

    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    public Date getNgaydangki() {
        return Ngaydangki;
    }

    public void setNgaydangki(Date Ngaydangki) {
        this.Ngaydangki = Ngaydangki;
    }

    public float getSoluongkh() {
        return Soluongkh;
    }

    public void setSoluongkh(float Soluongkh) {
        this.Soluongkh = Soluongkh;
    }

  
      
    }

    
    

  
    

    
   
