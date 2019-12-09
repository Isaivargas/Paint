package Panel;
import java.awt.Color;


import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import Principal.Geometria;
import clases.Circulo;
import clases.Cuadrado;
import clases.Linea;
import clases.Triangulo;
import Figuras.*;

public class DibujoJPanel extends JPanel implements MouseListener{
String Opcion;

ArrayList <Geometria> figuras;

private Geometria elementoActual;
private Color colorActual =Color.WHITE;	

private Punto punto ;
private Linea linea;
private Cuadrado cuadrado;
private Circulo circulo ;
private Triangulo triangulo;

	
	public DibujoJPanel () {
		
		
		
	addMouseListener( new MouseAdapter() {
		
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
    
		if(Opcion=="puntoS") {	
	    	
                         elementoActual = new Punto(e.getPoint(), colorActual);  
                         figuras.add(elementoActual);        
                         repaint();
                         }
		
   
     
	}
      });
	
	
	    }
				
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public String setOpcion(String Opcion) {  //Establece la opcion deseada 

		switch(Opcion) {
		
		case "vacio": this.Opcion=Opcion;
			break;
			
	    case "lleno": this.Opcion=Opcion;
			break;
		
	    case "puntos": this.Opcion=Opcion;
			break;
			
	    case "lineas": this.Opcion=Opcion;
			break;
			
	    case "cuadrados":this.Opcion=Opcion;
			break;
	   
	   case "triangulos":this.Opcion=Opcion;
			break;
	   
	    case "circulos":this.Opcion=Opcion;
			break;
		};
		
		
		return Opcion;
	}
	

	public String getOpcion() {
		return Opcion;
	}
	
	
	
	public void paintComponent(Graphics g) {
		     
		        super.paintComponent(g);
                if (elementoActual != null) {
        	   
                	elementoActual.Dibujar(g);  
        	 
                  }
		
	}
	
	public void cambiarColor(Color nuevoColor) {
		if (nuevoColor == null) {
			nuevoColor = Color.WHITE;
		}
		colorActual = nuevoColor;
		repaint();
	}

	
	
	
	

}
