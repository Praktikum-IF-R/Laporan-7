package laporan7;

public abstract class Salon {

    private String nama;
    protected double harga;
    protected String [] barang = new String [5];
    protected double diskonMember = 0.1;
    protected final double PR = 15000;
    protected final double CBD = 35000;
    protected final double Cb = 30000;
    protected final double S = 40000;
    protected final double Cl = 150000;
    protected final double Sh = 20000;
    protected final double Cd = 30000;
    protected final double VR = 10000;
    protected final double Pw = 60000;
    
    public Salon(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public double setHarga(int [] a){
        for(int i = 0; i<a.length; i++){
            if(a[i]==1){
                harga+=PR;
            }
            else if(a[i]== 2){
                harga+=CBD;
            }
            else if(a[i]==3){
                harga+=Cb;
            }
            else if(a[i]==4){
                harga+=S;
            }
            else if(a[i]==5){
                harga+=Cl;
            }
            else if(a[i]==6){
                harga+=Sh;
            }
            else if(a[i]==7){
                harga+=Cd;
            }
            else if(a[i]==8){
                harga+=VR;
            }
            else if(a[i]==9){
                harga+=Pw;
            }
        }
        return harga;
    }
    public void TampilBarang(int a[]){
        for(int i = 0; i<a.length; i++){
            if(a[i]==1){
                barang[i]="Potong Rambut          Rp 15000";
            }
            else if(a[i]==2){
                barang[i]="Potong + Cuci Blow     Rp 35000";
            }
            else if(a[i]==3){
                barang[i]="Creambath              Rp 30000";
            }
            else if(a[i]==4){
                barang[i]="Smoothing              Rp 40000";
            }
            else if(a[i]==5){
                barang[i]="Coloring               Rp 150000";
            }
            else if(a[i]==6){
                barang[i]="Shampoo                Rp 20000";
            }
            else if(a[i]==7){
                barang[i]="Conditioner            Rp 30000";
            }
            else if(a[i]==8){
                barang[i]="Vitamin Rambut         Rp 10000";
            }
            else if(a[i]==9){
                barang[i]="Pewarna Rambut         Rp 60000";
            }
        }
        for(int i=0; i<a.length;i++){
            System.out.println(barang[i]);
        }
    }
    public abstract double Biaya();
}
