//Author Name: Kevin Taylor
//Date: 5/14/2019
//Program Name: Taylor_Drone
//Purpose: Simulation using button, drone movement in x, y,z location

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class Drone_Movements {

	static Drone drone = new Drone();
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Drone Test");
		
		frame.setSize(400, 175);
		frame.setLocation(300,200);
		
		frame.setResizable(false);
		
		
		JPanel window = new JPanel();
		window.setLayout(new BorderLayout() );

		JPanel centerButtonContainer = new JPanel();
		JPanel centerWestButtonContainer = new JPanel();
		JPanel centerCenterButtonContainer = new JPanel();
		JPanel centerEastButtonContainer = new JPanel();
		JPanel westButtonContainer = new JPanel();
		
		westButtonContainer.setLayout(new GridLayout(2, 1));
		centerCenterButtonContainer.setLayout(new GridLayout(2,1));
		
	    final JTextArea coordinates = new JTextArea(1, 10);
	    coordinates.setEditable(false);
	    
	    final JButton upButton = new JButton("Up");
	    final JButton downButton = new JButton("Down");
	    JButton leftButton = new JButton("Left");
	    JButton rightButton = new JButton("Right");
	    JButton forwardButton = new JButton("Forward");
	    JButton backwardButton = new JButton("Backward");
	    
	    westButtonContainer.add(BorderLayout.NORTH, upButton);
	    westButtonContainer.add(BorderLayout.SOUTH, downButton);
	    
	    centerWestButtonContainer.add(leftButton);
	    centerCenterButtonContainer.add(BorderLayout.NORTH, forwardButton);
	    centerCenterButtonContainer.add(BorderLayout.SOUTH, backwardButton);
	    centerEastButtonContainer.add(rightButton);
	    
	    centerButtonContainer.add(BorderLayout.WEST, centerWestButtonContainer);
	    centerButtonContainer.add(BorderLayout.CENTER, centerCenterButtonContainer);
	    centerButtonContainer.add(BorderLayout.EAST, centerEastButtonContainer);

	    window.add(BorderLayout.NORTH, coordinates);
	    window.add(BorderLayout.WEST, westButtonContainer);
	    window.add(BorderLayout.CENTER, centerButtonContainer);

	    frame.getContentPane().add(window);
	    
	    upButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	drone.setY_pos(drone.getY_pos() + 1);
	        	
	        	coordinates.setText(null);
	        	
	        	coordinates.append(drone.getCoordinates());
	        }
	    });
	    
	    downButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	drone.setY_pos(drone.getY_pos() - 1);
	        	
	        	coordinates.setText(null);
	        	
	        	coordinates.append(drone.getCoordinates());
	        }
	    });
	    
	    leftButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	drone.setX_pos(drone.getX_pos() - 1);
	        	
	        	coordinates.setText(null);
	        	
	        	coordinates.append(drone.getCoordinates());
	        }
	    });
	    
	    rightButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	drone.setX_pos(drone.getX_pos() + 1);
	        	
	        	coordinates.setText(null);
	        	
	        	coordinates.append(drone.getCoordinates());
	        }
	    });
	    
	    forwardButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	drone.setZ_pos(drone.getZ_pos() + 1);
	        	
	        	coordinates.setText(null);
	        	
	        	coordinates.append(drone.getCoordinates());
	        }
	    });
	    
	    backwardButton.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            
	        	drone.setZ_pos(drone.getZ_pos() - 1);
	        	
	        	coordinates.setText(null);
	        	
	        	coordinates.append(drone.getCoordinates());
		        
	        }
	    });

	    frame.setVisible(true);


	}

}
