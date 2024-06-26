package duanjavaoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    public static List<CanBo> lstCanBo = new ArrayList<>();
    
    public static void them(int subAction) {
        if (subAction == 1) {
//            System.out.println("lan 1");
            System.out.println("Nhập số lượng công nhân: ");
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            int number = sc.nextInt();
            
            for (int i = 0; i < number; i++) {
                CongNhan cn = new CongNhan();
                System.out.println("Nhập họ tên: ");
                String hoTen = sc.next();
                cn.hoTen = hoTen;

                System.out.println("Nhập tuổi: ");
                int tuoi = sc.nextInt();
                cn.tuoi = tuoi;

                System.out.println("Nhập giới tính: ");
                int gioiTinh = sc.nextInt();
                cn.gioiTinh = gioiTinh;

                System.out.println("Nhập địa chỉ: ");
                String diaChi = sc.next();
                cn.setDiaChi(diaChi);

                System.out.println("Nhập bậc: ");
                int bac = sc.nextInt();
                cn.bac = bac;

                lstCanBo.add(cn);
            }
        }
        
        if (subAction == 2) {
            System.out.println("Nhập số lượng kỹ sư: ");
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            int number = sc.nextInt();
            
            for (int i = 0; i < number; i++) {
                KySu ks = new KySu();
                System.out.println("Nhập họ tên: ");
                String hoTen = sc.next();
                ks.hoTen = hoTen;

                System.out.println("Nhập tuổi: ");
                int tuoi = sc.nextInt();
                ks.tuoi = tuoi;

                System.out.println("Nhập giới tính: ");
                int gioiTinh = sc.nextInt();
                ks.gioiTinh = gioiTinh;

                System.out.println("Nhập địa chỉ: ");
                String diaChi = sc.next();
                ks.setDiaChi(diaChi);

                System.out.println("Nhập ngành đào tạo: ");
                String nganhDaoTao = sc.next();
                ks.nganhDaoTao = nganhDaoTao;

                lstCanBo.add(ks);
            }
        }
        
        if (subAction == 3) {
            System.out.println("Nhập số lượng nhân viên: ");
            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            int number = sc.nextInt();
            
            for (int i = 0; i < number; i++) {
                NhanVien nv = new NhanVien();
                System.out.println("Nhập họ tên: ");
                String hoTen = sc.next();
                nv.hoTen = hoTen;

                System.out.println("Nhập tuổi: ");
                int tuoi = sc.nextInt();
                nv.tuoi = tuoi;

                System.out.println("Nhập giới tính: ");
                int gioiTinh = sc.nextInt();
                nv.gioiTinh = gioiTinh;

                System.out.println("Nhập địa chỉ: ");
                String diaChi = sc.next();
                nv.setDiaChi(diaChi);

                System.out.println("Nhập công việc: ");
                String congViec = sc.next();
                nv.congViec = congViec;

                lstCanBo.add(nv);
            }
        }
    }
    
    public static void xuat() {
        for (CanBo cb : lstCanBo) {
            System.out.println(cb.hoTen);
            System.out.println(cb.tuoi);
            System.out.println(cb.gioiTinh);
            System.out.println(cb.getDiaChi());
            
            if (cb instanceof CongNhan) {
                System.out.println(((CongNhan) cb).bac);
            }
            if (cb instanceof KySu){
                System.out.println(((KySu) cb).nganhDaoTao);
            }
            if (cb instanceof NhanVien) {
                System.out.println(((NhanVien) cb).congViec);
            }
        }
    }
    
    public static int luaChon() {
        System.out.println("1. Thêm mới công nhân");
        System.out.println("2. Thêm mới kỹ sư");
        System.out.println("3. Thêm mới nhân viên");
        System.out.println("Chọn chức năng: ");
        Scanner sc = new Scanner(System.in);
        int subAction = sc.nextInt();
        return subAction;
    }
    
    public static void timKiem() {
        System.out.println("Nhập tên cần tìm: ");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String name = sc.next();
        
        for (int i = 0; i < lstCanBo.size(); i++) {
            if (lstCanBo.get(i).hoTen.equals(name)) {
                System.out.println(lstCanBo.get(i).hoTen);
                System.out.println(lstCanBo.get(i).tuoi);
                System.out.println(lstCanBo.get(i).gioiTinh);
                System.out.println(lstCanBo.get(i).getDiaChi());
            } else {
                System.out.println("Không có cán bộ phù hợp");
            }
        }
    }
    
    
    public static void main(String[] args) {
        int action = 0;
        while (action >= 0) {
            switch(action) {
                case 1:
                    int subAction = luaChon();
                    them(subAction);
                    break;
                case 2:
                    timKiem();
                    break;
                case 3:
                    xuat();
                    break;
            }
            
            System.out.println("Menu: ");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị thông tin về danh sách cán bộ");
            System.out.println("4. Thoát khỏi chương trình");
            
            System.out.println("Chọn chức năng: ");
            Scanner sc = new Scanner(System.in);
            action = sc.nextInt();
            
            if (action == 4) {
                break;
            }
        }
    }
    
}
