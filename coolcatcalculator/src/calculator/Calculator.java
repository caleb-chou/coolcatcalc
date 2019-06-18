package calculator;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
	private Dimension default_button_size = new Dimension(100,100);
	private JFrame frame;
	private JTextField textField;
	private Font default_font = new Font("Calibri", Font.PLAIN, 36);
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	private JRadioButton degree_radio;
	private JRadioButton radian_radio;
	private boolean deg;
	private String output;
	public String temp;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 1000);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel output_container = new JPanel();
		frame.getContentPane().add(output_container);
		
		ButtonGroup mode = new ButtonGroup();
		
		degree_radio = new JRadioButton("Degrees");
		degree_radio.setSelected(true);
		degree_radio.setFont(default_font);
		output_container.add(degree_radio);
		
		radian_radio = new JRadioButton("Radians");
		radian_radio.setFont(default_font);
		radian_radio.setSelected(false);
		output_container.add(radian_radio);
		
		mode.add(degree_radio);
		mode.add(radian_radio);
		
		textField = new JTextField();
		output_container.add(textField);
		textField.setColumns(25);
		textField.setFont(default_font);
		textField.setPreferredSize(new Dimension(600,100));
		
		JPanel input_container = new JPanel();
		frame.getContentPane().add(input_container);
		input_container.setLayout(new GridLayout(5, 4));
		
		JButton cur;
		for(int i=0;i<3;i++) {
			buttons.add(new JButton(""+(7+i)));
			cur = buttons.get(i);
			cur.setFont(default_font);
			cur.setPreferredSize(default_button_size);
			cur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			input_container.add(cur);
		}
		
		JButton multiply = new JButton("x");
		multiply.setFont(default_font);
		multiply.setSize(default_button_size);
		input_container.add(multiply);
		
		for(int i=0;i<3;i++) {
			buttons.add(new JButton(""+(4+i)));
			cur = buttons.get(i+3);
			cur.setFont(default_font);
			cur.setPreferredSize(default_button_size);
			cur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			input_container.add(cur);
		}
		
		JButton add = new JButton("+");
		add.setFont(default_font);
		add.setSize(default_button_size);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		input_container.add(add);
		
		for(int i=0;i<3;i++) {
			buttons.add(new JButton(""+(1+i)));
			cur = buttons.get(i+6);
			cur.setFont(default_font);
			cur.setPreferredSize(default_button_size);
			cur.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			input_container.add(cur);
		}

		JButton subtract = new JButton("-");
		subtract.setFont(default_font);
		subtract.setSize(default_button_size);
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		input_container.add(subtract);
		
		buttons.add(new JButton("0"));
		buttons.get(buttons.size()-1).setFont(default_font);
		buttons.get(buttons.size()-1).setPreferredSize(default_button_size);
		buttons.get(buttons.size()-1).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		input_container.add(buttons.get(buttons.size()-1));
				
		JButton decimal_button = new JButton(".");
		decimal_button.setFont(default_font);
		decimal_button.setPreferredSize(default_button_size);
		decimal_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		input_container.add(decimal_button);

		JButton m = new JButton("M");
		m.setFont(default_font);
		m.setSize(default_button_size);
		m.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		input_container.add(m);
		
		JButton equal = new JButton("=");
		equal.setFont(default_font);
		equal.setSize(default_button_size);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		input_container.add(equal);
	}
	
}
