/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprakpbo.bidang;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements MenghitungBidang{
    public int panjang;
    public int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
