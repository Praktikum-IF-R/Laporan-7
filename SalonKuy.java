package polymorphysm;
import java.util.Scanner;
public class SalonKuy {
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        Scanner st = new Scanner (System.in);
        String nama, jawab, nambah, jasa, produk, js1 = "", js2 = "", js3 = "", pr1 = "", pr2 = "";
        double byrjs = 0, byrp = 0, totski, disc = 0;
        int choose, choosemem;
        System.out.println("==========      SELAMAT DATANG DI SALONKUY!     ==========");
        System.out.println("Silakan isi data diri anda.");
        System.out.print("Nama : ");
        nama = st.nextLine();
        System.out.print("Memiliki member? (y/n) : ");
        jawab = st.nextLine();
        if(jawab.equalsIgnoreCase("y")){
            do{
                System.out.println("\nSilakan pilih jasa/produk yang anda inginkan.");
                System.out.println("1. Creambath (jasa)");
                System.out.println("2. Haircut (jasa)");
                System.out.println("3. Facial (jasa)");
                System.out.println("4. Nailart (produk)");
                System.out.println("5. Haircolor (produk)");
                System.out.print("Pilihan anda : ");
                choose = in.nextInt();
                switch(choose){
                    case 1:
                        js1 = "Creambath ";
                        byrjs += 20000;break;
                    case 2:
                        js2 = "Haircut   ";
                        byrjs += 15000;break;
                    case 3:
                        js3 = "Facial    ";
                        byrjs += 35000;break;
                    case 4:
                        pr1 = "Nailart   ";
                        disc = 10;
                        byrp += 50000;break;
                    case 5:
                        pr2 = "Haircolor ";
                        disc = 10;
                        byrp += 40000;break;
                }
                System.out.print("Tambah order? ('y' untuk ya / 'n' untuk selesai & bayar)\nanswer : ");
                nambah = st.nextLine();
            }while(nambah.equalsIgnoreCase("y"));
            System.out.println("\nType membership anda?");
            System.out.println("1. Premium");
            System.out.println("2. Gold");
            System.out.println("3. Silver");
            System.out.print("answer : ");
            choosemem = in.nextInt();
            if(choosemem==1){
                MemberPremium p1 = new MemberPremium((js1+js2+js3),(pr1+pr2),byrjs, byrp, disc);
                System.out.println("==========  E-CONNOTE  ==========");
                System.out.println("Nama        : "+nama);
                System.out.println("Type member : Premium\n");
                System.out.println("Total belanja anda : ");
                p1.boom();
            }else if(choosemem==2){
                MemberGold g1 = new MemberGold((js1+js2+js3),(pr1+pr2),byrjs, byrp, disc);
                System.out.println("==========  E-CONNOTE  ==========");
                System.out.println("Nama        : "+nama);
                System.out.println("Type member : Gold\n");
                System.out.println("Total belanja anda : ");
                g1.boom();
            }else{
                MemberSilver s1 = new MemberSilver((js1+js2+js3),(pr1+pr2),byrjs, byrp, disc);
                System.out.println("==========  E-CONNOTE  ==========");
                System.out.println("Total belanja anda : ");
                System.out.println("Nama        : "+nama);
                System.out.println("Type member : Silver\n");
                s1.boom();
            }
        }else{
            do{
                System.out.println("\nSilakan pilih jasa/produk yang anda inginkan.");
                System.out.println("1. Creambath (jasa)");
                System.out.println("2. Haircut (jasa)");
                System.out.println("3. Facial (jasa)");
                System.out.println("4. Nailart (produk)");
                System.out.println("5. Haircolor (produk)");
                System.out.print("Pilihan anda : ");
                choose = in.nextInt();
                switch(choose){
                    case 1:
                        js1 = "Creambath ";
                        byrjs += 20000;break;
                    case 2:
                        js2 = "Haircut   ";
                        byrjs += 15000;break;
                    case 3:
                        js3 = "Facial    ";
                        byrjs += 35000;break;
                    case 4:
                        pr1 = "Nailart   ";
                        disc = 0;
                        byrp += 50000;break;
                    case 5:
                        pr2 = "Haircolor ";
                        disc = 0;
                        byrp += 40000;break;
                }
                System.out.print("Tambah order? ('y' untuk ya / 'n' untuk selesai & bayar)\nanswer : ");
                nambah = st.nextLine();
            }while(nambah.equalsIgnoreCase("y"));
            GaModal gm = new GaModal((js1+js2+js3),(pr1+pr2),byrjs, byrp, disc);
            System.out.println("==========  E-CONNOTE  ==========");
            System.out.println("Nama        : "+nama);
            System.out.println("Type member : Non-member/guest\n");
            System.out.println("Total belanja anda : ");
            gm.boom();
        }
    }
}
