package dao;

import Context.DBContext;
import model.DanhMuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DanhMucDAOImpl implements DanhMucDAO{
    private Throwable ex;

    @Override
    public ArrayList<DanhMuc> getListDanhMucCha() {
        Connection connection = DBContext.getInstance().getConnection();
        String sql = "select * from danh_muc Where danh_muc_cha = 'null'";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                DanhMuc dm = new DanhMuc(rs.getInt("ma_danh_muc"), "", "");
                dm.setMa_danh_muc(rs.getInt("ma_danh_muc"));
                dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
                dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
                arr.add(dm);
            }
            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(DanhMucDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }

    @Override
    public ArrayList<DanhMuc> getListDanhMucCon(int ma_danh_muc) {
        Connection connection = DBContext.getInstance().getConnection();
        String sql = "select * from danh_muc Where danh_muc_cha = '"+ma_danh_muc+"'";
        ArrayList<DanhMuc> arr = new ArrayList<>();
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                DanhMuc dm = new DanhMuc(rs.getInt("ma_danh_muc"), "", "");
                dm.setMa_danh_muc(rs.getInt("ma_danh_muc"));
                dm.setTen_danh_muc(rs.getString("ten_danh_muc"));
                dm.setDanh_muc_cha(rs.getString("danh_muc_cha"));
                arr.add(dm);
            }
            connection.close();
        } catch (SQLException e) {
            Logger.getLogger(DanhMucDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
}
