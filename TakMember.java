package salon;
public class TakMember extends Salon {

    public TakMember(String n, String id) {
        super(n, id);
    }

    @Override
    public void diskonmember() {
        diskonmember=0;
        hargamember=hargadiskon;
    }

    @Override
    public void DisplayMessage() {
        System.out.println("Nama Pelanggan :"+nama);
        System.out.println("Id Pelanggan :"+idpelanggan);
         System.out.println("Harga Sebelum diskon :"+harga);
         System.out.println("Diskon Promo WeekDay :"+diskon);
         System.out.println("Diskon Promo Member  :"+diskonmember);
         System.out.println("Total Harga yang harus dibayar :"+hargamember);
    }
    
}
