package extra;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.io.File;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener {
	
	//properties of this class - the panel that shows up
	int screen_width 	= 600;
	int screen_height 	= 600;
	int max_vals = 200;
	int size = 30;
	int g = 0;
	String bg = "background.png";
	JLabel background;
	
	
	
	//1) Declare an array of Square objects here
	
	//2) declare an array of Circle objects here
	
	//3) Declare the game character here
	
	
	//only do drawing for paint
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.setFont(font);

		
		
	
		
		
	}//end of paint method - put code above for anything dealing with drawing -
	
	
	
	Font font = new Font ("Courier New", 1, 50);
	
	/* do not draw here */
	public void update() {
		
		//loop through each object in Squares
		//call their collision detection
		
		
		//loop through each object in Circles
		//call their collision detection
		
		
	}//end of update method - put code above for any updates on variable
		
	
	//==================code above ===========================
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();
		repaint();
	}
	
	public static void main(String[] arg) {
		Driver d = new Driver();
	}
	public Driver(){
		
		JFrame f = new JFrame();
		f.setTitle("Click Em");
		f.add(background);
		f.setSize(screen_width, screen_height);
		f.getContentPane().setBackground(Color.black);
		String src = new File("").getAbsolutePath()+"/src/"; //path to image setup
		ImageIcon backg = new ImageIcon(src+bg);    //setups icon image
		background = new JLabel(backg);
		background.setBounds(0,0,600,600); //set location and size of icon
		f.add(background);
		
		f.setResizable(false);
		f.setLayout(null);
		f.addKeyListener(this);
		f.addMouseMotionListener(this);
		

		
		
		
		
		//end creating objects
		t = new Timer(17,this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	Timer t;

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==38){ //38 is up

		}
	
		update();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println(e.getX());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
 
	public void reset(){
	
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
	
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}