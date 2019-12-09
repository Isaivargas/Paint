package Frame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

import Panel.DibujoJPanel;
import Panel.OpcionesJPanel;

public class DibujoJFrame extends JFrame {
	
	private OpcionesJPanel ojp;
	private DibujoJPanel   djp;
	private JButton cambioColor;
	
	public DibujoJFrame (){
		
		super("Paint Loco");
		
		this.djp = new DibujoJPanel();
		this.ojp = new OpcionesJPanel(djp);
		
		
		cambioColor = new JButton("Color");
	
		add(BorderLayout.CENTER,djp);
		add(BorderLayout.NORTH, ojp);
		add(BorderLayout.EAST, cambioColor);
		
		
	
		setSize(800,600);
		setVisible(true);
		
		
		this.cambioColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				djp.cambiarColor(JColorChooser.showDialog(DibujoJFrame.this,"SeleccionColor",Color.BLACK ));
			}
			
		});
		
		
	}
	
	
	
	
	

}
