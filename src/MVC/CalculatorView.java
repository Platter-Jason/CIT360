package MVC;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{

    private JLabel firstLabel = new JLabel("First Number");
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
    private JLabel secondLabel = new JLabel("Second Number");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Add");
    private JLabel answer = new JLabel("Answer");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

        calcPanel.add(firstLabel);
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
        calcPanel.add(secondLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
        calcPanel.add(answer);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		this.setTitle("Simple Calculator");
		
		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	
	public int getCalcSolution(){
		
		return Integer.parseInt(calcSolution.getText());
		
	}
	
	public void setCalcSolution(int solution){
		
		calcSolution.setText(Integer.toString(solution));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}