package com.paveldejimas.isvestineTelefonas;

import com.paveldejimas.bazine.Moketojas;

public class Telefonas extends Moketojas implements TelefonasI {
    private int numeris;

    public Telefonas(int moketojoKodas, String vardas, String pavarde , String adresas, double suma,int numeris){
        super(moketojoKodas, vardas, pavarde ,  adresas,  suma);
        this.numeris = numeris;

    }
    public int getNumeris(){
        return numeris;
    }
    public void setNumeris(int numeris){
        this.numeris = numeris;
    }
}

