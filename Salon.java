/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7_1;

/**
 *
 * @author Deltaviyahya
 */
public abstract class Salon {
    private String nama;
    private String anggota;
    private double produk;
    private double produkdisc;
    private double total;
    protected double perawatan;
    public Salon(String nama, String anggota) {
        this.nama = nama;
        this.anggota = anggota;
    }
    public double getPerawatan() {
        return perawatan;
    }
    public void setPerawatan(double perawatan) {
        this.perawatan = perawatan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAnggota() {
        return anggota;
    }
    public void setAnggota(String anggota) {
        this.anggota = anggota;
    }
    public double getProduk() {
        return produk;
    }
    public void setProduk(double produk) {
        this.produk = produk;
        }
    public double getProdukdisc() {
        return produk - (produk * 0.1);
    }
    public void setProdukdisc(double produkdisc) {
        this.produkdisc = produkdisc;
    }
    public double getTotal() {
        return (produk - (produk * 0.1)) + disc_perawatan();
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public abstract double disc_perawatan();
    public abstract void info_pelanggan();
    public abstract void info_bayar();
}
