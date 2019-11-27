package com.paveldejimas.bazine;

public class Moketojas implements MoketojasI {

        int moketojoKodas;
        String vardas;
        String pavarde;
        String adresas;
        double suma;

        public Moketojas(int moketojoKodas, String vardas, String pavarde , String adresas, double suma){
            this.moketojoKodas = moketojoKodas;
            this.vardas = vardas;
            this.pavarde = pavarde;
            this.adresas = adresas;
            this.suma = suma;
    }
    public int getMoketojoKodas(){
            return moketojoKodas;
    }
    public String getVardas() {
            return vardas;
    }
    public String getPavarde() {
            return pavarde;
    }
    public  String getAdresas() {
            return adresas;
    }
    public double getSuma() {
        return suma;
    }
    public void setMoketojoKodas(int moketojoKodas){
            this.moketojoKodas = moketojoKodas;
    }
    public void setVardas(String vardas){
            this.vardas = vardas;
    }
    public void setPavarde (String pavarde){
            this.pavarde = pavarde;
    }
    public void setAdresas (String adresas){
            this.adresas = adresas;
    }
    public void setSuma (double suma){
            this.suma = suma;
    }
}
