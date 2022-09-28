package dao;

import Context.DBContext;
import model.DanhMuc;
import model.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SanPhamDAOImpl implements SanPhamDAO {

    @Override
    public ArrayList<SanPham> getListProductByCategory(int ma_danh_muc) {
        Connection cons = DBContext.getInstance().getConnection();
        String sql = "select * from san_pham where ma_danh_muc = '" +ma_danh_muc+ "'";
        ArrayList<SanPham> arr = new ArrayList<>();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMa_san_pham(rs.getInt("ma_san_pham"));
                DanhMuc dm = new DanhMuc(rs.getInt("ma_danh_muc"), "", "");
                sp.setMa_danh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getInt("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));
                arr.add(sp);

            }
            cons.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Override
    public SanPham getChiTietSanPham(int ma_san_pham) {
        Connection cons = DBContext.getInstance().getConnection();
        String sql = "select * from san_pham where ma_san_pham = '" +ma_san_pham+ "'";
        SanPham sp = new SanPham();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc dm = new DanhMuc(rs.getInt("ma_danh_muc"), "", "");
                sp.setMa_san_pham(rs.getInt("ma_san_pham"));
                sp.setMa_danh_muc(dm);
                sp.setTen_san_pham(rs.getString("ten_san_pham"));
                sp.setHinh_anh(rs.getString("hinh_anh"));
                sp.setSo_luong(rs.getInt("so_luong"));
                sp.setMo_ta(rs.getString("mo_ta"));
                sp.setDon_gia(rs.getInt("don_gia"));
                sp.setGiam_gia(rs.getInt("giam_gia"));


            }

        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sp;
    }
}
