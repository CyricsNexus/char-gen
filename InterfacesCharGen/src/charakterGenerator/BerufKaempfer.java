package charakterGenerator;

public class BerufKaempfer implements IBerufsklasse {
	
	// Beschreibung der Methoden in Interface Berufsklasse

	@Override
	public String getKlassenfertigkeit() {
		return "o Einsch�chtern\r\n"
				+ "o Reiten\r\n"
				+ "o Schwimmen\r\n"
				+ "o �berlebenskunst\r\n";
	}

	@Override
	public String getTalente() {
		return "o Umgang mit mittelschweren R�stungen\r\n"
				+ "o Umgang mit schweren R�stungen\r\n"
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
