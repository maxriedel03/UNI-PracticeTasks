package programmierung1.ComplexTasks.SpielDesLebensGraphic;

import java.awt.*;

public class Zelle {

	private int x;
	private int y;
	private int breite;
	private int hoehe;
	private boolean isLebendig;
	private Color farbeRand;// Farbe für den Rand. Ist nicht in der Aufgabenstellung

	private final Color farbeTot = Color.BLACK;
	private final Color farbeLebendig = Color.GREEN;;

	public Zelle(int _x, int _y, int _breite, int _hoehe, boolean _lebendig, Color _farbe) {
		this.x = _x;
		this.y = _y;
		this.breite = _breite;
		this.hoehe = _hoehe;
		this.isLebendig = _lebendig;
		this.farbeRand = _farbe;
	}

	public Zelle(int _x, int _y, int _breite, int _hoehe, boolean _lebendig) {
		this(_x, _y, _breite, _hoehe, _lebendig, Color.ORANGE);
	}

	public Zelle(int _x, int _y, boolean _lebendig) {
		this(_x, _y, 10, 10, _lebendig, Color.ORANGE);
	}

	public Zelle() {
		this(0, 0, 10, 10, true, Color.ORANGE);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int _x) {
		this.x = _x;
	}

	public void setY(int _y) {
		this.y = _y;
	}

	public int getBreite() {
		return this.breite;
	}

	public int getHoehe() {
		return this.hoehe;
	}

	public void setFarbe(Color _farbe) {
		this.farbeRand = _farbe;
	}

	public boolean istLebendig() {
		return isLebendig;
	}

	public void isClicked(int x, int y) {
		if (x >= this.x && x < this.x + breite && y >= this.y && y < this.y + hoehe) {
			setLebendig(!isLebendig);
		}
	}

	public void setLebendig(boolean lebendig) {
		this.isLebendig = lebendig;
	}

	public void paint(Graphics g) {
		if (isLebendig)
			g.setColor(farbeLebendig);
		else
			g.setColor(farbeTot);
		g.fillRect(this.x, this.y, this.breite, this.hoehe);
		g.setColor(this.farbeRand);
		g.drawRect(this.x, this.y, this.breite, this.hoehe);
	}

}
