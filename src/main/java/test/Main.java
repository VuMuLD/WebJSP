package test;

import dao.SanPhamDAOImpl;

public class Main {
    public static void main(String[] args) {
        SanPhamDAOImpl sp = new SanPhamDAOImpl();
        System.out.println(sp.getListProductByCategory(Integer.parseInt("5")).size());
    }
}
