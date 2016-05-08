package Tugas;
public class Silver extends ID{
    public Silver(){
        this.disc = 0.1;
    }
    public void countPayment(int a, int b) {
        double c = (double) a/100;
        total += b-((disc+c)*b);
    }
    public void countPayment(int a){
        total += a;
    }
    public void countTotal(){
        total = (long) (total - (total*disc));
    }
    public void displayInfo(int x){
        countTotal();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Kartu Anggota Anda: Silver");
        System.out.println("Anda mendapat diskon keanggotaan sebesar 10%");
        System.out.println("Wow, diskon spesial produk hari ini sebesar "+x+"%");
        System.out.println("Total belanja anda adalah sebesar Rp "+total);
    }
}
