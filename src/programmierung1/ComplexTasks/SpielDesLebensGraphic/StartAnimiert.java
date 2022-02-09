package programmierung1.ComplexTasks.SpielDesLebensGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

public class StartAnimiert extends JPanel {

	/**
	 * 
	 */
	@Serial
	private static final long serialVersionUID = 3781969029025239025L;

	/**
	 * Reference auf SpielDesLebens
	 */
	private SpielDesLebens spiel;
	private final int ANZ_ZEILEN_SPALTEN = 8;

	/**
	 * Reference auf den ActionListener der den Timer steuert
	 */

	/**
	 * Default-Konstruktor erstellt eine neue Instanz der Klasse SpielDesLebens.
	 * Dafür wird der Initialisierungskonstruktor von SpielDesLebens aufgerufen. Es
	 * werden Anzahl der Zellen, Posisition und Zellgröße festgelegt. Außerdem wird
	 * der neue ActionsListener erstellt und definiert.
	 */
	public StartAnimiert() {
		spiel = new SpielDesLebens(ANZ_ZEILEN_SPALTEN, 0, 40, 40);
		
	}

	@Override
	protected void paintComponent(final Graphics g) {
		super.paintComponent(g);

		spiel.paintGen(g);
	}



	public SpielDesLebens getSpiel() {
		return spiel;
	}

	public void setSpiel(SpielDesLebens spiel) {
		this.spiel = spiel;
	}

	public static void main(final String[] args) {
		
		ActionListener alTimer;
		Timer timer;
		Container panel;
		JFrame f = new JFrame("Spiel des Lebens");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new StartAnimiert();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		
		f.pack();
		f.setLocationRelativeTo(null);
		f.setSize(800, 600);
		f.setVisible(true);
		
		alTimer = new ActionListener() {
			/**
			 * Implementierung des ActionListeners. Dieser berechnet die nächste
			 * Generation und zeichtnet diese neu.
			 */
			public void actionPerformed(ActionEvent e) {
				////////////// Neue Generation berechnen ///////////
				( (StartAnimiert) panel).getSpiel().berechneNaechsteGen();
				f.repaint();
			}
		};
		
		/*
		 * Anlegen des Timers mit 10 ms Der Timer bekommt den ActionListeners übergeben
		 * und löst im Zeittakt entsprechende Events aus.
		 */
		// Integer-Literal kann zum Setzen eines Zeittaktes ver�ndert werden.
		timer = new Timer(100, alTimer);

		Runnable gui = new Runnable() {
			@Override
			public void run() {
				timer.start();
			}
		};
		// GUI must start on EventDispatchThread:
		SwingUtilities.invokeLater(gui);
		timer.stop();
	}

}
