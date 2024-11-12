package pekan5;

import java.util.Scanner;

public class perulanganFor4 {

	public static void main(String[] args) {
		int jumlah=0;
		int angka;
		
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan nilai angka = ");
        angka = input.nextInt();
        
        input.close();
		for (int i=1; i <= angka ; i++) {
			System.out.print(i);
			jumlah = jumlah +i;
			if (i<angka) {
				System.out.print("  +  ");
			}
		}
		System.out.println();
		System.out.println("Jumlah = "+jumlah);
	}

}