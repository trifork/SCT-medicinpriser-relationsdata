package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class SCTAktiveStoffer {

	private List<SCTAktivtStof> sctAktiveStoffer;

	public SCTAktiveStoffer(SCTAktivtStof... sctAktiveStoffer) {
		this.sctAktiveStoffer = Arrays.asList(sctAktiveStoffer);
	}

	public List<SCTAktivtStof> getSCTAktiveStoffer() {
		return sctAktiveStoffer;
	}
	
}
