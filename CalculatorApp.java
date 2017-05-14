package davidlawalCalculatorApp;


	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import java.awt.BorderLayout;
	import java.awt.Color;
	import javax.swing.JButton;
	import java.awt.Font;
	import javax.swing.ImageIcon;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.SwingConstants;
	
	public class CalculatorApp {
	
		private JFrame frame;
		private JTextField textField;
		
		double firstNum;
		double secondNum;
		double result;
		String operations;
		String answer;
		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						CalculatorApp window = new CalculatorApp();
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
		public CalculatorApp() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBackground(new Color(240, 240, 240));
			frame.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setBounds(10, 23, 261, 47);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
		
			//---------------ROW 1------------------------------
			JButton btnClear = new JButton("C");
			
			btnClear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//String EnterNum = textField.getText() + btn4.getText();
					 textField.setText(null);
					
				}
			});
			btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnClear.setBounds(10, 100, 50, 50);
			frame.getContentPane().add(btnClear);
			
			JButton btnDivide = new JButton("/");
			btnDivide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "/";
					
				}
			});
			btnDivide.setToolTipText("");
			btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDivide.setBounds(60, 100, 50, 50);
			frame.getContentPane().add(btnDivide);
			
			JButton btnMult = new JButton("*");
			btnMult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "*";
					
				}
			});
			btnMult.setForeground(new Color(0, 0, 0));
			btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnMult.setBounds(109, 100, 50, 50);
			frame.getContentPane().add(btnMult);
			
			JButton btnBack = new JButton("\uF0E7");
			btnBack.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
				String back = null;
				
				if(textField.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					back = strB.toString();
					textField.setText(back);
				}
					
				}
			});
			btnBack.setForeground(Color.BLACK);
			btnBack.setIcon(new ImageIcon(CalculatorApp.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnBack.setBounds(160, 100, 50, 50);
			frame.getContentPane().add(btnBack);
			
			//-------------------------ROW 2 ------------------------------------------------------------------
			
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNum = textField.getText() + btn7.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn7.setBounds(10, 150, 50, 50);
			frame.getContentPane().add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					String EnterNum = textField.getText() + btn8.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn8.setBounds(60, 150, 50, 50);
			frame.getContentPane().add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn9.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn9.setBounds(109, 150, 50, 50);
			frame.getContentPane().add(btn9);
			
			JButton btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "-";
					
				}
			});
			btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnSub.setBounds(160, 150, 50, 50);
			frame.getContentPane().add(btnSub);
			
			//---------------------------------ROW 3---------------------------------------------------
			
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn4.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn4.setBounds(10, 200, 50, 50);
			frame.getContentPane().add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn5.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn5.setBounds(60, 200, 50, 50);
			frame.getContentPane().add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn6.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn6.setBounds(109, 200, 50, 50);
			frame.getContentPane().add(btn6);
			
			JButton btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "+";
					
				}
			});
			btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnPlus.setBounds(160, 200, 50, 50);
			frame.getContentPane().add(btnPlus);
			
			//-------------------Row 4-----------------------------------------------------------
			
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn1.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn1.setBounds(10, 250, 50, 50);
			frame.getContentPane().add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn2.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn2.setBounds(60, 250, 50, 50);
			frame.getContentPane().add(btn2);
			
			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn3.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn3.setBounds(109, 250, 50, 50);
			frame.getContentPane().add(btn3);
			
			JButton btnPer = new JButton("%");
			btnPer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					firstNum = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "%";
					
				}
			});
			btnPer.setFont(new Font("Tahoma", Font.BOLD, 10));
			btnPer.setBounds(160, 250, 50, 50);
			frame.getContentPane().add(btnPer);
			
			
			//--------------------------------ROW 5-----------------------------------------------
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String EnterNum = textField.getText() + btn0.getText();
					 textField.setText(EnterNum);
					
				}
			});
			btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
			btn0.setBounds(10, 300, 50, 50);
			frame.getContentPane().add(btn0);
			
			JButton btnDot = new JButton(".");
			btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnDot.setBounds(60, 300, 50, 50);
			frame.getContentPane().add(btnDot);
			
			JButton btnPM = new JButton("\u00B1");
			btnPM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double ops = Double.parseDouble(String.valueOf(textField.getText()));
					ops = ops *(-1);
					textField.setText(String.valueOf(ops));
					
				}
			});
			btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnPM.setBounds(109, 300, 50, 50);
			frame.getContentPane().add(btnPM);
			
			JButton btnEquals = new JButton("=");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String answer;
					secondNum = Double.parseDouble(textField.getText());
					
					if(operations == "+")
					{
						result = firstNum + secondNum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					else if (operations == "-")
					{
						result = firstNum - secondNum;
						answer = String.format("%.2f", result);
						textField.setText(answer);
					}
					else if(operations == "*")
					{
						result = firstNum * secondNum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					else if(operations == "/")
					{
						result = firstNum / secondNum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					else if(operations == "%")
					{
						result = firstNum % secondNum;
						answer = String.format("%.2f",result);
						textField.setText(answer);
					}
					
				}
			});
			btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnEquals.setBounds(160, 300, 50, 50);
			frame.getContentPane().add(btnEquals);
			
		}
	}






