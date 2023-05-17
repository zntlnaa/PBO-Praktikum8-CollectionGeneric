/**
* File : BangunDatarGenericTest.java 17/05/2023 
* Penulis : Zenit Laena Fathonah
* Deskripsi : main class unutuk generic bangun datar
*/

public class BangunDatarGenericTest{
	public static void main(String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("Keliling lingkaran : " +bdg.hitungKeliling());
		System.out.println("tipe generic : " +bdg.get().getClass().getName());
	
	}
}