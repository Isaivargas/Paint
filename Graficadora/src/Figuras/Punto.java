package Figuras;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import Principal.Geometria;

public class Punto extends Geometria {
	   

	 public Punto(Point puntoInicial, Color color) {
	      super(puntoInicial,color);
	    }
	   

	@Override
	public void Dibujar(Graphics g) {
		// TODO Auto-generated method stub
            g.setColor(this.color);
	        g.fillOval(puntoInicial.x,puntoInicial.y, 10, 10);
	
	}

	
	
	
}
