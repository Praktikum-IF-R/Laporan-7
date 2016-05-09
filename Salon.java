package bab7;


public abstract class Salon {
	String namaJasa[] = {"Hair Cut", "Wash and Blow", "Body Massage"};
	int hargaJasa[] = {100000, 60000, 150000};
	String namaProduk[] = {"Masker Susu", "Lulur Coklat", "Milk Bath"};
	int hargaProduk[] = {70000, 155000 ,135000};
	String nama, pilihan, namaPilihan;
	double totalHarga;
	public Salon(){
      }
	public Salon(String pilihan, String nama, String namaPilihan){
		this.nama = nama;
		this.pilihan = pilihan;
		this.namaPilihan = namaPilihan;
	}

	public double cocokHarga(){
		if (pilihan.equals("Jasa")){
		for (int a=0; a<namaJasa.length; a++){
			if (namaPilihan.equals(namaJasa[a])){
				totalHarga = hargaJasa[a];
			}
		}
	}
		else if (pilihan.equals("Produk")){
		for (int a=0; a<namaProduk.length; a++){
			if (namaPilihan.equals(namaProduk[a])){
				totalHarga = hargaProduk[a];
			}
		}
	}
	return totalHarga;
}
		
	public void outJasa(){
		System.out.println("============================");
		System.out.println("Daftar Jasa");
		for (int a = 0; a<namaJasa.length; a++){
			System.out.println(namaJasa[a]+"\t"+hargaJasa[a]);
		}
		System.out.println("============================");
		System.out.println("Daftar Produk");
		for (int a = 0; a<namaProduk.length; a++){
			System.out.println(namaProduk[a]+"\t"+hargaProduk[a]);
		}
		System.out.println("============================");
	}

	public abstract void hitungTotal();
}
    
