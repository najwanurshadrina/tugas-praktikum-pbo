/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo.ruang;

import tugasprakpbo.bidang.PersegiPanjang;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume(){
        return super.hitungLuas() * this.tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (super.hitungLuas() + super.hitungKeliling() * this.tinggi);
    }
}
