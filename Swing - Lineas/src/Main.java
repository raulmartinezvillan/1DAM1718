import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame {
	 Lienzo lienzo;
	JSlider slider;
	public Main() {
		super("Líneas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		 slider=new JSlider(JSlider.HORIZONTAL, 10,70, 10);
		
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
		slider.addChangeListener(dibujar());
		
		
	
		c.add(slider, BorderLayout.NORTH);
		// crear y añadir el JSlider
		slider.addChangeListener(new ChangeListener() {
		public void stateChanged(ChangeEvent arg0) {
			lienzo.setNumeroLineas(slider.getValue());			
		}
		
		});
		
		
		// crear y añadir el Lienzo
		lienzo=new Lienzo(500, 500,slider.getValue());
		
		add(lienzo);
		
		pack();
	}
	
	

	private ChangeListener dibujar() {
		return null;
	}



	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main().setVisible(true);
			}
		});
	}
	
}
