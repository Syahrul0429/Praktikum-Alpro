//Nama : Syahrul  Romadhani
//NIM  : G50120004
//Pemograman Perulangan menggunakan  Scanner
//Program Melihat Bilangan Genap Ke-n

package Tugas;

import java.util.Scanner;

public class New_Tugas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, m;
		System.out.print("Masukan banyaknya bilangan yang di inginkan : ");
		n = scan.nextInt();
		
		for (int a = 1; a<=n;a++){
			 	m = a*2;
				System.out.println(" Bilangan Genap Ke-" + a + " Adalah " + m );
					
		}	
	}
}

