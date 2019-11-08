/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan55.handphone;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi :Program Menampilkan jenis2 Handphone sesuai dengan subclassnya
 */
public class PBOULANG10114504Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android a = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry b = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        a.setKeyStore("234ibfd3840fo");
        b.setPinBB("BHS249");
        w.setWpKeyStore("UUUQIJWORJ");
        
        a.displayProduct();
        System.out.println("Android Key Store : " + a.getKeyStore());
        System.out.println();
        
        b.displayProduct();
        System.out.println("PIN : " + b.getPinBB());
        System.out.println();
        
        w.displayProduct();
        System.out.println("Wp Key Store : " + w.getWpKeyStore());
    
    }
    
}
