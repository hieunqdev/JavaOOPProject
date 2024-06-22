package duanjavaoop;

public class CanBo {
    public String hoTen;
    public int tuoi;
    public int gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, int tuoi, int gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }
    
    
}
