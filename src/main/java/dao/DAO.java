package dao;

import Context.DBContext;
import model.DanhMuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<DanhMuc> getListDanhMuc(String ten_danh_muc) {
        List<DanhMuc> list = new ArrayList<>();
        String query = "select * from danh_muc Where danh_muc_cha = 'null'";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new DanhMuc(

                        rs.getInt("ma_danh_muc"), "", "")
                );
            }
        } catch (Exception e) {
        }
        return list;
    }
}
