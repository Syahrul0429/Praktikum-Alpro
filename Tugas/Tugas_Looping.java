//Nama : Syahrul  Romadhani
//NIM  : G50120004
//Pemograman Perulangan menggunakan  Scanner
//Program Melihat Bilangan Ke-n Dengan Kelipatan Ke-m 

package Tugas;

import java.util.Scanner;

public class Tugas_Looping {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, m, r;
		System.out.print("Masukan banyaknya bilangan  : ");
		n = scan.nextInt();
		System.out.print("Masukan Bilangan Angka Kelipatan  : ");
		m = scan.nextInt();
		
		
		for (int a = 1; a<=n;a++){
			 	r = a * m;
				System.out.println(" Bilangan Ke-" + a +" Dengan Kelipatan " + m + " Adalah " + r );
					
		}	
	}
}


