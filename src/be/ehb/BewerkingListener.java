package be.ehb;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BewerkingListener implements ActionListener {

	private RekenenMetMenu rm;

	public BewerkingListener(RekenenMetMenu rm) {
		this.rm = rm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		switch(actionCommand)
		{
			case "Som":
				calculate('+');
				break;
			case "Verschil":
				calculate('-');
				break;
			case "Product":
				calculate('*');
				break;
			case "Quotient":
				calculate('/');
				break;
		}
	}
	
	private void calculate(char operator) {
		String g1 = rm.getGetal1().getText().trim();
		String g2 = rm.getGetal2().getText().trim();

		if(g1.isEmpty() || g2.isEmpty())
		{
			JOptionPane.showMessageDialog(rm, "Gelieve beide tekstvelden in te vullen.");
		}
		else {

			int num1 = (Integer.parseInt(g1));
			int num2 = (Integer.parseInt(g2));
			int result = 0;

			switch (operator) {
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
			}

			rm.getResultaat().setText(String.valueOf(result));
		}
	}
}
