/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;

public abstract class Salon {
    protected String nama;
    protected String idpelanggan;
    protected int harga;
    protected int hargadiskon;
    protected int hargamember;
    protected int diskon;
    protected int diskonmember;
    protected String hari;
    public Salon(String n, String id){
        nama=n;
        idpelanggan=id;        
    }
public void setNama(String n){
    nama=n;
}
public String getNama(){
    return nama;
}
public void setId(String id){
idpelanggan=id;
}
public String getId(){
    return idpelanggan;
}
public void pesanProduk(String perawatan) {
        if (perawatan.equalsIgnoreCase("Creambath")) {
            harga += 200000;
        }
        else if (perawatan.equalsIgnoreCase("Rebonding")) {
            harga += 300000;
        }
        else if (perawatan.equalsIgnoreCase("Massage")) {
            harga += 150000;
        }
        else if (perawatan.equalsIgnoreCase("Pedicure")) {
            harga += 50000;
        }
        else if (perawatan.equalsIgnoreCase("Manicure")) {
            harga += 50000;
        }
        else if (perawatan.equalsIgnoreCase("Sulam Alis")) {
            harga += 500000;
        }
        else if (perawatan.equalsIgnoreCase("Ponds Age Miracle")) {
            harga += 150000;
        }
        else if (perawatan.equalsIgnoreCase("Loreal")) {
            harga += 100000;
        }
        else if (perawatan.equalsIgnoreCase("Nurish Skin")) {
            harga += 100000;
        }
        else if (perawatan.equalsIgnoreCase("Tresseme")) {
            harga += 150000;
        }
}
        public void diskonhari(String h) {
            hari=h;
    if(hari.equalsIgnoreCase("Sabtu")){
        diskon=0;
        hargadiskon=harga;
    }
    else if(hari.equalsIgnoreCase("Minggu")){
        diskon=0;
        hargadiskon=harga;
    }
    else{
        diskon=harga/10;
        hargadiskon=harga-diskon;
    }
}
public abstract void diskonmember();
public abstract void DisplayMessage();
}

