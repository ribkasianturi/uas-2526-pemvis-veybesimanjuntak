//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI


import java.util.*;
import java.lang.Math;

public class SOAL3  {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, jumlahAlat, konsumsi, totalOrang, totalKamar;
        String nama;

        n = Integer.parseInt(input.nextLine());
        totalKamar = 0;
        System.out.println("Total konsumsi");
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            jumlahAlat = Integer.parseInt(input.nextLine());
            totalOrang = 0;
            for (j = 1; j <= jumlahAlat; j++) {
                konsumsi = Integer.parseInt(input.nextLine());
                totalOrang = totalOrang + konsumsi;
            }
            System.out.println(nama + "=" + totalOrang + "wh");
            totalKamar = totalKamar + totalOrang;
        }
        System.out.println("Total konsumsi kamar=" + totalKamar + "wh");
        if (totalKamar <= 1000) {
            System.out.println("Konsumsi masih dalam batas wajar.");
        } else {
            System.out.println("Konsumsi melebihi batas wajar");
        }
    }
}