package dao;

import model.SanPham;

import java.util.ArrayList;

public interface SanPhamDAO {
    //lay danh sach sp dua theo ma chuyen muc
    public ArrayList<SanPham> getListProductByCategory(int ma_danh_muc);

    //chi tiet san pham
    public SanPham getChiTietSanPham(int ma_san_pham);
}
