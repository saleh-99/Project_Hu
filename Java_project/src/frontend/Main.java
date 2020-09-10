package frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	private JFrame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
	}
	
	
	
	Main(){
		launch();
	}

	

	private void launch() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setResizable(true);
		frame.setBounds(100, 100, 600, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.black);
		
		JPanel p1 = new JPanel();
		p1.setBorder(BorderFactory.createEmptyBorder(1,30,13,1));
		p1.setBackground(Color.black);
		p1.add(new JLabel("sads"));
		frame.add(p1,BorderLayout.NORTH);
		
		JPanel p2 = new RoundedPanel(50, new Color(175,238,238));
		
	
		p2.setLayout(new FlowLayout());
       
        
        
        
        
       JButton b1 = new JButton("dsadsa");
   
    	p2.add(b1);
		
    	
    	JButton b2 = new JButton("dsadsa");
        
     	p2.add(b2);
     	
     	JButton b3 = new JButton("dsadsa");
       
     	p2.add(b3);
      
		frame.add(p2,BorderLayout.WEST);
	    frame.setVisible(true);
		
		
	}
	
	
	class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
           
            //graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            
            graphics.fillArc(-width,0, width*2, height*20/100*2, 0, 90);
            graphics.fillRect(0, height*20/100, width, height*80/100);
           // graphics.setColor(getForeground());
            //graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
        
        @Override
        public void doLayout() {
        	// TODO Auto-generated method stub
        	super.doLayout();
        	repaint();
        }
    }
}



