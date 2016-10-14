package javaCode;
 
/*
 * GridBagLayoutDemo.java requires no other files.
 */
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class GridBagLayoutDemo {
//Answer Field
	static JTextField result;
	// Question Field
	static JTextField input;
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
 
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

 // Answer Field parameters
 		result = new JTextField();
 		result.setPreferredSize(new Dimension(450, 20));
 		result.setBackground(Color.WHITE);
 		result.setEnabled(false);
 		result.setHorizontalAlignment(SwingConstants.CENTER);
 		result.setDisabledTextColor(Color.BLACK);

 		// Question Field parameters
 		input = new JTextField();
 		input.setPreferredSize(new Dimension(450, 20));
 		input.setBackground(Color.WHITE);
 		input.setEnabled(true);
 		input.setHorizontalAlignment(4);
 		input.setDisabledTextColor(Color.BLACK);

 		// Show Answer
 		c.gridx=0;
 		c.gridwidth=5;
 		c.gridy=1;
 		c.anchor=GridBagConstraints.NORTH;
 		c.fill = GridBagConstraints.HORIZONTAL;
 		pane.add(input, c);

 		// Show Question
 		c.gridx=0;
 		c.gridwidth=5;
 		c.gridy=0;
 		c.fill = GridBagConstraints.HORIZONTAL;
 		pane.add(result, c);
// 
//    JButton equalsButton = new JButton("=");
//
//    c.fill = GridBagConstraints.BOTH;
//    c.gridx = 4;
//    c.gridy = 5;
//    c.anchor=GridBagConstraints.PAGE_END;
//    c.gridheight=1;
//    c.weightx = 0.25;
//    pane.add(equalsButton, c);
// 
//    JButton cancelButton = new JButton("C");
//    c.fill = GridBagConstraints.BOTH;
////    c.weightx = 0.5;
//    c.gridx = 4;
//    c.gridy = 4;
//    c.gridheight=1;
//    c.weightx = 0.25;
//    
//    pane.add(cancelButton, c);
//    
//    
//    
//    JButton addButton = new JButton("+");
//    c.fill = GridBagConstraints.BOTH;
//    c.gridx = 3;
//    c.gridy = 5;
//    c.weightx = 0.25;
//    c.weighty = 0.2;
//    pane.add(addButton, c);
//    
//    
//    JButton subtractButton = new JButton("-");
//   
//    c.fill = GridBagConstraints.BOTH;
//    c.gridx = 3;
//    c.gridy = 4;
//    c.weightx = 0.25;
//    c.weighty = 0.2;
//    pane.add(subtractButton, c);
//    
//    JButton multiplyButton = new JButton("*");
//    c.fill = GridBagConstraints.BOTH;
//    c.gridx = 3;
//    c.gridy = 3;
//    c.weightx = 0.25;
//    c.weighty = 0.2;
//    pane.add(multiplyButton, c);
//    
//    JButton divideButton = new JButton("/");
//    c.fill = GridBagConstraints.BOTH;
//    c.gridx = 3;
//    c.gridy = 2;
//    c.weightx = 0.25;
//    c.weighty = 0.2;
//    pane.add(divideButton, c);
//    
//    JButton exponentButton = new JButton("^");
//    c.fill = GridBagConstraints.BOTH;
//    c.gridx = 3;
//    c.gridy = 1;
//    c.weightx = 0.25;
//    c.weighty = 0.2;
//    pane.add(exponentButton, c);

    
  //Naming number buttons
    JButton[] numberButtons = new JButton[10];
  		for (int i=1;i<=9;i++){
  			numberButtons[i]=new JButton(Integer.toString(i));
  			c.gridwidth=1;
  			if (i<=3){
  			c.gridy = 4;
  		    c.gridx = i-1;}
  			if (i>3&&i<=6){
  				c.gridy = 3;
  				c.gridx = i-4;}
  			if (i>6&&i<=9){
  				c.gridy = 2;
  				c.gridx = i-7;}
  			pane.add(numberButtons[i], c);
  		}
  	//Add action Listener to each Number Button.
  			NumberButton[] numberButtonActions = new NumberButton[10];
  		    for ( int i = 1; i <= 9; i++ ) {
  		    	
  		    	
  		        numberButtonActions[i] = new NumberButton(numberButtons[i]);
  		        numberButtons[i].addActionListener(numberButtonActions[i]);
  		    }
    
    
    
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
	private static class NumberButton implements ActionListener {
		private String buttonFaceValue;
		
		public NumberButton(JButton jButton) {
			// TODO Auto-generated constructor stub
			buttonFaceValue=jButton.getText();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			input.setText(input.getText()+buttonFaceValue);
			
		}
		
	}
    
    
}
