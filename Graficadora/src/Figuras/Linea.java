package Figuras;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import Principal.Geometria;

public class Linea extends Geometria{
	private Point puntoFinal;

	public Linea(Point puntoInicial, Color color) {
		super(puntoInicial, color);
		// TODO Auto-generated constructor stub
		this.puntoFinal=puntoFinal;
	}

	public Point getPuntofinal() {
		return this.puntoFinal;
	}
	
	
	@Override
	public void Dibujar(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(this.color);
		g.drawLine(this.puntoInicial.x,this.puntoInicial.y, this.puntoFinal.x,this.puntoFinal.y);
		
	}

}
