package dk.nsi.snomedctrelation.vo;

public class LaegemiddelDefinition {

	private String laegemiddelDefinitionId;
	private Long drugId;
	
	public LaegemiddelDefinition(String laegemiddelDefinitionId, Long drugId) {
		this.drugId = drugId;
		this.laegemiddelDefinitionId = laegemiddelDefinitionId;
	}

	public String getLaegemiddelDefinitionId() {
		return laegemiddelDefinitionId;
	}
	
	public Long getDrugId() {
		return drugId;
	}
	
}
