package charakterGenerator;

public class BerufZauberer implements IBerufsklasse {

	// Beschreibung der Methoden in Interface Berufsklasse
	
	@Override
	public String getKlassenfertigkeit() {
		return "o Schätzen\r\n"
				+ "o Sprachen\r\n"
				+ "o Wissen\r\n"
				+ "o Zauberkunde\r\n";
	}

	@Override
	public String getTalente() {
		return "o Arkane Schule\r\n"
				+ "o Schriftrollen lesen\r\n";
	}

	@Override
	public String getBasisLebenspunkte() {
		return "W6";
	}

	@Override
	public String getFertigkeitspunkte() {
		return "o 2 + Intelligenz";
	}

}
