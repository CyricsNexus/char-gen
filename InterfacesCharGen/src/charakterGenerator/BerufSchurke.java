package charakterGenerator;

public class BerufSchurke implements IBerufsklasse {

	// Beschreibung der Methoden in Interface Berufsklasse
	
	@Override
	public String getKlassenfertigkeit() {
		return "o Stehlen\r\n"
				+ "o Fallen entschärfen\r\n";
	}

	@Override
	public String getTalente() {
		return "o Fallen finden\r\n"
				+ "o Trick\r\n";
	}

	@Override
	public String getBasisLebenspunkte() {
		return "W8";
	}

	@Override
	public String getFertigkeitspunkte() {
		return "o 8 + Intelligenz";
	}

}
