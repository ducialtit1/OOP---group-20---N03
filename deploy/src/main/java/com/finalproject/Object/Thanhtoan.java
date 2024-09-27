package controller;

public class ThanhToan {
    private String maHoaDon;
    private double tongTien;
    private String hinhThucThanhToan; // Các kiểu thanh toán: "TIEN_MAT", "THE_TIN_DUNG", "CHUYEN_KHOAN"

    public ThanhToan(String maHoaDon, double tongTien, String hinhThucThanhToan) {
        this.maHoaDon = maHoaDon;
        this.tongTien = tongTien;
        this.hinhThucThanhToan = hinhThucThanhToan;
    }
}
