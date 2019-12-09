package Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.*;


import Panel.DibujoJPanel;

public class OpcionesJPanel extends JPanel {
	 public JRadioButton relleno  =new JRadioButton("Relleno");
	 public JRadioButton vacio    =new JRadioButton("Vacio");
	 public JRadioButton puntos   =new JRadioButton("Punto");
	 public JRadioButton lineas   =new JRadioButton("Linea");
	 public JRadioButton cuadrados=new JRadioButton("Cuadrado");
	 public JRadioButton triangulos=new JRadioButton("Triangulo");
	 public JRadioButton circulos = new JRadioButton("Circulo");
	 
	 ButtonGroup bg;
	 DibujoJPanel db;
	 
	public OpcionesJPanel(DibujoJPanel DibujoJPanel) {
		 
	    	bg=new ButtonGroup();
		this.db=DibujoJPanel;
		 	
		 bg.add(relleno); 
		 db.add(relleno);
		 
		  bg.add(vacio); 
		  db.add(vacio);
		    
		  bg.add(puntos);
	      db.add(puntos);
	      
	      bg.add(lineas);
	      db.add(lineas);
	      
	      bg.add(cuadrados);
	      db.add(cuadrados);
	      
	      bg.add(triangulos);
	      db.add(triangulos);
	      
	      bg.add(circulos);
	      db.add(circulos);
	      
	    relleno.addItemListener(new ManejadorEvento());
	    vacio.addItemListener(new ManejadorEvento());
        puntos.addItemListener(new ManejadorEvento());
        lineas.addItemListener(new ManejadorEvento());
        cuadrados.addItemListener(new ManejadorEvento());
        triangulos.addItemListener(new ManejadorEvento());
        circulos.addItemListener(new ManejadorEvento());
      	
	}
	
	
	
	
	private class ManejadorEvento implements ItemListener{
	
		@Override
		public void itemStateChanged(ItemEvent e) {
		
			if(e.getSource()==relleno) {	
				 db.setOpcion("relleno");
			}
			

			if(e.getSource()==vacio) {	
				 db.setOpcion("vacio");
			}
			

			if(e.getSource()==puntos) {	
				 db.setOpcion("puntos");
			}
			

			if(e.getSource()==lineas) {	
				 db.setOpcion("lineas");
			}
			

			if(e.getSource()==cuadrados) {	
				 db.setOpcion("cuadrados");
			}
			

			if(e.getSource()==triangulos) {	
				 db.setOpcion("triangulos");
			}
			

			if(e.getSource()==circulos) {	
				 db.setOpcion("circulos");
			}
			
			
			
		}
	}
	
	
	
	

}
