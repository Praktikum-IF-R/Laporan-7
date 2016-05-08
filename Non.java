package Tugas;
public class Non extends ID{
    public Non(){
        this.disc = 0;
    }
    public void countPayment(int a, int b) {
        double c = (double) a/100;
        total += b-((disc+c)*b);
    }
    public void displayInfo(int x){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Kartu Anggota Anda: Non Anggota");
        System.out.println("Anda tidak mendapat diskon keanggotaan");
        System.out.println("Wow, diskon spesial hari ini sebesar "+x+"%");
        System.out.println("Total belanja anda adalah sebesar Rp "+total);
    }
}
