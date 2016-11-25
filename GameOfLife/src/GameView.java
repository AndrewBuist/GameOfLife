import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Using containment since not modifying JFrame, implementing runnable
public class GameView implements Runnable{
	private GameModel model;
	private JFrame frame; 
	
	public GameView(GameModel model){
		this.model = model;
		model.addObserver(new ModelObserver());
		run();
	}
	
	private void run(){
		frame = new JFrame("Game Of Life");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new BasePanel())s;
			
		frame.pack();
		frame.setVisible(true);
	}
	
	private class ModelObserver implements Observer{
		public void update(Observer O, Object arg){
			
		}
	}
	
	//Temp until button implemented
	/*
	public void addOnClickListener(ActionListener c){
		buttons[].addActionListener(c);
	}
	*/
	
	//Never mind it's its own class, preferred since it will keep everything together well
	private class BasePanel extends JPanel {
		private GridBagConstraints constraints = new GridBagConstraints(); 
		
		public BasePanel(){
			setLayout(new GridBagLayout());
			add(new ButtonGrid(), addComponentConstraints(1,1,1,1));  //ADD CORRECT VALUES
			add(new InfoPanel(), addComponentConstraints(1,1,1,1));   //ADD CORRECT VALUES
			add(new ButtonPanel(), addComponentConstraints(1,1,1,1)); //ADD CORRECT VALUES
		}
		
		//Assigning grid constraints
		private GridBagConstraints addComponentConstraints(int x, int y, int w, int h){
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight = h;
			constraints.weightx = 1;
			constraints.weighty = 1;
			return constraints;
		}
	}
	
	//Start with fixed size, change later.
	private class ButtonGrid extends JPanel{
		public ButtonGrid(){
			setLayout(new GridLayout());
		}
	}
	
	private class InfoPanel extends JPanel{
		
	}
	
	private class ButtonPanel extends JPanel{
		
	}
}