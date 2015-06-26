package dk.nsi.snomedctrelation.vo;

public class SCTAktivtStofRelation {

	private String laegemiddelDefinitionId;
	private String aktivtStofKode;
	
	public SCTAktivtStofRelation(String laegemiddelDefinitionId, String aktivtStofKode) {
		this.laegemiddelDefinitionId = laegemiddelDefinitionId;
		this.aktivtStofKode = aktivtStofKode;
	}

	public String getLaegemiddelDefinitionId() {
		return laegemiddelDefinitionId;
	}

	public String getAktivtStofKode() {
		return aktivtStofKode;
	}
	
}
