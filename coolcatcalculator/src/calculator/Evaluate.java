package calculator;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evaluate {

	private JFrame frame;
	private JTextField equation_field;
	private JTextField output_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluate window = new Evaluate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Evaluate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel main = new JPanel();
		frame.getContentPane().add(main);
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		
		JPanel input_panel = new JPanel();
		main.add(input_panel);
		input_panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		main.setBorder(new TitledBorder("Albertnator 5000 (tm)"));
		((javax.swing.border.TitledBorder)main.getBorder()).setTitleFont(
				new Font("Ariel",Font.BOLD,36));
		((javax.swing.border.TitledBorder)main.getBorder()).setTitleColor((Color.RED));
		
		JLabel equation_label = new JLabel("Equation");
		equation_label.setFont(new Font("Tahoma", Font.PLAIN, 48));
		input_panel.add(equation_label);
		
		equation_field = new JTextField();
		equation_field.setFont(new Font("Tahoma", Font.PLAIN, 48));
		input_panel.add(equation_field);
		equation_field.setColumns(25);
		
		JPanel output_panel = new JPanel();
		main.add(output_panel);
		
		JLabel output_label = new JLabel(" Output");
		output_label.setFont(new Font("Tahoma", Font.PLAIN, 48));
		output_panel.add(output_label);
		
		output_field = new JTextField();
		output_field.setFont(new Font("Tahoma", Font.PLAIN, 48));
		output_panel.add(output_field);
		output_field.setColumns(25);
		output_field.setEditable(false);
		
		JPanel button_panel = new JPanel();
		main.add(button_panel);
		
		JButton calculate_button = new JButton("Calculate");
		calculate_button.setFont(new Font("Tahoma", Font.PLAIN, 48));
		calculate_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Eval ev = new Eval();
				output_field.setText(""+EvalSOF.normalEval(equation_field.getText()));
			}
		});
		button_panel.add(calculate_button);
		
		JButton reset_button = new JButton("  Reset  ");
		reset_button.setFont(new Font("Tahoma", Font.PLAIN, 48));
		reset_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				equation_field.setText("");
			}
			
		});
		button_panel.add(reset_button);
		
		JPanel fine_print_panel = new JPanel();
		main.add(fine_print_panel);
		
		JLabel fine_print_label = new JLabel("Not copyright Caleb Chou, 2017");
		fine_print_label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		fine_print_panel.add(fine_print_label);
	}
}
