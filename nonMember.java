/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;
public class nonMember extends Salon{
		double diskon, total;
		public nonMember(String pilihan, String nama, String namaPilihan){
			super (pilihan, nama, namaPilihan);
		}

		public void hitungTotal(){
			total =cocokHarga();
		}

		public void display(){
		System.out.println("============================");
		System.out.printf("Total Bayar\t: %.2f\n",total);
		System.out.println("============================");
	}	
}

