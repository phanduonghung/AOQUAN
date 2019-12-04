/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class tongketsanpham {
    private String Masp;
    private String Tensp;
    private Date Ngaynhap;
    private float Dongia;
    private float Soluong;
    private float Tongso;

    public tongketsanpham() {
    }
    
public String toString(){
        return Masp;
    }
    public tongketsanpham(String Masp, String Tensp, Date Ngaynhap, float Dongia, float Soluong, float Tongso) {
        this.Masp = Masp;
        this.Tensp = Tensp;
        this.Ngaynhap = Ngaynhap;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
        this.Tongso = Tongso;
    }

    public String getMasp() {
        return Masp;
    }

    public void setMasp(String Masp) {
        this.Masp = Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public Date getNgaynhap() {
        return Ngaynhap;
    }

    public void setNgaynhap(Date Ngaynhap) {
        this.Ngaynhap = Ngaynhap;
    }

    public float getDongia() {
        return Dongia;
    }

    public void setDongia(float Dongia) {
        this.Dongia = Dongia;
    }

    public float getSoluong() {
        return Soluong;
    }

    public void setSoluong(float Soluong) {
        this.Soluong = Soluong;
    }

    public float getTongso() {
        return Tongso;
    }

    public void setTongso(float Tongso) {
        this.Tongso = Tongso;
    }

}