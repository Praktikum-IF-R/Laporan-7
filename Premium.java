
package bab7;
import java.util.Scanner;
public class Premium extends Salon{
		Scanner masukan = new Scanner(System.in);
		String ubah;
		double diskon, total, persen;
		public Premium(){
		}
		
		public Premium(String pilihan, String nama, String namaPilihan){
			super (pilihan, nama, namaPilihan);
		}

		public void hitungTotal(){
			if (pilihan.equals("Jasa")){
				diskon = 0.20;
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
