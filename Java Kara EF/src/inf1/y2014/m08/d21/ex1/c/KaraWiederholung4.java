package inf1.y2014.m08.d21.ex1.c;

import roboapp.javakara.JavaKaraProgram;

/**
 * "Kara sieht einen Pilz vor sich. Sie läuft dorthin und schiebt ihn ein Feld
 * weiter, dreht sich glücklich um und ist dann fertig."
 * 
 * @author Carl Klemens
 *
 */
public class KaraWiederholung4 extends JavaKaraProgram {

	/**
	 * - Solange vor Kara kein Pilz ist
	 * 		1. Bewege ein Feld in Blickrichtung
	 * 
	 * - Bewege ein Feld in Blickrichtung
	 * - Drehe 90° nach Rechts
	 * - Drehe 90° nach Rechts
	 */
	protected void myProgram() {
		while (!this.kara.mushroomFront()) {
			this.kara.move();
		}
		
		this.kara.move();
		this.kara.turnRight();
		this.kara.turnRight();
	}

}