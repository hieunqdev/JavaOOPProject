package duanjavaoop;

public class CongNhan extends CanBo{
    public int bac;

    public CongNhan() {
    }

    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(int bac, String hoTen, int tuoi, int gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
    
    @Override
    public String toString() {
        return "tqeqkdhdk cong nahn";
    }
}
