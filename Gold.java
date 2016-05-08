package Tugas;
public class Gold extends ID{
    public Gold(){
        this.disc = 0.15;
    }
    public void countPayment(int a, int b) {
        double c = (double) a/100;
        total += b-((disc+c)*b);
    }
    public void displayInfo(int x){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Kartu Anggota Anda: Gold");
        System.out.println("Anda mendapat diskon keanggotaan sebesar 15%");
        System.out.println("Wow, diskon spesial hari ini sebesar "+x+"%");
        System.out.println("Total belanja anda adalah sebesar Rp "+total);
    }
}
