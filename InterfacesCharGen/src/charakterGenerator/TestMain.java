package charakterGenerator;


public class TestMain {

	public static void main(String[] args) {
		
		// Erstellung des Charakters mittels Aufruf Konstruktor aus Klasse CharGen
		CharGen km = new CharGen("Horst",new VolkZwerg(), new BerufKaempfer());
		charAugeben(km);
		
		// Name und Klasse sowie Volk ändern mittels Schnittstellenzugriff
		km.setCharName("Whes");
		km.setKlasseAendern(new BerufZauberer());
		km.setVolkAendern(new VolkMensch());

		charAugeben(km);		
	}

//	Ausgabe der Charaktereigenschaften, indem Objekt Charakter übergeben wird	
	private static void charAugeben(CharGen charakter) {
		System.out.printf("Das hier ist der Charakter %s.%n"
				+ "Er ist %s-groß."
				+ "%n%n"
				+ "Er hat folgende Talente:%n%s%n"
				+ "Außerdem hat er die folgenden Fertigkeiten:%n%s%n",
				charakter.getCharName(),
				charakter.getGroesse(), 
				charakter.getTalente(),
				charakter.getKlassenfertigkeit());
	}
}
