package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class SCTLaegemiddelformRelationer {

	private List<SCTLaegemiddelformRelation> sctLaegemiddelformRelationer;
	
	public SCTLaegemiddelformRelationer(SCTLaegemiddelformRelation...sctLaegemiddelformRelationer) {
		this.sctLaegemiddelformRelationer = Arrays.asList(sctLaegemiddelformRelationer);
	}

	public List<SCTLaegemiddelformRelation> getSctLaegemiddelformRelationer() {
		return sctLaegemiddelformRelationer;
	}
	
}
