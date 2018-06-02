import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsEnvironment;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main extends JFrame{

	Lienzo lienzo;
	JSlider slider;
	JCheckBox box;
	JPanel panel;

	
	public Main() {
		super("Líneas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		// crear y añadir el Lienzo
		lienzo = new Lienzo(900, 600);
		c.add(lienzo);	
		
		panel =  new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS ));
		c.add(panel, BorderLayout.NORTH);
		box =  new JCheckBox("Desc");
		box.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				lienzo.setDescent(e.getStateChange()==ItemEvent.SELECTED);
				
			}
			
		});
		panel.add(box);
		box =  new JCheckBox("Asc");
		box.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				lienzo.setAscent(e.getStateChange()==ItemEvent.SELECTED);
				
			}
			
		});
		panel.add(box);
		box = new JCheckBox("Centrado vertical");
		box.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				lienzo.setCentrado(e.getStateChange()==ItemEvent.SELECTED);
				
			}
			
		});
		panel.add(box);
		box = new JCheckBox("Leading");
		box.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				lienzo.setLeading(e.getStateChange()==ItemEvent.SELECTED);
				
			}
			
		});
		panel.add(box);
		
		
		JComboBox<String> combo = new JComboBox<String>(
				GraphicsEnvironment.
					getLocalGraphicsEnvironment().
					getAvailableFontFamilyNames());
		combo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				lienzo.setfuente((String) e.getItem());
			}
		});
		panel.add(combo);
		pack();
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
