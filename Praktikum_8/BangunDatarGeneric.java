/**
* File : BangunDatarGeneric.java 17/05/2023 
* Penulis : Zenit Laena Fathonah
* Deskripsi : Kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<G extends BangunDatar>{

	/** Jadi, dengan mengganti karakter 'G' menjadi karakter lain seperti 'G', kita hanya memberikan 
nama yang berbeda untuk parameter tipe generik. Ini memungkinkan kita untuk membuat variasi dari 
kelas generik yang sama dengan batasan tipe yang berbeda-beda.
Penggunaan 'G' sebagai pengganti karakter 'T' hanya mempengaruhi 
penamaan variabel dan tipe kelas, tetapi konsep dasar dan fungsionalitas dari kelas generik tetap sama.
*/
	private G bangunDatar;

	public void set(G tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public G get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}