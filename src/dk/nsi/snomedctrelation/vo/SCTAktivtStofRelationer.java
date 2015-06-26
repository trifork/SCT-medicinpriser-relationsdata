package dk.nsi.snomedctrelation.vo;

import java.util.Arrays;
import java.util.List;

public class SCTAktivtStofRelationer {

	private List<SCTAktivtStofRelation> sctAktivtStofRelationer;

	public SCTAktivtStofRelationer(SCTAktivtStofRelation... sctAktivtStofRelationer) {
		this.sctAktivtStofRelationer = Arrays.asList(sctAktivtStofRelationer);
	}

	public List<SCTAktivtStofRelation> getSctAktivtStofRelationer() {
		return sctAktivtStofRelationer;
	}
	
}
