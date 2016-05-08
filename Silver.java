package salon;
public class Silver extends Salon{

    public Silver(String n, String id) {
        super(n, id);
    }

    @Override
    public void diskonmember() {
              diskonmember=hargadiskon/10;
    hargamember=hargadiskon-diskonmember;
    }

    @Override
    public void DisplayMessage() {
                System.out.println("Nama Pelanggan :"+nama);
        System.out.println("Id Pelanggan :"+idpelanggan);
         System.out.println("Harga Sebelum diskon :"+harga);
         System.out.println("Diskon Promo WeekDay :"+diskon);
         System.out.println("Diskon Promo Member :"+diskonmember);
         System.out.println("Total Harga yang harus dibayar :"+hargamember);
    }
    
}
