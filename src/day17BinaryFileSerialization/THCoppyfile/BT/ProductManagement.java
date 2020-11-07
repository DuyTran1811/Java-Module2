package day17BinaryFileSerialization.THCoppyfile.BT;

import java.io.Serializable;

public class ProductManagement implements Serializable {
    private String name;
    private String maSanPham;
    private double gia;
    private String HangSanXuat;

    public ProductManagement() {
    }

    public ProductManagement(String name, String maSanPham, double gia, String hangSanXuat) {
        this.name = name;
        this.maSanPham = maSanPham;
        this.gia = gia;
        HangSanXuat = hangSanXuat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return HangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        HangSanXuat = hangSanXuat;
    }

    @Override
    public String toString() {
        return "ProductManagement{" +
                " name = '" + name + '\'' +
                ", ma San Pham ='" + maSanPham + '\'' +
                ", gia = " + gia +
                ", Hang San Xuat = '" + HangSanXuat + '\'' +
                '}';
    }
}
