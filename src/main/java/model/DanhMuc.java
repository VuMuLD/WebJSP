package model;

public class DanhMuc {
    private int ma_danh_muc;
    private String ten_danh_muc;
    private String danh_muc_cha;

    public DanhMuc(int ma_danh_muc, String s, String s1) {
        this.ma_danh_muc = this.ma_danh_muc;
        this.ten_danh_muc = ten_danh_muc;
        this.danh_muc_cha = danh_muc_cha;
    }

    public int getMa_danh_muc() {
        return ma_danh_muc;
    }

    public void setMa_danh_muc(int ma_danh_muc) {
        this.ma_danh_muc = ma_danh_muc;
    }

    public String getTen_danh_muc() {
        return ten_danh_muc;
    }

    public void setTen_danh_muc(String ten_danh_muc) {
        this.ten_danh_muc = ten_danh_muc;
    }

    public String getDanh_muc_cha() {
        return danh_muc_cha;
    }

    public void setDanh_muc_cha(String danh_muc_cha) {
        this.danh_muc_cha = danh_muc_cha;
    }
}
