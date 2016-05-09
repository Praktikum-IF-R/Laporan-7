package pelanggan;
public class Produk {

private int[] harga;
    private String[] nama;

    public Produk() {
        harga = new int[8];
        nama = new String[8];
    }
    public void setHargaLabel(int i) {
        if (i == 0) {
            harga[0] = 50000;
            nama[0] = "Smoothing";
        } else if (i == 1) {
            harga[1] = 32000;
            nama[1] = "Rebonding";
        } else if (i == 2) {
            harga[2] = 30000;
            nama[2] = "Bleaching";
        } else if (i == 3) {
            harga[3] = 45500;
            nama[3] = "Coloring";
        }else if (i == 4) {
            harga[4] = 25000;
            nama[4] = "Lotion";
        }
        else if (i == 5) {
            harga[5] = 35000;
            nama[5] = "Cream";
        }
        
        else if (i == 6) {
            harga[6] = 15000;
            nama[6] = "Lipstick";
        }
        else if (i == 7) {
            harga[7] = 50000;
            nama[7] = "Make-Up";
        }
        
    }

    public int[] getHarga() {
        return harga;
    }

    public String[] getNama() {
        return nama;
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            if (harga[i] != 0) {
                total += harga[i];
            }
        }
        return total;
    }
}
