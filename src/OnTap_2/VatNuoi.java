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
public class VatNuoi {
    String ten;
    double trongLuong;
    String thucan;
    
public VatNuoi(String ten,double trongLuong,String thucan){
    this.ten = ten;
    this.trongLuong = trongLuong;
    this.thucan = thucan;
}
public void xuatThongTin(){
             System.out.println("Tên" + ten);
}
   
}
