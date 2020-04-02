package tr.edu.medipol.muratozturk;
import java.math.BigDecimal;

public class Toplama implements Hesap {

	public String sonucubul(String sayi1, String sayi2) {		
		return new BigDecimal(sayi1)
				.add(new BigDecimal(sayi2))
				.toString();
	}

}
