
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JPanel;



public class Lienzo extends JPanel {

	int n;
	int x;
	int y;
	int y1;
	
	public Lienzo( int ancho, int alto,int numLineas) {
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				n=numLineas;
			}
		});
		setPreferredSize(new Dimension(ancho, alto));
		this.n = numLineas;
	}
	
	public void setNumeroLineas(int numLineas) {
		
		n=numLineas;
		
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D lineas=(Graphics2D)g;
		int diagonal=(int) Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(getWidth(), 2));
			int espacios=diagonal/n;
		for(int i=0; i<=n;i++){
			
			 x=espacios*i;	
			 y=-(x)+500;
		
			g.drawLine(0, 0, x, y);
		}
		for(int i=0; i<=n;i++){
			 x=espacios*i;	
			 y=-(x)+500;
			g.drawLine(getWidth(), getHeight(), x, y);
		}
		for(int i=0; i<=n;i++){
			 x=(espacios*i);	
			 y1=(x);
			g.drawLine(getWidth(), 00, x, y1);
			}
		for(int i=0; i<=n;i++){
			 x=espacios*i;	
			 y1=(x);
			g.drawLine(00,getHeight(),x,y1);
			}
		
		
	}
	
}
