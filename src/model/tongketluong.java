/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class tongketluong {
    private String MaNv;
    private String TenNv;
    private float Luongnv;
    private float  Songaycong;
    private float Luongthuong;
    private float Tongluong;

    public tongketluong() {
    }

    public tongketluong(String MaNv, String TenNv, float Luongnv, float Songaycong, float Luongthuong, float Tongluong) {
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.Luongnv = Luongnv;
        this.Songaycong = Songaycong;
        this.Luongthuong = Luongthuong;
        this.Tongluong = Tongluong;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public float getLuongnv() {
        return Luongnv;
    }

    public void setLuongnv(float Luongnv) {
        this.Luongnv = Luongnv;
    }

    public float getSongaycong() {
        return Songaycong;
    }

    public void setSongaycong(float Songaycong) {
        this.Songaycong = Songaycong;
    }

    public float getLuongthuong() {
        return Luongthuong;
    }

    public void setLuongthuong(float Luongthuong) {
        this.Luongthuong = Luongthuong;
    }

    public float getTongluong() {
        return Tongluong;
    }

    public void setTongluong(float Tongluong) {
        this.Tongluong = Tongluong;
    }
            
}
