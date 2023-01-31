package charakterGenerator;

/**
 * @author C. Frantzen
 * @ Version 1.1
 * �nderungen: 31.01.2023
 * 		Hinzugef�gte Methoden - nicht im UML umgesetzt
 * 			- setKlasseAendern(IBerufsklasse iBeruf)	<- �ndert die Klasse des Charakters
 * 			- setVolkAendern(IVolk iVolk)				<- �ndert das Volk des Charakters
 * 			- setCharName(String charName)				<- �ndert den Namen des Charakters
 */
public class CharGen {
	
	

	// ########################################################
	// Initialisierung
	// ########################################################
	
	private String charName;				//Instanzvariable zur Benennung des Charakters
	private IVolk iVolk = null;				// Erhalt der Methoden f�r Boni, Mali und Groesse
	private IBerufsklasse iBeruf = null;	// Erhalt der Methoden f�r Klassenfertigkeit, 
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
	// Methoden f�r Werte-R�ckgaben
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
	
	// Volksgr��e
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
