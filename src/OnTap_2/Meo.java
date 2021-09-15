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
public class Meo extends VatNuoi {

    boolean tamthe;

    public Meo(String ten, double trongLuong, String thucan, boolean tamthe) {
        super(ten, trongLuong, thucan);
        this.tamthe = tamthe;
    }

    @Override
    public void xuatThongTin() {
        System.err.println("Thông Tin MÈO");
        System.out.println("Tên: " + ten);
        System.out.println("Trọng Lượng : " + trongLuong);
        System.out.println("Thức ăn: " + thucan);
        System.out.println("Tam Thể: " + tamthe);

    }

}
