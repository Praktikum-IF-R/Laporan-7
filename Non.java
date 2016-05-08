package Tugas;
public class Non{
    private double disc ;
    private long total;
    public Non(){
        this.disc = 0;
    }
    public void countPayment(int a) {
        total += a;
    }
    public void countTotal(int x){
        total = (long) (total - (total*x));
    }
    public void displayInfo(int x){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Kartu Anggota Anda: Non Anggota");
        System.out.println("Anda tidak mendapat diskon keanggotaan");
        System.out.println("Wow, diskon spesial produk hari ini sebesar "+x+"%");
        System.out.println("Total belanja anda adalah sebesar Rp "+total);
    }
}
