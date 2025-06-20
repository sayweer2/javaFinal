package javaFinal;

public class MainClassss {
	
	public static void main(String[]args)
	{
		Hayvan hayvan1 = new Hayvan(2 ,"kırmızı");
		Hayvan kedi1 = new Kedi(4 ,"beyaz");
		
		System.out.println(hayvan1.ayakSayisi);
		System.out.println(kedi1.ayakSayisi);
		
		System.out.println(hayvan1.boyut);
		System.out.println(kedi1.boyut);
		
		hayvan1.sesCikar();
		kedi1.sesCikar();
		
		String isim = "seyit";
		
		System.out.println(isim);//java da bu sekilde degiskeni oldugu gibi print fonksiyonu ile içeriğini yazdırabiliyoruz diğer dillerle karıştırılmaması lazım
	}

}
