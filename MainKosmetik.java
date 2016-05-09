package Polimorfisme;
import java.util.Scanner;
public class MainKosmetik {
    static double tot = 0;
    public static void main(String[] args) {
        Premium pr = new Premium();
        Gold go = new Gold();
        Silver si = new Silver();
        BukanAnggota ba = new BukanAnggota();
        Scanner in = new Scanner(System.in);
        System.out.println("===========KOSMETIK SHOP===========");
        String pil;
        do{
        System.out.println("Menu :");
        System.out.println("1. LLorea           35000");
        System.out.println("2. Pond's beaauty   30000");
        System.out.println("3. Tidak beli");
        System.out.print("Pilih menu no : ");
        int men = in.nextInt();
        if (men == 1){
            System.out.println("Member:");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Bukan member");
            System.out.print("no : ");
            int mem = in.nextInt();
            if (mem == 1){
                tot += pr.Lorea();
            }else if(mem == 2){
                tot += go.Lorea();
            }else if(mem == 3){
                tot += si.Lorea();
            }else{
                tot += ba.Lorea();
            }
        }else if (men == 2){
            System.out.println("Member:");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Bukan member");
            System.out.print("no : ");
            int mem = in.nextInt();
            if (mem == 1){
                tot += pr.Ponds();
            }else if(mem == 2){
                tot += go.Ponds();
            }else if(mem == 3){
                tot += si.Ponds();
            }else{
                tot += ba.Ponds();
            }
        }else if (men > 3) {
            System.out.println("Menu yang anda pilih tidak ada");
        }
        System.out.println("Menu pelayanan :");
        System.out.println("1. Facial           50000");
        System.out.println("2. Creambath        40000");
        System.out.println("3. Tidak ingin");
        System.out.print("no : ");
        int jas = in.nextInt();
        if (jas == 1){
            System.out.println("Member:");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Bukan member");
            System.out.print("no : ");
            int mem = in.nextInt();
            if (mem == 1){
                tot += pr.Facial();
            }else if(mem == 2){
                tot += go.Facial();
            }else if(mem == 3){
                tot += si.Facial();
            }else{
                tot += ba.Facial();
            }
        }else if (jas == 2){
            System.out.println("Member:");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.println("4. Bukan member");
            System.out.print("no : ");
            int mem = in.nextInt();
            if (mem == 1){
                tot += pr.Creambath();
            }else if(mem == 2){
                tot += go.Creambath();
            }else if(mem == 3){
                tot += si.Creambath();
            }else{
                tot += ba.Creambath();
            }
        }System.out.print("Ingin tambah pesan (y/n)? ");
        pil = in.next();
        }while(pil.equalsIgnoreCase("y"));
        System.out.println("=====================================\nTotal = "+tot);
        System.out.println("Terima kasih sudah belanja disini");
    }    
}
