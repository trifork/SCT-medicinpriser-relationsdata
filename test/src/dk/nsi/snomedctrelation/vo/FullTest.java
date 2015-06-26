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
			new LaegemiddelDefinition("83abeec3-b2c0-4911-bd35-76afeaf8b50a", 28101000115L), 
			new LaegemiddelDefinition("3ced613e-a0c9-49c7-9153-29c425bd8fa3", null), // Lægemiddeldefinition uden tilsvarende drugId i taksten 
			new LaegemiddelDefinition("0b1d9190-8834-4b83-a3e4-e0504eac31da", 28101000215L));
		Files.write(
				Paths.get("test/output/LaegemiddelDefinitioner.json"), 
				gson.toJson(laegemiddelDefinitioner).getBytes());
		
		SCTLaegemidler sctLaegemidler = new SCTLaegemidler(
			new SCTLaegemiddel("123456789012345675", "Lægemiddel 1"),  // Lægemiddel for drugId 28101000115
			new SCTLaegemiddel("123456789012345676", "Lægemiddel 2"),  // Lægemiddel for lægemiddeldefinition uden tilsvarende drugId i taksten
			new SCTLaegemiddel("123456789012345677", "Lægemiddel 3"),  // Lægemiddel for drugId 28101000215
			new SCTLaegemiddel("123456789012345678", "Lægemiddel 4")); // Lægemiddel der ikke er anvendt i lægemiddeldefinition (optræder ikke via relationstabellen)
		Files.write(
				Paths.get("test/output/SCTLaegemidler.json"), 
				gson.toJson(sctLaegemidler).getBytes());
		
		SCTLaegemiddelRelationer sctLaegemiddelRelationer = new SCTLaegemiddelRelationer(
			new SCTLaegemiddelRelation("83abeec3-b2c0-4911-bd35-76afeaf8b50a", "123456789012345675"),
			new SCTLaegemiddelRelation("3ced613e-a0c9-49c7-9153-29c425bd8fa3", "123456789012345676"),
			new SCTLaegemiddelRelation("0b1d9190-8834-4b83-a3e4-e0504eac31da", "123456789012345677"));
		Files.write(
				Paths.get("test/output/SCTLaegemiddelRelationer.json"), 
				gson.toJson(sctLaegemiddelRelationer).getBytes());		
		
		SCTAktiveStoffer sctAktiveStoffer = new SCTAktiveStoffer( 
				new SCTAktivtStof("223456789012345677", "Aktivt stof A"), 
				new SCTAktivtStof("223456789012345678", "Aktivt stof B"), 
				new SCTAktivtStof("223456789012345679", "Aktivt stof C"),
				new SCTAktivtStof("223456789012345680", "Aktivt stof X"));
		Files.write(
				Paths.get("test/output/SCTAktiveStoffer.json"), 
				gson.toJson(sctAktiveStoffer).getBytes());
		
		SCTAktivtStofRelationer sctAktivtStofRelationer = new SCTAktivtStofRelationer(
				new SCTAktivtStofRelation("83abeec3-b2c0-4911-bd35-76afeaf8b50a", "223456789012345677"),  // Lægemiddel 1 indeholder både aktivt stof A 
				new SCTAktivtStofRelation("83abeec3-b2c0-4911-bd35-76afeaf8b50a", "223456789012345678"),  //                       ... og aktivt stof B  
				new SCTAktivtStofRelation("3ced613e-a0c9-49c7-9153-29c425bd8fa3", "223456789012345677"),  // Lægemiddel 2 indeholder kun aktivt stof A  
				new SCTAktivtStofRelation("0b1d9190-8834-4b83-a3e4-e0504eac31da", "223456789012345679")); // Lægemiddel 3 indeholder kun aktivt stof C  
		Files.write(
				Paths.get("test/output/SCTAktivtStofRelationer.json"), 
				gson.toJson(sctAktivtStofRelationer).getBytes());
		
		SCTLaegemiddelformer sctLaegemiddelformer = new SCTLaegemiddelformer(
				new SCTLaegemiddelform("423456789012345678", "Lægemiddelform A"),
				new SCTLaegemiddelform("423456789012345689", "Lægemiddelform B"), 
				new SCTLaegemiddelform("423456789012345680", "Lægemiddelform X"));
		Files.write(
				Paths.get("test/output/SCTLaegemiddelformer.json"), 
				gson.toJson(sctLaegemiddelformer).getBytes());
		
		
		SCTLaegemiddelformRelationer sctLaegemiddelformRelationer = new SCTLaegemiddelformRelationer(
				new SCTLaegemiddelformRelation("83abeec3-b2c0-4911-bd35-76afeaf8b50a", "423456789012345678"),  // Lægemiddel 1 har lægemiddelform A
				new SCTLaegemiddelformRelation("3ced613e-a0c9-49c7-9153-29c425bd8fa3", "423456789012345689")); // Lægemiddel 2 har lægemiddelform B
		Files.write(
				Paths.get("test/output/SCTLaegemiddelformRelationer.json"), 
				gson.toJson(sctLaegemiddelformRelationer).getBytes());
		

//		
//		FormRelationer formRelationer = new FormRelationer(
//				new FormRelation(423456789012345678L, 423456789012345688L));
//		Files.write(
//				Paths.get("test/output/FormRelationer.json"), 
//				gson.toJson(formRelationer).getBytes());
//		
//		Enheder enheder = new Enheder( 
//				new Enhed(923456789012345678L, "mg", "mg"), 
//				new Enhed(923456789012345679L, "ml", "ml"));
//		Files.write(
//				Paths.get("test/output/Enheder.json"), 
//				gson.toJson(enheder).getBytes());
//		
//		Allergier allergier = new Allergier(
//				new Allergi(91936005L, "Allergy to penicillin", "Allergi over for penicillin"), 
//				new Allergi(294500003L, "Allergi over for penicillinase-resistente penicilliner", "Penicillinase-resistant penicillins allergy"),
//				new Allergi(418344001L, "Allergy to caffeine", "Allergi over for koffein"));
//		Files.write(
//				Paths.get("test/output/Allergier.json"), 
//				gson.toJson(allergier).getBytes());
//		
//		AllergiRelationer allergiRelationer = new AllergiRelationer(
//				new AllergiRelation(91936005L, 294500003L));
//		Files.write(
//				Paths.get("test/output/AllergiRelationer.json"), 
//				gson.toJson(allergiRelationer).getBytes());
//		
	}

}
