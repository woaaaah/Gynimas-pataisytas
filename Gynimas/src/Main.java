import com.paveldejimas.bazine.Moketojas;
import com.paveldejimas.isvestineTelefonas.Telefonas;
import com.paveldejimas.isvestineInternetas.Internetas;
import com.paveldejimas.isvestineSildymas.Sildymas;

public class Main {

    public static void main(String[] args) {

        Moketojas Tomas = new Moketojas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 200);
        Moketojas Petras = new Moketojas(258458, "Petras", "Petrauskas", "Vilniaus 63-57", 300);
        Moketojas Lukas = new Moketojas(685485, "Lukas", "Lukauskas", "Kauno 63-57", 150);

        Telefonas Nokia = new Telefonas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 500, 865845685);
        Telefonas Motorola = new Telefonas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 20, 865548985);
        Telefonas LG = new Telefonas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 25, 865848985);

        Internetas Telia = new Internetas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 100, "254.22.245.99");
        Internetas Kauno = new Internetas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 40, "254.22.263.99");
        Internetas Vilniaus = new Internetas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 20, "254.22.288.99");

        Sildymas Klaipedos = new Sildymas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 30, 20.2);
        Sildymas Rusijos = new Sildymas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 400, 25.2);
        Sildymas Antarktikos = new Sildymas(552585, "Tomas", "Petrauskas", "Jonavos 63-57", 100, 30.2);


        Moketojas transportai[] = new Moketojas[12];
        transportai[0] = Tomas;
        transportai[1] = Petras;
        transportai[2] = Lukas;
        transportai[3] = Nokia;
        transportai[4] = Motorola;
        transportai[5] = LG;
        transportai[6] = Telia;
        transportai[7] = Kauno;
        transportai[8] = Vilniaus;
        transportai[9] = Klaipedos;
        transportai[10] = Rusijos;
        transportai[11] = Antarktikos;
        double suma = 0;
        double sumas = 0;
        for (Moketojas zmogus : transportai) {
            if (zmogus instanceof Telefonas) {
                Telefonas statybininkas = (Telefonas) zmogus;
                suma = suma + statybininkas.getSuma();
            }
        }
            for (Moketojas zmogus : transportai){
            if (zmogus instanceof Internetas) {
                Internetas statybininkas = (Internetas) zmogus;
                sumas = sumas + statybininkas.getSuma();
            }

        }
        System.out.println("Moketi uz telefona: " + suma);
        System.out.println("Moketi uz interneta" + sumas);
        System.out.println("Moketi uz interneta ir telefona" + (suma + sumas) );

    }

}
