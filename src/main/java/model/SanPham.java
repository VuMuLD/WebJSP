package model;

public class SanPham implements Comparable<SanPham>{

    private int ma_san_pham;
    private DanhMuc ma_danh_muc;
    private String ten_san_pham;
    private String hinh_anh;
    private int so_luong;
    private String mo_ta;
    private int don_gia;
    private int giam_gia;

    public SanPham() {
        this.ma_san_pham = ma_san_pham;
        this.ma_danh_muc = ma_danh_muc;
        this.ten_san_pham = ten_san_pham;
        this.hinh_anh = hinh_anh;
        this.so_luong = so_luong;
        this.mo_ta = mo_ta;
        this.don_gia = don_gia;
        this.giam_gia = giam_gia;
    }

    public int getMa_san_pham() {
        return ma_san_pham;
    }

    public void setMa_san_pham(int ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public DanhMuc getMa_danh_muc() {
        return ma_danh_muc;
    }

    public void setMa_danh_muc(DanhMuc ma_danh_muc) {
        this.ma_danh_muc = ma_danh_muc;
    }

    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public String getHinh_anh() {
        return hinh_anh;
    }

    public void setHinh_anh(String hinh_anh) {
        this.hinh_anh = hinh_anh;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }

    public int getGiam_gia() {
        return giam_gia;
    }

    public void setGiam_gia(int giam_gia) {
        this.giam_gia = giam_gia;
    }

    @Override
    public int compareTo(SanPham sp) {
        return Integer.parseInt(String.valueOf(this.ma_san_pham)) - Integer.parseInt(String.valueOf(sp.ma_san_pham));
    }
}
