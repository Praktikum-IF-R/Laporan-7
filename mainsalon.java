/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum7;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class mainsalon {
    public static void main(String[] args) {
        double jasa=0;
        int dskn;
        String ja;
        Scanner masuk=new Scanner(System.in);
        System.out.println("~~selamat datang di salon yeppeo~~");
        System.out.println("produk yang kami jual:\n1. masker\t25.000\n2. cat rambut\t100.000\n3. kutek\t15.000\n4. shampoo\t30.000");
        System.out.print("banyak masker yang dibeli     : ");
        int bm=masuk.nextInt();
        System.out.print("banyak cat rambut yang dibeli : ");
        int bc=masuk.nextInt();
        System.out.print("banyak kutek yang dibeli      : ");
        int bk=masuk.nextInt();
        System.out.print("banyak shampoo yang dibeli    : ");
        int bs=masuk.nextInt();
        System.out.println("--------------------------------------");
        System.out.println("jasa yang kami tawarkan:\n1. creambath\t50.000\n2. haircut\t45.000");
        do{
            System.out.print("masukan jasa yang dipilih: ");
            int pilih=masuk.nextInt();
            switch(pilih){
                case 1: jasa+=50000;break;
                case 2: jasa+=45000;break;
            }
            System.out.print("apakah ingin tambah jasa?(y/n) ");
            ja=masuk.next();
        }while(ja.equalsIgnoreCase("y"));
        System.out.println("---------------------------------------------------------");
        System.out.print("apakah anda memiliki kartu keanggotaan?(y/n) ");
        String jwb=masuk.next();
        if(jwb.equalsIgnoreCase("y")){
            System.out.println("1. premium\n2. gold\n3. silver");
            System.out.print("pilih golongan keanggotaan anda: ");
            int ang=masuk.nextInt();
            System.out.print("masukan besar diskon semua anggota hari ini: ");
            dskn=masuk.nextInt();
            switch(ang){
                case 1:premium premium=new premium(bm,bc,bk,bs,jasa,dskn);
                    premium.display();break;
                case 2:gold gold=new gold(bm,bc,bk,bs,jasa,dskn);
                    gold.display();break;
                case 3:silver silver=new silver(bm,bc,bk,bs,jasa,dskn);
                    silver.display();break;
            }
        }
        else{
            dskn=0;
            nonanggota pembeli=new nonanggota(bm,bc,bk,bs,jasa,dskn);
            pembeli.display();
        }
    }
}
