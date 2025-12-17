//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI

import java.util.*;
import java.lang.Math;

public class SOAL2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahBarang;
        int stokAwal;
        int terjual;
        int sisa;
        int i;
        String namaBarang;
        String status;

        jumlahBarang = Integer.parseInt(input.nextLine());
        System.out.println("Nama");
        System.out.println("StokAwal");
        System.out.println("Terjual");
        System.out.println("Sisa");
        System.out.println("Status");
        for (i = 1; i <= jumlahBarang; i++) {
            namaBarang = input.nextLine();
            stokAwal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            sisa = stokAwal - terjual;
            if (sisa <= 0) {
                status = "Habis, segera restock!";
            } else {
                if (sisa <= 5) {
                    status = "Stok menipis";
                } else {
                    status = "Stok aman";
                }
            }
            System.out.println(namaBarang);
            System.out.println(stokAwal);
            System.out.println(terjual);
            System.out.println(sisa);
            System.out.println(status);
        }
    }
}