package com.paveldejimas.isvestineInternetas;

import com.paveldejimas.bazine.Moketojas;

public class Internetas extends Moketojas implements InternetasI {

   private String ip;

   public Internetas (int moketojoKodas, String vardas, String pavarde , String adresas, double suma , String ip){
        super(moketojoKodas, vardas, pavarde, adresas, suma);
        this.ip = ip;
    }
    public String getIp(){
       return ip;
    }
    public void setIp (String ip){
       this.ip = ip;
    }
}
