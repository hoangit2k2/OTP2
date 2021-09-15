/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap_2;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class ChuongTrinh {

    public static void main(String[] args) {
        VatNuoi[] arr = new VatNuoi[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Chon 1 để nhập chó");
            System.out.println("Chon 2 để nhập Meo");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhập Tên :");
                    sc = new Scanner(System.in);
                    String name = sc.nextLine();                  
                    System.out.print("Nhập Trọng Lương :");
                    sc = new Scanner(System.in);
                    double tl = sc.nextDouble();                  
                    System.out.print("Nhập Thức ăn :");
                     sc = new Scanner(System.in);
                    String ta = sc.nextLine();                                 
                    arr[i]  = new Cho(name,tl,ta, true);
                    arr[i].xuatThongTin();
                    break;
                case 2:
                    System.out.print("Nhập Tên: ");
                    sc = new Scanner(System.in);
                    String name1 = sc.nextLine();
                    System.out.print("Nhập Trọng Lượng: ");
                    sc = new Scanner(System.in);
                    double tl1 = sc.nextDouble();
                    System.out.print("Nhập Thức ăn: ");
                    sc = new Scanner(System.in);
                    String ta1 = sc.nextLine();
                    arr[i] = new Meo(name1, tl1, ta1, true);
                    arr[i].xuatThongTin();
                    break;
                default:
                    System.out.println("sai");
                    break;
            }
        }
    }
}
