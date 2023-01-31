package charakterGenerator;

public class VolkZwerg implements IVolk {
	
	// Beschreibung der Methoden in Interface IVolk

	@Override
	public String getBoni() {
		return "o	+ 2 Konstitution\r\n"
				+ "o	+ 2 Stärke\r\n";
	}

	@Override
	public String getMali() {
		return "-2 Intelligenz";
	}

	@Override
	public String getGroesse() {
		return "Klein";
	}

}
