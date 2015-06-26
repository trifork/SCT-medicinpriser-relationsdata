package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class LaegemiddelDefinitioner {

	private List<LaegemiddelDefinition> laegemiddelDefinitioner;

	public LaegemiddelDefinitioner(LaegemiddelDefinition... laegemiddelDefinitioner) {
		this.laegemiddelDefinitioner = Arrays.asList(laegemiddelDefinitioner);
	}

	public List<LaegemiddelDefinition> getLaegemiddelDefinitioner() {
		return laegemiddelDefinitioner;
	}
	
}
