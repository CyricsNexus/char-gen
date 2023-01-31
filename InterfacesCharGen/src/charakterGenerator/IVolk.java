package charakterGenerator;

// Interface für Volkseigenschaften
// Wird in VolkElf, VolkMensch und VolkZwerg implementiert

public interface IVolk {
	public String getBoni();		// Attributsbonus bei Wahl des Volkes zu Beginn
	public String getMali();		// Attributsmalus bei Wahl des Volkes zu Beginn
	public String getGroesse();		// Größe des Volks (Relevant bei Ausweichbonus für Rüstungsklasse)
}
