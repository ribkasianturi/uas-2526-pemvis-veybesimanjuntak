//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI

import java.util.*;
import java.lang.Math;

public class SOAL4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;
        String[] nama = new String[10];
        int[] shift = new int[10];
        int totalShift;
        double ratarata;
        int maxShift, minShift;
        String namaMax, namaMin;

        System.out.println("Masukkan jumlah asisten : ");
        n = Integer.parseInt(input.nextLine());
        for (i = 0; i <= n - 1; i++) {
            nama[i] = input.nextLine();
            shift[i] = Integer.parseInt(input.nextLine());
        }
        totalShift = 0;
        maxShift = shift[0];
        minShift = shift[0];
        namaMax = nama[0];
        namaMin = nama[0];
        for (i = 0; i <= n - 1; i++) {
            totalShift = totalShift + shift[i];
            if (shift[i] > maxShift) {
                maxShift = shift[i];
                namaMax = nama[i];
            }
            if (shift[i] < minShift) {
                minShift = shift[i];
                namaMin = nama[i];
            }
        }
        ratarata = (double) totalShift / n;
        System.out.println("Daftar Shift:");
        for (i = 0; i <= n - 1; i++) {
            System.out.println(nama[i] + "=" + shift[i]);
        }
        System.out.println("Total Shift=" + totalShift);
        System.out.println("Rata-rata=" + ratarata);
        System.out.println("Shift terbanyak=" + namaMax + "(" + maxShift + ")");
        System.out.println("Shift tersedikit=" + namaMin + "(" + minShift + ")");
        System.out.println("Distribusi shift tidak merata, beberapa asisten terbebani.");
    }
}