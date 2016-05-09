/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;
import java.util.Scanner;
public class Silver extends Salon{
		Scanner masukan = new Scanner(System.in);
		String ubah;
		double diskon, total, persen;
		public Silver(String pilihan, String nama, String namaPilihan){
			super (pilihan, nama, namaPilihan);
		}

		public void hitungTotal(){
			if (pilihan.equals("Jasa")){
				diskon = 0.10;
			} else if (pilihan.equals("Produk")){
				System.out.println("Apakah ingin mengubah diskon? Ya/Tidak");
				ubah = masukan.nextLine();
				if (ubah.equals("Ya")){
					System.out.print("Diskon (dalam persen)\t: ");
					persen = masukan.nextDouble();
					diskon = persen/100;
				} else if (ubah.equals("Tidak")){
				diskon = 0.10;
				}
			}
			total = cocokHarga() - (cocokHarga()*diskon);
		}

		public void display(){
		System.out.println("============================");
		System.out.printf("Total Bayar\t: %.2f\n",total);
		System.out.println("============================");
	}
}
