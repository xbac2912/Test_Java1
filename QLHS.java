package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.text.html.HTML;

public class QLHS {

    ArrayList<HocSinh> listHS = new ArrayList();
    Scanner input = new Scanner(System.in);

    void Nhap() {
        HocSinh hs = new HocSinh();
        hs.nhap();
        listHS.add(hs);
    }

    void Xuat() {
        for (HocSinh x : listHS) {
            x.inThongTin();
        }
    }

    void timMaHS() {
        int maMin, maMax;
        int check = 0;
        System.out.print("Nhap khoang ma min: ");
        maMin = input.nextInt();
        System.out.print("Nhap khoang ma max: ");
        maMax = input.nextInt();
        for (HocSinh x : listHS) {
            if (x.getMaHS() >= maMin && x.getMaHS() <= maMax) {
                x.inThongTin();
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Khong co Hoc Sinh co ma trong khoang: " + maMin + " - " + maMax);
        }
    }
    void sapXep() { // A-Z theo TruongHoc
        Comparator<HocSinh> sx = new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getTruongHoc().compareTo(o2.getTruongHoc());
            }
        };
        Collections.sort(listHS, sx);
        System.out.println("Danh sach sau sap xep");
        for(HocSinh x: listHS) {
            x.inThongTin();
        }
    }
    void KeThua() {
        SinhVien sv = new SinhVien();
        sv.nhapSV();
        sv.inThongTinSV();
    }
}
