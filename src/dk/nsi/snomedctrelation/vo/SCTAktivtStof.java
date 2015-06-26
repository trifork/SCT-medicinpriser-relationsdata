package dk.nsi.snomedctrelation.vo;

public class SCTAktivtStof {

	private String sctAktivtStofKode;
	private String navn;

	public SCTAktivtStof(String sctAktivtStofKode, String navn) {
		this.sctAktivtStofKode = sctAktivtStofKode;
		this.navn = navn;
	}

	public String getSctAktivtStofKode() {
		return sctAktivtStofKode;
	}
	
	public String getNavn() {
		return navn;
	}
	
}
