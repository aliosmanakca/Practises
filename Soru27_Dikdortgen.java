package Practices;

public class Soru27_Dikdortgen extends Soru27_Sekil {

	public int kk, uk;

	public Soru27_Dikdortgen(int kk, int uk) {
		super();
		this.kk = kk;
		this.uk = uk;
	}

	@Override
	public int cevre() {
		
		return 2*(kk+uk); 
	}

	@Override
	public int alan() {
		
		return uk*kk;
	}

}
