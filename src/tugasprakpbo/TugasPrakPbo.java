/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo;

import java.util.Scanner;
import tugasprakpbo.ruang.Balok;
import tugasprakpbo.ruang.Tabung;

/**
 *
 * @author ASUS
 */
public class TugasPrakPbo {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pilih = new Scanner(System.in);
        int menu;
        
        do {
            System.out.println("MENU");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            menu = pilih.nextInt();
        
            switch (menu){
                case 1:
                    System.out.print("Panjang = "); int panjang = pilih.nextInt();
                    System.out.print("Lebar = "); int lebar = pilih.nextInt();
                    System.out.print("Tinggi = "); int tinggi = pilih.nextInt();
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    System.out.println("Luas Persegi Panjang : " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang : " + balok.hitungKeliling());
                    System.out.println("Volume Balok : " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok : " + balok.hitungLuasPermukaan());
                    
                    break;
                    
                case 2 :
                    System.out.print("Tinggi = "); int Tinggi = pilih.nextInt();
                    System.out.print("Jari-jari = "); double jari = pilih.nextDouble();
                    
                    Tabung tabung = new Tabung(jari, Tinggi);
                    
                    System.out.println("Luas Lingkaran : " + tabung.hitungLuas());
                    System.out.println("Keliling Lingkaran : " + tabung.hitungKeliling());
                    System.out.println("Volume Tabung : " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.hitungLuasPermukaan());
                    
                    break;
                    
                case 3 :
                    System.out.println("Keluar..");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (menu != 3);
    } 
}
