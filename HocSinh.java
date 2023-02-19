
package Test;

import java.util.Scanner;

public class HocSinh {
    private int MaHS;
    private String ID;
    private String TruongHoc;

    public HocSinh() {
    }

    public HocSinh(int MaHS, String ID, String TruongHoc) {
        this.MaHS = MaHS;
        this.ID = ID;
        this.TruongHoc = TruongHoc;
    }

    public int getMaHS() {
        return MaHS;
    }

    public void setMaHS(int MaHS) {
        this.MaHS = MaHS;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTruongHoc() {
        return TruongHoc;
    }

    public void setTruongHoc(String TruongHoc) {
        this.TruongHoc = TruongHoc;
    }
    
    void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.ID = input.nextLine();
        System.out.print("Nhap Ma HS: ");
        this.MaHS = input.nextInt();
        input.nextLine();
        System.out.print("Nhap Truong Hoc: ");
        this.TruongHoc = input.nextLine();
    }
    void inThongTin() {
        System.out.println("ID: "+this.ID+" - Ma HS: "+this.MaHS+" - Truong Hoc: "+this.TruongHoc);
    }
}
