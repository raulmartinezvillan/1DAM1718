package MenuBarraEclipse;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.xml.transform.OutputKeys;



public class MenuBarra extends JFrame {

	JMenuBar menubar = new JMenuBar();
	JMenuItem menuItem;
	JMenuItem menu_new;
	JMenu menu;
	JMenu menuf;
	JMenu menun;
	protected JPopupMenu popup;


	public MenuBarra() {
		super("Barra de eclipse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(500, 500));
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		setJMenuBar(menubar);

		menuf = new JMenu("File");
		menuf.setMnemonic('f');
		
		AbstractAction a = new AbstractAction("New") {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		a.putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.SHIFT_MASK));
		
		menun = new JMenu(a);
		menuNew();
		menuf.add(menun);
			
		menuItem = new JMenuItem("Open File");
		menuf.add(menuItem);
		menuItem = new JMenuItem("Open proyects from file System");
		menuf.add(menuItem);
		AbstractAction b = new AbstractAction("Close") {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		b.putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.ALT_MASK));
		menuItem = new JMenu(b);
		menuf.add(b);
		AbstractAction c = new AbstractAction("Close all") {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		c.putValue(AbstractAction.ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.ALT_MASK | KeyEvent.SHIFT_MASK));
		menuItem = new JMenu(c);
		menuf.add(b);

		ImageIcon save = new ImageIcon(getClass().getResource("/img2/save.png"));

		AbstractAction d = new AbstractAction("Save", save) {
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		d.putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK));
		menuItem = new JMenu(d);
		menuf.add(d);

		ImageIcon saveas = new ImageIcon(getClass().getResource("/img2/saveas.png"));

		AbstractAction h = new AbstractAction("Save", saveas) {
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		h.putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.VK_CONTROL));

		menuItem = new JMenu(h);
		menuf.add(h);

		ImageIcon saveall = new ImageIcon(getClass().getResource("/img2/saveall.png"));

		AbstractAction e = new AbstractAction("Save all", saveall) {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		e.putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK));
		menuItem = new JMenu(e);
		menuf.add(e);

		menuItem = new JMenuItem("Revet");
		menuf.add(menuItem);
		menuItem = new JMenuItem("Move");
		menuf.add(menuItem);

		ImageIcon rename = new ImageIcon(getClass().getResource("/img2/rename.png"));
		AbstractAction f = new AbstractAction("Rename", rename) {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		f.putValue(AbstractAction.MNEMONIC_KEY, KeyEvent.VK_F2);

		menuItem = new JMenu(f);
		menuf.add(f);

		ImageIcon refresh = new ImageIcon(getClass().getResource("/img2/refresh.png"));

		AbstractAction g = new AbstractAction("Refrect", refresh) {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		g.putValue(AbstractAction.MNEMONIC_KEY, KeyEvent.VK_F5);

		menuItem = new JMenu(g);
		menuf.add(g);

		menuItem = new JMenu("Convert Line Delimiters To");
		menuf.add(menuItem);

		ImageIcon print = new ImageIcon(getClass().getResource("/img2/print.png"));

		AbstractAction ei = new AbstractAction("Print...", print) {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		};
		ei.putValue(AbstractAction.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.VK_CONTROL));

		menuItem = new JMenuItem(ei);
		menuf.add(menuItem);

		ImageIcon Import = new ImageIcon(getClass().getResource("/img2/import.png"));

		menuItem = new JMenuItem("Import", Import);
		menuf.add(menuItem);

		ImageIcon Export = new ImageIcon(getClass().getResource("/img2/export.png"));

		menuItem = new JMenuItem("Export", Export);
		menuf.add(menuItem);

		menubar.add(menuf);

		menu = new JMenu("Edit");
		menu.setMnemonic('e');
		menubar.add(menu);

		menu = new JMenu("Source");
		menu.setMnemonic('s');
		menubar.add(menu);

		menu = new JMenu("Refactor");
		menu.setMnemonic('t');
		menubar.add(menu);

		menu = new JMenu("Navifate");
		menu.setMnemonic('n');
		menubar.add(menu);

		menu = new JMenu("Search");
		menu.setMnemonic('a');
		menubar.add(menu);

		menu = new JMenu("Run");
		menu.setMnemonic('r');
		menubar.add(menu);

		menu = new JMenu("Window");
		menu.setMnemonic('w');
		menubar.add(menu);

		menu = new JMenu("Help");
		menu.setMnemonic('h');
		menubar.add(menu);
		pack();
	}

	private KeyStroke KeyStroke(int vkF2) {
		return null;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MenuBarra().setVisible(true);
			}
		});

	}

	public JMenuItem menuNew() {

		menuItem= new JMenuItem("Java Project");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this,"Proyecto creado", "Java project",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Project");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this,"Proyecto seleccionado",  "Project", 
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Package");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this,"Paquete creado",  "Java project", 
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Class");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this,"Clase creado",  "Class", 
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Interface");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Interfaz creada",  "Interface",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Enum");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Enum creada",  "Enum",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Annotation");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Anotacion creada",  "Annotation",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Source Folder");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Carpeta creada",  "Source Folder",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Java Working Set");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Nuevo trabajo creado", "Java Working Set",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Folder");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Carpeta encontrada",  "Folder",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("File");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Archivo encontrado", "File", 
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Untiled Text File");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Archivo de texto creado",  "Untiled Text File",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("JUnit Text Case");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Calse de prueba creada", "JUnit Text Case",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Task");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this,  "Repositorio seleccionado", "Task",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Example...");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Proyecto creado con XML",  "Example...",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		menuItem = new JMenuItem("Other...");
		menun.add(menuItem);
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(MenuBarra.this, "Caso JUnit creado",  "Other...",
				JOptionPane.INFORMATION_MESSAGE);
			}
		});
		return menun;
	}

	



		


}
