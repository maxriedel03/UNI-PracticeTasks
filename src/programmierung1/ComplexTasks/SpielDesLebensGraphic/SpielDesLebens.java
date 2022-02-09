package programmierung1.ComplexTasks.SpielDesLebensGraphic;

import java.awt.*;

public class SpielDesLebens {
	
	//Instanzvariablen

	private Zelle[][] ersteGen;
	private Zelle[][] naechsteGen;

	private int anzZeilenUndSpalten;

	private int posX;
	private int posY;

	private int zellengroesse;

	// Konstruktoren
	public SpielDesLebens() {
		this(3);
	}

	public SpielDesLebens(int n) {
		this(n, 0, 0, 10);
	}

	public SpielDesLebens(int n, int _posX, int _posY, int _zellengroesse) {
		this.anzZeilenUndSpalten = n;
		this.posX = _posX;
		this.posY = _posY;
		this.zellengroesse = _zellengroesse;
		ersteGen = new Zelle[anzZeilenUndSpalten][anzZeilenUndSpalten];
		boolean tempAlive;
		for(int i = 0; i < anzZeilenUndSpalten; i++){
			for (int j = 0; j < anzZeilenUndSpalten; j++) {
				tempAlive = Math.random() * 100  < 50;
				ersteGen[i][j] = new Zelle(posX + j * zellengroesse,posY + i * zellengroesse,
						zellengroesse, zellengroesse, tempAlive);
			}
		}
		naechsteGen = ersteGen.clone();
	}

	/**
	 * Berechnet die naechste Generation
	 */
	public void berechneNaechsteGen() {
		int livingCells;
		for(int i = 0; i < anzZeilenUndSpalten; i++){
			for(int j = 0; j < anzZeilenUndSpalten; j++){
				livingCells = 0;
				for (int k = i - 1; k <= i +1; k++){
					for(int l = j - 1; l <= j +1; l++){
						if(l != j || k!= i){
							if(ersteGen[(k + anzZeilenUndSpalten) % anzZeilenUndSpalten]
									[(l + anzZeilenUndSpalten) % anzZeilenUndSpalten].istLebendig())
								livingCells++;
						}
					}
				}
				naechsteGen[i][j].setLebendig(livingCells == 3 || (livingCells == 2 && ersteGen[i][j].istLebendig()));
			}
		}
		ersteGen = naechsteGen.clone();
	}

	/**
	 * zeichnet die neue Generation
	 * @param g - Graphics-Objekt kommt von aufruf in StartAnimiert
	 */
	public void paintGen(Graphics g) {
		for (int i = 0; i < anzZeilenUndSpalten; i++){
			for (int j = 0; j < anzZeilenUndSpalten; j++){
				ersteGen[i][j].paint(g);
			}
		}
	}

	public Zelle[][] getErsteGen() {
		return ersteGen;
	}

	public void setErsteGen(Zelle[][] ersteGen) {
		this.ersteGen = ersteGen;
	}

	public Zelle[][] getNaechsteGen() {
		return naechsteGen;
	}

	public void setNaechsteGen(Zelle[][] naechsteGen) {
		this.naechsteGen = naechsteGen;
	}

	public int getAnzZeilenUndSpalten() {
		return anzZeilenUndSpalten;
	}

	public void setAnzZeilenUndSpalten(int anzZeilenUndSpalten) {
		this.anzZeilenUndSpalten = anzZeilenUndSpalten;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getZellengroesse() {
		return zellengroesse;
	}

	public void setZellengroesse(int zellengroesse) {
		this.zellengroesse = zellengroesse;
	}
}
