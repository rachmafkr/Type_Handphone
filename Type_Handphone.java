/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HANDPHONE;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */

class Handphone {
    // attributes
    private String manufacture;
    private String operatingSystem;
    private String model;
    private int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    public void displayProduct() {
        System.out.println("Manufaktur\t : " + manufacture);
        System.out.println("OS\t\t\t : " + operatingSystem);
        System.out.println("Model\t\t : " + model);
        System.out.println("Harga\t\t : " + harga);
    }
}

class Android extends Handphone {
    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getKeyStore() {
        return keyStore;
    }
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    @Override
    
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Android Key Store : " + keyStore);
    }
}

class BlackBerry extends Handphone {
    private String pinBB;
    
    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getPinBB() {
        return pinBB;
    }
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    @Override
    
    public void displayProduct() {
        super.displayProduct();
        System.out.println("PIN\t\t\t : " + pinBB);
    }
}

class WindowsPhone extends Handphone {
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getWpKeyStore() {
        return wpKeyStore;
    }
    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    @Override
    
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Wp Key Store\t : " + wpKeyStore);
    }
}

public class Type_Handphone {
    public static void main(String[] args) {
        Android androidPhone = new Android("Samsung", "Android", "Grand", 3000000);
        androidPhone.setKeyStore("234ibfd3840fo");

        BlackBerry blackberryPhone = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackberryPhone.setPinBB("BHS249");

        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");

        
        System.out.println("ANDROID");
        androidPhone.displayProduct();
        System.out.println("\nBlackBerry");
        blackberryPhone.displayProduct();
        System.out.println("\nWINDOWSPHONE");
        windowsPhone.displayProduct();
    }
}

