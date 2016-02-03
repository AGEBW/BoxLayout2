import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class EjemploBoxLayout extends JFrame
{
	JPanel contentpane;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	public EjemploBoxLayout()
	{
		super("Ventana");
		this.setBounds(400,400,600,300);
		this.setVisible(true);
      
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setLayout(new BoxLayout(contentpane,BoxLayout.Y_AXIS));
		
		b1 = new JButton("Boton1");
		b2 = new JButton("Boton2");
		b3 = new JButton("Boton3");
		b4 = new JButton("Boton4");
		b5 = new JButton("Boton5");
		b6 = new JButton("Boton6");
		b7 = new JButton("Boton7");
		b8 = new JButton("Boton8");

		contentpane.add(b1);
		contentpane.add(b2);
		contentpane.add(b3);
		contentpane.add(b4);
		contentpane.add(b5);
		contentpane.add(b6);
		contentpane.add(b7);
		contentpane.add(b8);
	}
	
	public static void main(String args[])
	{
		EjemploBoxLayout v = new EjemploBoxLayout();
	}
}
