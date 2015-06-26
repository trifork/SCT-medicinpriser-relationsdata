package dk.nsi.snomedctrelation.vo;

public class SCTLaegemiddelRelation {

	private String laegemiddelDefinitionId;
	private String sctLaegemiddelkode;
	
	public SCTLaegemiddelRelation(String laegemiddelDefinitionId, String sctLaegemiddelkode) {
		this.laegemiddelDefinitionId = laegemiddelDefinitionId;
		this.sctLaegemiddelkode = sctLaegemiddelkode;
	}

	public String getLaegemiddelDefinitionId() {
		return laegemiddelDefinitionId;
	}

	public String getSctLaegemiddelkode() {
		return sctLaegemiddelkode;
	}
	
}
