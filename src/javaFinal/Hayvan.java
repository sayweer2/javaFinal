package javaFinal;

public class Hayvan{

	/*public Hayvan() {
	}*/
	
	public Hayvan(int ayakSayisi ,String renk)
	{
		this.ayakSayisi = ayakSayisi;
		this.renk = renk;
	}
	
	int ayakSayisi;
	String renk;
	int boyut = 150;
	
	
	public void sesCikar()
	{
		System.out.println("bu method override edilerek hayvana özgü sesler çıkarılack");
	}
	
}
