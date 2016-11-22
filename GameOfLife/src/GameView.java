import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameView extends JFrame{
	JPanel grid = new ButtonGrid();
	
	public GameView(){
		super("Game Of Life");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		super.add(new GraphicsPanel());
			
		super.pack();
		super.setVisible(true);
	}
	
	
	//Temp until button implemented
	/*
	public void addOnClickListener(ActionListener c){
		buttons[].addActionListener(c);
	}
	*/
	
	//Change, doesn't need own class
	private class GraphicsPanel extends JPanel {
		
		public GraphicsPanel(){
			super.setPreferredSize(new Dimension(600,600));
			super.setLayout(new GridBagLayout());
		}
		
		//Use for panels later
		GridBagConstraints c = new GridBagConstraints(); 
		
		//Assigning JPanels to layout with grid constraints
		ButtonGrid bg = new ButtonGrid();
		
	}
	
	private class ButtonGrid extends JPanel{
		public ButtonGrid(){
			super.setLayout(new GridLayout());
		}
	}
}