package FasesDeLaLuna;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Luna extends JFrame implements ActionListener {

	JLabel label;
	JLabel label1;
	JLabel label2;
	JButton boton;
	JButton boton1;
	JPanel panel;
	JPanel panel1;
	JPanel panel2;
	int img = 0;
	String titulo;
	String[] fase = { "Luna Nueva", "Luna Creciente", "Cuarto Creciente", "Quinto Octante", "Luna Llena",
			"Tercer Octante", "Cuarto Menguante", "Luna Menguante" };

	public Luna() {
		super("Fase de la luna");
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.BLACK);
		panel1 = new JPanel(new BorderLayout());
		panel2 = new JPanel(new BorderLayout());

		try {
			label = new JLabel(new ImageIcon(getClass().getResource("/img/" + img + ".png")));
			label2 = new JLabel(fase[img], SwingConstants.CENTER);
			

			panel2.add(label, BorderLayout.NORTH);
			panel2.setBackground(Color.BLACK);
			panel2.add(label2, BorderLayout.CENTER);
			label2.setForeground(Color.WHITE);

		} catch (Exception e) {
			System.out.println("No se a encontrado la imagen");
		}
		panel1.add(panel2, BorderLayout.CENTER);
		c.add(panel1, BorderLayout.NORTH);
		label1 = new JLabel();
		ImageIcon Iboton = new ImageIcon(getClass().getResource("/img/right-arrow.png"));
		boton = new JButton("Siguiente");
		boton.setIcon(Iboton);
		boton.setHorizontalTextPosition(JButton.LEFT);
		boton.addActionListener(this);
		ImageIcon Iboton1 = new ImageIcon(getClass().getResource("/img/left-arrow.png"));
		boton1 = new JButton("Anterior");
		boton1.setIcon(Iboton1);
		boton1.setEnabled(false);
		boton1.addActionListener(this);
		panel = new JPanel(new BorderLayout());
		panel.add(boton, BorderLayout.EAST);
		panel.add(boton1, BorderLayout.WEST);
		c.add(panel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Luna().setVisible(true);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		if (ac.equals("Siguiente") && img < 7) {
			img++;
			label.setIcon(new ImageIcon(getClass().getResource("/img/" + img + ".png")));
			try {
				label2.setText(fase[img]);
			} catch (ArrayIndexOutOfBoundsException ee) {

			}

			if (img == 7)
				boton.setEnabled(false);
			if (!boton1.isEnabled())
				boton1.setEnabled(true);

		} else if (ac.equals("Anterior") && img > 0) {
			img--;

			label.setIcon(new ImageIcon(getClass().getResource("/img/" + img + ".png")));
			label2.setText(fase[img]);
			if (img == 0)
				boton1.setEnabled(false);
			if (!boton.isEnabled())
				boton.setEnabled(true);
		}
	}

}
