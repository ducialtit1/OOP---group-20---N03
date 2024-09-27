package Model;
 * @author pc
 */
public class PhieuNhap {
    private String maPhieuNhap;
    private String ngayNhap;


    private int tongPhaiTra;
    private String maNhanVien;
    private String maNhaCungCap;

    public PhieuNhap(String maPhieuNhap, String ngayNhap, int tongPhaiTra, String maNhanVien, String maNhaCungCap) {
        this.maPhieuNhap = maPhieuNhap;
        this.ngayNhap = ngayNhap;
        this.tongPhaiTra = tongPhaiTra;
        this.maNhanVien = maNhanVien;
        this.maNhaCungCap = maNhaCungCap;
    }
}
