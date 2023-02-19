package Test;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        QLHS ql = new QLHS();
        Scanner input = new Scanner(System.in);
        int chon;
        while (true) {
            System.out.println("---------------------Menu--------------------");
            System.out.println("1.Nhap danh sach hoc sinh");
            System.out.println("2.Xuat danh sach hoc sinh");
            System.out.println("3.Tim ma hs theo khoang nhap vao");
            System.out.println("4.Sap xep hoc (A-Z) theo TruongHoc");
            System.out.println("5.Ke thua");
            System.out.println("0.Thoat");
            System.out.println("----------------------------------------------");
            System.out.print("Moi nhap: ");
            chon = input.nextInt();
            input.nextLine();
            switch (chon) {
                case 1 -> {
                    while (true) {
                        ql.Nhap();
                        System.out.println("Ban co muon nhap tiep khong?? (y/n)");
                        if (input.nextLine().equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                }
                case 2 -> {
                    ql.Xuat();
                }
                case 3 -> {
                    ql.timMaHS();
                }
                case 4 -> {
                    ql.sapXep();
                }
                case 5 -> {
                    ql.KeThua();
                }
                case 6 -> {
                    //break;
                }
                default -> {
                    System.out.println("Khong co chuc nang trong chuong trinh.");
                }
            } // dong sw
            if(chon == 6) break;
        }// dong while
    }
}
