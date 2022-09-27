package dao;

import model.DanhMuc;

import java.util.ArrayList;

public interface DanhMucDAO {

    //load danh sach danh muc cha
    public ArrayList<DanhMuc> getListDanhMucCha();

    //load danh sach danh muc con
    public ArrayList<DanhMuc> getListDanhMucCon(int ma_danh_muc);
}
