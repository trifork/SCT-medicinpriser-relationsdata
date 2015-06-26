package dk.nsi.snomedctrelation.vo;

public class SCTLaegemiddel {

	private String sctLaegemiddelkode;
	private String navn;

	public SCTLaegemiddel(String sctLaegemiddelkode, String navn) {
		this.sctLaegemiddelkode = sctLaegemiddelkode;
		this.navn = navn;
	}

	public String getSctLaegemiddelkode() {
		return sctLaegemiddelkode;
	}

	public String getNavn() {
		return navn;
	}
	
}
