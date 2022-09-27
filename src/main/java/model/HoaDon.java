package model;

import java.sql.Timestamp;

public class HoaDon {
    private int ma_hoa_don;
    private int ma_tai_khoan;
    private String dia_chi_giao_hang;
    private String phuong_thuc_thanh_toan;
    private Timestamp ngay_giao_hang;
    private Timestamp ngay_mua_hang;

    public HoaDon(int ma_hoa_don, int ma_tai_khoan, String dia_chi_giao_hang, String phuong_thuc_thanh_toan, Timestamp ngay_giao_hang, Timestamp ngay_mua_hang) {
        this.ma_hoa_don = ma_hoa_don;
        this.ma_tai_khoan = ma_tai_khoan;
        this.dia_chi_giao_hang = dia_chi_giao_hang;
        this.phuong_thuc_thanh_toan = phuong_thuc_thanh_toan;
        this.ngay_giao_hang = ngay_giao_hang;
        this.ngay_mua_hang = ngay_mua_hang;
    }

    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }

    public int getMa_tai_khoan() {
        return ma_tai_khoan;
    }

    public void setMa_tai_khoan(int ma_tai_khoan) {
        this.ma_tai_khoan = ma_tai_khoan;
    }

    public String getDia_chi_giao_hang() {
        return dia_chi_giao_hang;
    }

    public void setDia_chi_giao_hang(String dia_chi_giao_hang) {
        this.dia_chi_giao_hang = dia_chi_giao_hang;
    }

    public String getPhuong_thuc_thanh_toan() {
        return phuong_thuc_thanh_toan;
    }

    public void setPhuong_thuc_thanh_toan(String phuong_thuc_thanh_toan) {
        this.phuong_thuc_thanh_toan = phuong_thuc_thanh_toan;
    }

    public Timestamp getNgay_giao_hang() {
        return ngay_giao_hang;
    }

    public void setNgay_giao_hang(Timestamp ngay_giao_hang) {
        this.ngay_giao_hang = ngay_giao_hang;
    }

    public Timestamp getNgay_mua_hang() {
        return ngay_mua_hang;
    }

    public void setNgay_mua_hang(Timestamp ngay_mua_hang) {
        this.ngay_mua_hang = ngay_mua_hang;
    }
}
