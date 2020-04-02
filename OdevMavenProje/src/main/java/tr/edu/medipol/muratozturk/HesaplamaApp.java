package tr.edu.medipol.muratozturk;

public class HesaplamaApp {

	public static void main(String[] args) {
		
		
		Hesap toplama = new Toplama();
		String sonuc = toplama.sonucubul("100", "250");
		System.out.println(sonuc);

	}

}
