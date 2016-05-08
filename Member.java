package Laporan7;

/**
 *
 * @author wahyuridiansyah
 */
public abstract class Member {

    abstract int layanan();

    abstract int product();

    public void tampilHarga(int diskon) {
        System.out.println("Yang harus dibayar: Rp. " + diskon);
        System.out.println("------------------------------------");
    }

    public void nonmember1() {
        System.out.println("------------------------------------");
        System.out.println("Hair Styling: Rp. 125.000");
        System.out.println("Non Member: Tidak Dapat Diskon");
        System.out.println("------------------------------------");
    }

    public void premium1() {
        System.out.println("------------------------------------");
        System.out.println("Hair Styling   : Rp. 125.000");
        System.out.println("Member Premium : Diskon 20%");
        System.out.println("------------------------------------");
    }

    public void gold1() {
        System.out.println("------------------------------------");
        System.out.println("Hair Styling : Rp. 125.000");
        System.out.println("Member Gold  : Diskon 15%");
        System.out.println("------------------------------------");
    }

    public void silver1() {
        System.out.println("------------------------------------");
        System.out.println("Hair Styling   : Rp. 125.000");
        System.out.println("Member Silver  : Diskon 10%");
        System.out.println("------------------------------------");
    }

    public void nonmember2() {
        System.out.println("------------------------------------");
        System.out.println("Facials    : Rp. 65.000");
        System.out.println("Non Member : Tidak Dapat Diskon");
        System.out.println("------------------------------------");
    }

    public void premium2() {
        System.out.println("------------------------------------");
        System.out.println("Facials        : Rp. 65.000");
        System.out.println("Member Premium : Diskon 20%");
        System.out.println("------------------------------------");
    }

    public void gold2() {
        System.out.println("------------------------------------");
        System.out.println("Facials     : Rp. 65.000");
        System.out.println("Member Gold : Diskon 15%");
        System.out.println("------------------------------------");
    }

    public void silver2() {
        System.out.println("------------------------------------");
        System.out.println("Facials       : Rp. 65.000");
        System.out.println("Member Silver : Diskon 10%");
        System.out.println("------------------------------------");
    }

}
