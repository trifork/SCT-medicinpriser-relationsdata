package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class SCTLaegemiddelRelationer {
	
	private List<SCTLaegemiddelRelation> sctLaegemiddelRelationer;

	public SCTLaegemiddelRelationer(SCTLaegemiddelRelation... sctLaegemiddelRelationer) {
		this.sctLaegemiddelRelationer = Arrays.asList(sctLaegemiddelRelationer);
	}

	public List<SCTLaegemiddelRelation> getSctLaegemiddelRelationer() {
		return sctLaegemiddelRelationer;
	}
	
}
