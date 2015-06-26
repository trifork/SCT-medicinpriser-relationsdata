package dk.nsi.snomedctrelation.vo;

public class Version {

	private String releaseDateTime;
	
	public Version(String releaseDateTime) {
		this.releaseDateTime = releaseDateTime;
	}

	public String getReleaseDateTime() {
		return releaseDateTime;
	}
	
}
