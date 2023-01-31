package charakterGenerator;

public class VolkMensch implements IVolk {
	
	// Beschreibung der Methoden in Interface IVolk

	@Override
	public String getBoni() {
		return "Keine";
	}

	@Override
	public String getMali() {
		return "Keine";
	}

	@Override
	public String getGroesse() {
		return "Mittel";
	}

}
