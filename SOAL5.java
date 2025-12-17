//12S25024 - VEYBE YOULANDA K M SIMANJUNTAK
//12S25018 - RIBKA SIANTURI

import java.util.*;
import java.lang.Math;

public class SOAL5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;
        String nama;
        double ipk;
        int penghasilan;
        int tanggungan;
        String status;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            ipk = Double.parseDouble(input.nextLine());
            penghasilan = Integer.parseInt(input.nextLine());
            tanggungan = Integer.parseInt(input.nextLine());
            if (ipk >= 3.0 && penghasilan <= 3000000 && tanggungan >= 3) {
                status = "Tidak Lolos";
            } else {
                status = "Lolos Syarat awal";
            }
            System.out.println(nama + "->" + status);
        }
    }
}
