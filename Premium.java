package Tugas;
public class Premium extends ID{
    public Premium(){
        this.disc = 0.2;
    }
    public void countPayment(int a, int b) {
        double c = (double) a/100;
        total += b-((disc+c)*b);
    }
    public void displayInfo(int x){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Kartu Anggota Anda: Premium");
        System.out.println("Anda mendapat diskon keanggotaan sebesar 20%");
        System.out.println("Wow, diskon spesial hari ini sebesar "+x+"%");
        System.out.println("Total belanja anda adalah sebesar Rp "+total);
    }
}
