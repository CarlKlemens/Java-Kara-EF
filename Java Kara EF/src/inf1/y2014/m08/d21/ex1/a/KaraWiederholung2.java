package inf1.y2014.m08.d21.ex1.a;

import roboapp.javakara.JavaKaraProgram;

/**
 * "Verändere die Lösung oben so, dass Kara beim Laufen zum Baum jeweils ein Kleeblatt
 * auf jedes Feld des Weges legt."
 * 
 * @author Carl Klemens
 *
 */
public class KaraWiederholung2 extends JavaKaraProgram {

	/**
	 * - Solange vor Kara kein Baum ist
	 * 		1. Lege Blatt auf aktuelles Feld
	 * 		2. Bewege ein Feld in Blickrichtung
	 */
	protected void myProgram() {
		while (!this.kara.treeFront()) {
			this.kara.putLeaf();
			this.kara.move();
		}
	}

}