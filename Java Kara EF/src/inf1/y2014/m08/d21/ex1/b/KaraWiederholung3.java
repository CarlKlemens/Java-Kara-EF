package inf1.y2014.m08.d21.ex1.b;

import roboapp.javakara.JavaKaraProgram;

/**
 * "Kara sieht auf der Wiese vor sich ein Kleeblatt. Dort will sie hinlaufen. Hat sie
 * es erreicht, hebt sie es auf und ist fertig."
 * 
 * @author Carl Klemens
 *
 */
public class KaraWiederholung3 extends JavaKaraProgram {

	/**
	 * - Solange vor Kara kein Baum ist
	 * 		1. Bewege ein Feld in Blickrichtung
	 * 
	 * - Entferne Blatt von aktuellem Feld
	 */
	protected void myProgram() {
		while (!this.kara.treeFront()) {
			this.kara.move();
		}
		
		this.kara.removeLeaf();
	}

}