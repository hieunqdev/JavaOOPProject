package duanjavaoop;

public class NhanVien extends CanBo{
    public String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }

    public NhanVien(String congViec, String hoTen, int tuoi, int gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    
    
}
