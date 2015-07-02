package dk.nsi.snomedctrelation.vo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FullTest {

	@Test
	public void test() throws IOException {
		
		// The test code uses Google's GSON to serialize to json.
		// But any java to json serialization tool will probably do. 
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		Version version = new Version("2016-06-22T12:00:00");
		Files.write(
				Paths.get("test/output/Version.json"), 
				gson.toJson(version).getBytes());
		
		LaegemiddelDefinitioner laegemiddelDefinitioner = new LaegemiddelDefinitioner(
			new LaegemiddelDefinition("DrugID-28101000115", 28101000115L), 
			new LaegemiddelDefinition("DrugID-28101000215", 28101000215L));
		Files.write(
				Paths.get("test/output/LaegemiddelDefinitioner.json"), 
				gson.toJson(laegemiddelDefinitioner).getBytes());
		
		SCTLaegemidler sctLaegemidler = new SCTLaegemidler(
			new SCTLaegemiddel("123456789012345675", "Lægemiddel 1"),  // Lægemiddel for drugId 28101000115
			new SCTLaegemiddel("123456789012345677", "Lægemiddel 2")); // Lægemiddel for drugId 28101000215
		Files.write(
				Paths.get("test/output/SCTLaegemidler.json"), 
				gson.toJson(sctLaegemidler).getBytes());
		
		SCTLaegemiddelRelationer sctLaegemiddelRelationer = new SCTLaegemiddelRelationer(
			new SCTLaegemiddelRelation("DrugID-28101000115", "123456789012345675"),
			new SCTLaegemiddelRelation("DrugID-28101000215", "123456789012345677"));
		Files.write(
				Paths.get("test/output/SCTLaegemiddelRelationer.json"), 
				gson.toJson(sctLaegemiddelRelationer).getBytes());		
		
		SCTAktiveStoffer sctAktiveStoffer = new SCTAktiveStoffer( 
				new SCTAktivtStof("223456789012345677", "Aktivt stof A"), 
				new SCTAktivtStof("223456789012345678", "Aktivt stof B"), 
				new SCTAktivtStof("223456789012345679", "Aktivt stof C"));
		Files.write(
				Paths.get("test/output/SCTAktiveStoffer.json"), 
				gson.toJson(sctAktiveStoffer).getBytes());
		
		SCTAktivtStofRelationer sctAktivtStofRelationer = new SCTAktivtStofRelationer(
				new SCTAktivtStofRelation("DrugID-28101000115", "223456789012345677"),  // Lægemiddel 1 indeholder både aktivt stof A 
				new SCTAktivtStofRelation("DrugID-28101000115", "223456789012345678"),  //                       ... og aktivt stof B  
				new SCTAktivtStofRelation("DrugID-28101000215", "223456789012345679")); // Lægemiddel 2 indeholder kun aktivt stof C  
		Files.write(
				Paths.get("test/output/SCTAktivtStofRelationer.json"), 
				gson.toJson(sctAktivtStofRelationer).getBytes());
		
		SCTLaegemiddelformer sctLaegemiddelformer = new SCTLaegemiddelformer(
				new SCTLaegemiddelform("423456789012345678", "Lægemiddelform A"),
				new SCTLaegemiddelform("423456789012345689", "Lægemiddelform B")); 
		Files.write(
				Paths.get("test/output/SCTLaegemiddelformer.json"), 
				gson.toJson(sctLaegemiddelformer).getBytes());
		
		
		SCTLaegemiddelformRelationer sctLaegemiddelformRelationer = new SCTLaegemiddelformRelationer(
				new SCTLaegemiddelformRelation("DrugID-28101000115", "423456789012345678"),  // Lægemiddel 1 har lægemiddelform A
				new SCTLaegemiddelformRelation("DrugID-28101000215", "423456789012345689")); // Lægemiddel 2 har lægemiddelform B
		Files.write(
				Paths.get("test/output/SCTLaegemiddelformRelationer.json"), 
				gson.toJson(sctLaegemiddelformRelationer).getBytes());
		
	}

}
