package tr.edu.medipol.muratozturk;
import static org.junit.Assert.assertEquals;

import org.junit.*;
public class ToplamaTest {

	@Test
	public void testPozitifSayiToplama() {
		
		//Given(Koþullar/On þartlar)
		Hesap toplama  = new Toplama();
		String sayi1="100";
		String sayi2="250";
		//When - Yapilan Ýslem 
		String sonuc = toplama.sonucubul(sayi1, sayi2);
		
		//Then - Kontrol
		assertEquals("350",sonuc);
		
	}
	
	@Test
	public void testNegatifSayiToplama() {
		Hesap toplama = new Toplama();
				String Sayi1="-100";
				String Sayi2="-250";
				
				String sonuc = toplama.sonucubul(Sayi1, Sayi2);
				
				assertEquals("-350",sonuc);
				
	}
	
}
