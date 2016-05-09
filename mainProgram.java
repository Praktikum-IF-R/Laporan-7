/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;
import java.util.Scanner;
public class mainProgram{
	public static void main (String [] args){
		Scanner masukan = new Scanner (System.in);

	String nama, pilihan1, pilihan2, namaPilihan;
	Premium salon = new Premium();
	salon.outJasa();
	System.out.print("Nama\t: ");
	nama = masukan.nextLine();
	System.out.print("Jasa / Produk\t: ");
	pilihan1 = masukan.nextLine();
	System.out.print("Nama "+pilihan1+"\t: ");
	namaPilihan = masukan.nextLine();
	System.out.print("Keanggotaan\t: ");
	pilihan2 = masukan.nextLine();

	switch (pilihan2){
		case "Premium" :
			Premium obj1 = new Premium(pilihan1, nama, namaPilihan);
			obj1.hitungTotal();
			obj1.display();
		break;
		case "Gold" : 
			Gold obj2 = new Gold(pilihan1, nama, namaPilihan);
			obj2.hitungTotal();
			obj2.display();
		break;
		case "Silver" :
			Silver obj3 = new Silver(pilihan1, nama, namaPilihan);
			obj3.hitungTotal();
			obj3.display();
		break;
		case "nonMember" :
			nonMember obj4 = new nonMember(pilihan1, nama, namaPilihan);
			obj4.hitungTotal();
			obj4.display();
		break;
			}
		}
	}
