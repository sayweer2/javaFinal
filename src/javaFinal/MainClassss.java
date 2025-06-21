package javaFinal;
import java.util.*;

public class MainClassss {
	
	public static void main(String[]args)
	{
		Scanner girdi = new Scanner(System.in);
		Hayvan hayvan1 = new Hayvan(2 ,"kırmızı");
		Hayvan kedi1 = new Kedi(4 ,"beyaz");
		
		System.out.println(hayvan1.ayakSayisi);
		System.out.println(kedi1.ayakSayisi);
		
		System.out.println(hayvan1.boyut);
		System.out.println(kedi1.boyut);
		
		hayvan1.sesCikar();
		kedi1.sesCikar();
		
		String isim = "Seyit";
		
		System.out.println(isim);//java da bu sekilde degiskeni oldugu gibi print fonksiyonu ile içeriğini yazdırabiliyoruz diğer dillerle karıştırılmaması lazım
		
		System.out.println("lutfen soyadinizi tuslayiniz = ");
		String soyad = girdi.nextLine();
		System.out.println(soyad);
		
		int maas;
		try {
			System.out.println("lutfen maas bilgilerinizi giriniz = ");
			maas = Integer.parseInt(girdi.nextLine());
		}catch(NumberFormatException e)
		{
			System.out.println("gecerli olmayan turde bir tuslama yaptiniz maas bilginiz default olarak 0tl atanacaktır. Daha sonra bu bilgiyi guncelleyebilirsiniz.");
			maas = 0;
		}
		int arabaSayisi;
		while(true) {
			try {
			System.out.println("lutfen f1 araba sayinizi giriniz(maket) = ");
			arabaSayisi = girdi.nextInt();
			break;
			}catch(InputMismatchException e) {
				System.out.println("gecerli olmayan turde tuslama yaptiniz giris ekranina tekrar yonlendiriliyorsunuz.");
				girdi.nextLine(); // eger hatali bir giris yapilirsa yapilan giris bufferde kalacagi icin islem oncesi buffer temizliği yapiyoruz.
			}
		}
		
		Hayvan[] hayvanlar = new Hayvan[3];
		hayvanlar[0] = hayvan1;
		hayvanlar[1] = kedi1;
		System.out.println(hayvanlar[2]); //burada null doner cunku hernuz hicbirsey atanmadi bu indexe
		hayvanlar[2] = hayvan1; // bir diziye ayni nesne veya deger birden fazla kere atanabilir.
		for(Hayvan hayvan:hayvanlar)
		{
			System.out.println(hayvan.ayakSayisi);
		}
	}

}
