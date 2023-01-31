package charakterGenerator;

//Interface f�r Klasseneigenschaften
//Wird in BerufKaempfer, BerufSchurke, BerufZauberer implementiert

public interface IBerufsklasse {
	public String getKlassenfertigkeit();	// Klassenfertigkeiten bei Erstellung
	public String getTalente();				// Direkt erhaltene Talente bei Erstellung
	public String getBasisLebenspunkte();	// Lebenspunkte, die zu Beginn erhalten werden und beim Stufenaufstieg gew�rfelt werden k�nnen
	public String getFertigkeitspunkte();	// Erhaltene Fertigkeitspunkte je Level

}
