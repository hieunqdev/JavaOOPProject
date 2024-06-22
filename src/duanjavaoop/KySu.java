package duanjavaoop;

public class KySu extends CanBo{
    public String nganhDaoTao;

    public KySu() {
    }

    public KySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu(String nganhDaoTao, String hoTen, int tuoi, int gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    
    
}
