package dk.nsi.snomedctrelation.vo;

public class SCTLaegemiddelform {

	private String sctLaegemiddelformkode;
	private String navn;
	
	public SCTLaegemiddelform(String sctLaegemiddelformkode, String navn) {
		this.sctLaegemiddelformkode = sctLaegemiddelformkode;
		this.navn = navn;
	}

	public String getSctLaegemiddelformkode() {
		return sctLaegemiddelformkode;
	}

	public String getNavn() {
		return navn;
	}

}
