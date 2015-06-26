package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class SCTLaegemiddelformer {

	private List<SCTLaegemiddelform> sctLaegemiddelformer;
	
	public SCTLaegemiddelformer(SCTLaegemiddelform... sctLaegemiddelformer) {
		this.sctLaegemiddelformer = Arrays.asList(sctLaegemiddelformer);
	}

	public List<SCTLaegemiddelform> getSctLaegemiddelformer() {
		return sctLaegemiddelformer;
	}
	
}
