import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class Frame extends JFrame {

	private static final long serialVersionUID = -7356659789123601557L;
	Lienzo lienzo;

	
	public Frame() {
		super("Swing Text Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(lienzo = new Lienzo(500, 500));
		
		pack();
		// hacer que gire el texto a la izquierda 10º
		Action izda= new AbstractAction() {
			
			private static final long serialVersionUID = 8314840621534730340L;

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lienzo.rotarIzquierda(Math.PI/18);
				
			}
		};
		KeyStroke key = KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,0);
		getRootPane().getInputMap().put(key, "izda");
		getRootPane().getActionMap().put("izda", izda);
		
		Action drch= new AbstractAction() {
			
			private static final long serialVersionUID = 5146273044504254000L;

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				lienzo.rotarDerecha(Math.PI/18);
				
			}
		};
		 key = KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,0);
		getRootPane().getInputMap().put(key, "drch");
		getRootPane().getActionMap().put("drch", drch);
		
	}
	
}
