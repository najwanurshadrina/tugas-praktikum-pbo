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
public class Lingkaran implements MenghitungBidang {
    public double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas(){
        return Math.PI * this.jariJari * this.jariJari;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
}