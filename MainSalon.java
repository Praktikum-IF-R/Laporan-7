package salon;
import java.util.*;
public class MainSalon {
        public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        Salon premium = new Premium("Customer1 ", "Facial", "Body Lotion", "Premium");;
        Salon gold = new Gold("Customer 2", "Hair Color", "Shampoo", "Gold");
        Salon silver = new Silver("Customer 3", "Masker", "hair vitamin", "Silver");
        Salon Pembeli = new Pembeli("Customer 4", "Creambath", "Soap", "Non-Member");

        System.out.println("============Salon Kecantikan===============");
            System.out.print("Masukan Nama:");
            String nama=input.next();
            System.out.print("Masukan Keanggotaan :");
            String Keanggotaan=input.next();
            
            System.out.println("---Our Service---");
            System.out.println("Hair Mask = 75000");
            System.out.println("Hair Spa = 110000");
            System.out.println("Creambath = 50000");
            System.out.println("Hair Color = 200000");
            System.out.println("Masker = 27000");
            System.out.println("Facial = 95000");
            System.out.println("Milk Massage = 198000");
            System.out.println();
            System.out.println("---Our Product---");
            System.out.println("Soap = 25000");
            System.out.println("Conditioner = 53000");
            System.out.println("Hair Spray = 48000");
            System.out.println("Shampoo = 50000");  
            System.out.println("Hair Vitamin = 35000");
            System.out.println("Body Lotion = 53000");
            System.out.println("SunScreen = 61000");
            System.out.println("Day Cream = 77000");
            System.out.println("Night Cream = 107000");
            System.out.println();
        
        System.out.println("1.Premium\n2.Gold\n3.Silver\n4.Pembeli");
        System.out.print("Mau Liat Keanggotaan Apa");
        int pilih=input.nextInt();
        
        if (pilih==1){
        System.out.println(premium.getDescription());
        System.out.println("              Total Pembayaran   : " + premium.getTotalPrice());
        System.out.println();
        
        }else if(pilih==2){
        System.out.println(gold.getDescription());
        System.out.println("              Total Pembayaran   : " + gold.getTotalPrice());
        System.out.println();
        
        }else if(pilih==3){
        System.out.println(silver.getDescription());
        System.out.println("              Total Pembayaran   : " + silver.getTotalPrice());
        System.out.println();
        
        }else if(pilih == 4){
        System.out.println(Pembeli.getDescription());
        System.out.println("              Total Pembayaran   : " + Pembeli.getTotalPrice());
        System.out.println();
        }else{
                System.out.println("Pilihan Tidak Ada");
        }
            
    }

}