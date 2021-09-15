/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap_2;



/**
 *
 * @author Owner
 */
public class Cho extends VatNuoi {

    public boolean domLuoi;

    public Cho(String ten, double trongLuong, String thucan, boolean domluoi) {
        super(ten, trongLuong, thucan);
        this.domLuoi = domluoi;
    }
    @Override
    public void xuatThongTin() {
        System.err.println("Thông Tin Chó");
        System.out.println("Tên: " + ten);
        System.out.println("Trọng Lượng: " + trongLuong);
        System.out.println("Thức Ăn: " + thucan);
        System.out.println("Đốm Lưới: " + domLuoi);

    }

}
