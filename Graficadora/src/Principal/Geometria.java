package Principal;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Geometria {
 
	protected Point puntoInicial;
	protected Color color;
	
	public Geometria(Point puntoInicial,Color color) {
		this.puntoInicial=puntoInicial;
		this.color=color;
	}
	
	
	public Point getPuntoInicial() {
		return puntoInicial;
	}

	public Color getColor() {
		return color;
	}

	public abstract void Dibujar(Graphics g);
	
	
	
}
