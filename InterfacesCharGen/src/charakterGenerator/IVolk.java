package charakterGenerator;

// Interface f�r Volkseigenschaften
// Wird in VolkElf, VolkMensch und VolkZwerg implementiert

public interface IVolk {
	public String getBoni();		// Attributsbonus bei Wahl des Volkes zu Beginn
	public String getMali();		// Attributsmalus bei Wahl des Volkes zu Beginn
	public String getGroesse();		// Gr��e des Volks (Relevant bei Ausweichbonus f�r R�stungsklasse)
}
