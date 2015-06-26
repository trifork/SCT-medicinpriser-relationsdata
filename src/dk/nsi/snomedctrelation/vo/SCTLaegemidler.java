package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class SCTLaegemidler {

	private List<SCTLaegemiddel> sctLaegemidler;
	
	public SCTLaegemidler(SCTLaegemiddel... sctLaegemidler) {
		this.sctLaegemidler = Arrays.asList(sctLaegemidler);
	}

	public List<SCTLaegemiddel> getSctLaegemidler() {
		return sctLaegemidler;
	}
	
}
