package com.paveldejimas.isvestineSildymas;

import com.paveldejimas.bazine.Moketojas;

public class Sildymas extends Moketojas implements SildymasI {
    private double kubai;

    public Sildymas(int moketojoKodas, String vardas, String pavarde , String adresas, double suma , double kubai){
        super(moketojoKodas , vardas , pavarde , adresas , suma);
        this.kubai = kubai;

    }

    public double getKubai(){
        return kubai;
    }
    public void setKubai(double kubai) {
        this.kubai = kubai;
    }

}
