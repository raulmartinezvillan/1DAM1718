import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
	
	
	String s ="Texto de Prueba";
	int x;  
	int y;
	int y1;
	int y2;
	private Font font;
	private boolean Centrado;
	private boolean Ascent;
	private boolean Descent;
	private boolean Leading;
	private int altura;
	FontMetrics fm;
	public Lienzo(int ancho, int alto) {
		
		setPreferredSize(new Dimension(ancho, alto));
		font = getFont().deriveFont((float)(getFont().getSize() * 4));
		altura = font.getSize();
		
	}
	
	public void setCentrado (boolean centrado){
		this.Centrado=centrado;
		repaint();
				
	}
	
	public void setAscent (boolean ascent){
		this.Ascent=ascent;
		repaint();
				
	}
	
	public void setDescent (boolean descent){
		this.Descent=descent;
		repaint();
				
	}
	
	public void setLeading (boolean leading){
		this.Leading=leading;
		repaint();
				
	}
	
	public void setfuente (String name){
		font = new Font(name, Font.PLAIN, altura);
		repaint();
				
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.setFont(g.getFont().deriveFont((float) (g.getFont().getSize2D() * 2)));
		fm = g.getFontMetrics();
		 x= (getWidth()-fm.stringWidth(s))/2;
		 y= (getHeight()/2);
		
		if(Centrado){
			y =(getHeight()/2 + (fm.getAscent() - fm.getDescent()) / 2);
			g.drawString(s, x, y);
		}
		g.drawString(s, x, y);
		
		if(Ascent){
		int y2 =(y-fm.getAscent());   // ascent
		g.setColor(Color.BLUE);
		g.drawLine(0, y2, (getWidth()-1), y2);
		}
		
		if(Descent){
			int y1 =(y+fm.getDescent());   // descent
			g.setColor(Color.GREEN); 
			g.drawLine(0, y1, (getWidth())-1, y1);
		}
		
		if(Leading){
			int y4=(y+fm.getDescent()); 
			int yl =y4 + fm.getLeading();
			g.setColor(Color.DARK_GRAY);
			g.drawLine(0, yl, (getWidth())-1, yl);
		}
	}
		
}
