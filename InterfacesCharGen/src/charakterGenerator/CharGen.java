package charakterGenerator;

/**
 * @author C. Frantzen
 * @ Version 1.1
 * Änderungen: 31.01.2023
 * 		Hinzugefügte Methoden - nicht im UML umgesetzt
 * 			- setKlasseAendern(IBerufsklasse iBeruf)	<- Ändert die Klasse des Charakters
 * 			- setVolkAendern(IVolk iVolk)				<- Ändert das Volk des Charakters
 * 			- setCharName(String charName)				<- Ändert den Namen des Charakters
 */
public class CharGen {
	
	

	// ########################################################
	// Initialisierung
	// ########################################################
	
	private String charName;				//Instanzvariable zur Benennung des Charakters
	private IVolk iVolk = null;				// Erhalt der Methoden für Boni, Mali und Groesse
	private IBerufsklasse iBeruf = null;	// Erhalt der Methoden für Klassenfertigkeit, 
											// 	 Talente, Fertigkeitspunkte und Lebenspunkte

	
	// ########################################################
	// Konstruktor bestehend aus Charnamen, Volksattributen und Klassenattributen
	// ########################################################
	
	public CharGen(String charname, IVolk iVolk, IBerufsklasse iBeruf) {
		this.charName = charname;
		this.iVolk = iVolk;
		this.iBeruf = iBeruf;
	}
	
	// ########################################################
	// Methoden für Werte-Rückgaben
	// ########################################################
	
	// CharName ausgeben
	public String getCharName(){
		return charName;
	}
	
	// ########################################################
	// Methoden aus Interface IBeruf
	// ########################################################
	
	// Klassenfertigkeiten
	public String getBerufKlassenfertigkeit(){
		return iBeruf.getKlassenfertigkeit();
	}
	
	// Talente
	public String getBerufTalente(){
		return iBeruf.getTalente();
	}
	
	// Lebenspunkte
	public String getBerufBasisLP(){
		return iBeruf.getBasisLebenspunkte();
	}
	
	// Fertigkeitspunkte
	public String getBerufFP(){
		return iBeruf.getFertigkeitspunkte();
	}
	
	// ########################################################
	// Methoden aus Interface IVolk
	// ########################################################
	
	// Volksboni
	public String getVolkBoni(){
		return iVolk.getBoni();
	}
	
	// Volksmali
	public String getVolkMali(){
		return iVolk.getMali();
	}
	
	// Volksgröße
	public String getVolkGroesse(){
		return iVolk.getGroesse();
	}

	// ########################################################
	// Methoden seit Version 1.1
	// ########################################################
	
	public void setKlasseAendern(IBerufsklasse iBeruf) {
		this.iBeruf = iBeruf;
	}

	public void setVolkAendern(IVolk iVolk) {
		this.iVolk = iVolk;
	}
	
	public void setCharName(String charName) {
		this.charName = charName;
	}
}
