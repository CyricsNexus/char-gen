package charakterGenerator;

public class VolkElf implements IVolk {

	// Beschreibung der Methoden in Interface IVolk
	
	@Override
	public String getBoni() {
		return "+ 2 Geschick";
	}

	@Override
	public String getMali() {
		return "- 2 Konstitution";
	}

	@Override
	public String getGroesse() {
		return "Mittel";
	}

}
