package pekan6;

import java.util.Random;
import java.util.Scanner;

public class tugasForWhile2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int percobaan = 0;
        boolean menang = false;

        while (!menang) {
            int dadu1 = random.nextInt(6) + 1; // Nilai antara 1-6
            int dadu2 = random.nextInt(6) + 1; // Nilai antara 1-6
            int hasil = dadu1 + dadu2;

            System.out.println(dadu1 + " + " + dadu2 + " = " + hasil);
            percobaan++;

            if (hasil == 7) {
                System.out.println("Hasil dadu adalah 7!");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                menang = true;
            } else {
                System.out.print("Tebakan anda salah. Apakah mau lempar dadu lagi (ya / tidak)? ");
                String jawaban = scanner.next();
                if (!jawaban.equalsIgnoreCase("ya")) {
                    System.out.println("Anda gagal menang");
                    break;
                }
            }
        }

        scanner.close();
    }
}