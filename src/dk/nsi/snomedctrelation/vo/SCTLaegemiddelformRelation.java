package dk.nsi.snomedctrelation.vo;

public class SCTLaegemiddelformRelation {

	private String laegemiddelDefinitionId;
	private String sctLaegemiddelformkode;
	
	public SCTLaegemiddelformRelation(String laegemiddelDefinitionId, String sctLaegemiddelformkode) {
		this.laegemiddelDefinitionId = laegemiddelDefinitionId;
		this.sctLaegemiddelformkode = sctLaegemiddelformkode;
	}

	public String getLaegemiddelDefinitionId() {
		return laegemiddelDefinitionId;
	}

	public String getSctLaegemiddelformkode() {
		return sctLaegemiddelformkode;
	}
	
}
