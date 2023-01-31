package charakterGenerator;

public class BerufKaempfer implements IBerufsklasse {
	
	// Beschreibung der Methoden in Interface Berufsklasse

	@Override
	public String getKlassenfertigkeit() {
		return "o Einschüchtern\r\n"
				+ "o Reiten\r\n"
				+ "o Schwimmen\r\n"
				+ "o Überlebenskunst\r\n";
	}

	@Override
	public String getTalente() {
		return "o Umgang mit mittelschweren Rüstungen\r\n"
				+ "o Umgang mit schweren Rüstungen\r\n"
				+ "o Umgang mit Schilden\r\n";

	}

	@Override
	public String getBasisLebenspunkte() {
		return "W10";
	}

	@Override
	public String getFertigkeitspunkte() {
		return "2 + Intelligenz";
	}

}
