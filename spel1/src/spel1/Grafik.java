package spel1;
import javax.swing.*;
import java.awt.*;
public class Grafik extends JFrame {
	
	private int width = 100;
	private int height = 100;
	private int d = 50;
	
	
	
	public Grafik(){
		setSize(700, 800); //x, y
		setLocation(300,300);
		setDefaultCloseOperation(3);
		setTitle("I AM A DUMB BALL");
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Grafik();
	
	}
	
	public void paint(Graphics g){	
		g.setColor(Color, Black);
		g.fillRect(0, 0, 700, 800);
		g.setColor(Color, BLUE);
		g.fillRect(160, 200, width, height);
		g.setColor(Color, PINK);
		g.drawOval(30, 250, d, d);
		g.setColor(Color, BLUE);
		g.fillOval(400, 520, d, d);
		
		
		
	
		
		
		
		

	}

}
