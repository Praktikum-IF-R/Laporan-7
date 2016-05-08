package Tugas;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Premium person1 = new Premium(); Gold person2 = new Gold();
        Silver person3 = new Silver(); Non person4 = new Non();
        String p = "Premium"; String q = "Gold"; String r = "Silver"; String s = "Non";
        boolean status = true;
        System.out.println(">>>>>>>>>>>||Salon Kecantikan Ayla||<<<<<<<<<<<");
        System.out.println("ID anda?\nPremium, Gold, Silver?\nNon untuk bukan anggota.");
        System.out.print("Jenis ID anda: ");
        String a = in.next();
        System.out.print("Today Special Discount: ");
        int x = in.nextInt();
        while(status){
        System.out.println("################################################");
        System.out.println("Today Special Discount: "+x+"%");
        System.out.println("@Menu Jasa Ayla:");
        System.out.println("11.Ptg Rambut\tRP 13000\n12.Creambath\tRp 21000");
        System.out.println("@Menu Belanja Ayla:");
        System.out.println("21.Sofia\tRp 20000\n22.Jergens\tRp 32000");
        System.out.println("0.Keluar");
        System.out.print("Input Pilihan: ");
        int c = in.nextInt();
        switch(c){
            case 0  :   status = false; 
                        if(a.equalsIgnoreCase(p)){
                            person1.displayInfo(x);}
                        else if(a.equalsIgnoreCase(q)){
                            person2.displayInfo(x);}
                        else if(a.equalsIgnoreCase(r)){
                            person3.displayInfo(x);}
                        else if(a.equalsIgnoreCase(s)){
                            person4.displayInfo(x);}
                        break;
            case 11 :   if(a.equalsIgnoreCase(p)){
                            person1.countPayment(13000);}
                        else if(a.equalsIgnoreCase(q)){
                            person2.countPayment(13000);}
                        else if(a.equalsIgnoreCase(r)){
                            person3.countPayment(13000);}
                        else if(a.equalsIgnoreCase(s)){
                            person4.countPayment(13000);}
                        break;
            case 12 :   if(a.equalsIgnoreCase(p)){
                            person1.countPayment(21000);}
                        else if(a.equalsIgnoreCase(q)){
                            person2.countPayment(21000);}
                        else if(a.equalsIgnoreCase(r)){
                            person3.countPayment(21000);}
                        else if(a.equalsIgnoreCase(s)){
                            person4.countPayment(21000);}
                        break;
            case 21 :   if(a.equalsIgnoreCase(p)){
                            person1.countPayment(x,20000);}
                        else if(a.equalsIgnoreCase(q)){
                            person2.countPayment(x, 20000);}
                        else if(a.equalsIgnoreCase(r)){
                            person3.countPayment(x, 20000);}
                        else if(a.equalsIgnoreCase(s)){
                            person4.countPayment(20000);}
                        break;
            case 22 :   if(a.equalsIgnoreCase(p)){
                            person1.countPayment(x, 32000);}
                        else if(a.equalsIgnoreCase(q)){
                            person2.countPayment(x, 32000);}
                        else if(a.equalsIgnoreCase(r)){
                            person3.countPayment(x, 32000);}
                        else if(a.equalsIgnoreCase(s)){
                            person4.countPayment(32000);}
                        break;
            default :   System.out.println("Pilihan Tdk Ditemukan...");
        }
        }
    }
}