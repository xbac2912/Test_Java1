
package Test;

import java.util.Scanner;

public class SinhVien extends HocSinh{
    private String MaSV;
    private String Email;

    public SinhVien() {
    }

    public SinhVien(String MaSV, String Email) {
        super();
        this.MaSV = MaSV;
        this.Email = Email;
    }

    public SinhVien(String MaSV, String Email, int MaHS, String ID, String TruongHoc) {
        super(MaHS, ID, TruongHoc);
        this.MaSV = MaSV;
        this.Email = Email;
    }
    
    void nhapSV() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap Ma Sv: ");
        this.MaSV = input.nextLine();
        System.out.print("Nhap Email Sv: ");
        this.Email = input.nextLine();
    }
    void inThongTinSV() {
        super.inThongTin();
        System.out.println("Ma Sv: "+this.MaSV+" - Email: "+this.Email);
    }
}
