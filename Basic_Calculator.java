import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;



//START
/*
 * Basic Calculator Using Java
 * @Andrea Ella Remoreras
 * CS26L - TASK PERFORMANCE
 * 
 **/
@SuppressWarnings("serial")
class Basic_Calculator extends JFrame implements ActionListener{
	
	private JLabel lblCalculator;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnzero, btn0,btnPeriod,btnMultiply,btnDivide,btnPlus,btnMinus,btnClear,btnEquals,btnPercent,btnDelete;
	private JTextField txtNumber;
	
	Basic_Calculator(){
		
		
		Container pane = getContentPane();
		pane.setLayout(null);
		
		lblCalculator=new JLabel("BASIC");
		lblCalculator.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCalculator.setForeground(Color.WHITE);
		
		txtNumber=new JTextField("");
		txtNumber.setFont(new Font("Dialog", Font.BOLD, 15));
		
		txtNumber.addKeyListener(new KeyAdapter() {
	            public void keyTyped(KeyEvent e) {
	                char caracter = e.getKeyChar();
	                if (((caracter < '0') || (caracter > '9'||(caracter == '.')
	                        && (caracter != '\b')))) {
	                    e.consume();
	    }
	    }           
		});
		btn1=new JButton("1");
		btn1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn1.setBackground(new Color(96,96,96));
		btn1.setForeground(Color.WHITE);
		
		btn2=new JButton("2");
		btn2.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn2.setBackground(new Color(96,96,96));
		btn2.setForeground(Color.WHITE);
		
		btn3=new JButton("3");
		btn3.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn3.setBackground(new Color(96,96,96));
		btn3.setForeground(Color.WHITE);
		
		btn4=new JButton("4");
		btn4.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn4.setBackground(new Color(96,96,96));
		btn4.setForeground(Color.WHITE);
		
		btn5=new JButton("5");
		btn5.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn5.setBackground(new Color(96,96,96));
		btn5.setForeground(Color.WHITE);
		
		btn6=new JButton("6");
		btn6.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn6.setBackground(new Color(96,96,96));
		btn6.setForeground(Color.WHITE);
		
		btn7=new JButton("7");
		btn7.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn7.setBackground(new Color(96,96,96));
		btn7.setForeground(Color.WHITE);
		
		
		btn8=new JButton("8");
		btn8.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn8.setBackground(new Color(96,96,96));
		btn8.setForeground(Color.WHITE);
		
		btn9=new JButton("9");
		btn9.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn9.setBackground(new Color(96,96,96));
		btn9.setForeground(Color.WHITE);
		
		btn0=new JButton("0");
		btn0.setFont(new Font("Dialog", Font.PLAIN, 20));
		btn0.setBackground(new Color(96,96,96));
		btn0.setForeground(Color.WHITE);
					
		btnzero=new JButton("00");
		btnzero.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnzero.setBackground(new Color(96,96,96));
		btnzero.setForeground(Color.WHITE);
		
		btnPeriod=new JButton(".");
		btnPeriod.setFont(new Font("Dialog", Font.BOLD, 20));
		btnPeriod.setBackground(new Color(96,96,96));
		btnPeriod.setForeground(Color.WHITE);
		
		btnClear=new JButton("C");
		btnClear.setFont(new Font("Dialog", Font.BOLD, 20));
		btnClear.setBackground(new Color(255,128,0));
		btnClear.setForeground(Color.WHITE);
		
		btnPercent=new JButton("%");
		btnPercent.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnPercent.setBackground(new Color(96,96,96));
		btnPercent.setForeground(Color.WHITE);
		
		btnDelete=new JButton("Del");
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 15));
		btnDelete.setBackground(new Color(255,128,0));
		btnDelete.setForeground(Color.WHITE);
		
		btnDivide=new JButton("÷");
		btnDivide.setBackground(new Color(0,204,204));
		btnDivide.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDivide.setForeground(Color.WHITE);
		
		btnMultiply=new JButton("x");
		btnMultiply.setBackground(new Color(0,204,204));
		btnMultiply.setFont(new Font("Dialog", Font.BOLD, 20));
		btnMultiply.setForeground(Color.WHITE);
		
		btnMinus=new JButton("-");
		btnMinus.setBackground(new Color(0,204,204));
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 20));
		btnMinus.setForeground(Color.WHITE);
		
		btnPlus=new JButton("+");
		btnPlus.setBackground(new Color(0,204,204));
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 20));
		btnPlus.setForeground(Color.WHITE);
		
		btnEquals=new JButton("=");
		btnEquals.setBackground(new Color(0,204,204));
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 20));
		btnEquals.setForeground(Color.WHITE);
		
		pane.setBackground(Color.BLACK);
		pane.add(txtNumber).setBounds(30,40,290,40);
		pane.add(lblCalculator).setBounds(145,10,100,20);
		pane.add(btnClear).setBounds(30,90,60,60);
		pane.add(btnPercent).setBounds(100,90,60,60);
		pane.add(btnDelete).setBounds(170,90,60,60);
		pane.add(btnDivide).setBounds(250,90,70,60);
		pane.add(btn7).setBounds(30,160,60,60);
		pane.add(btn8).setBounds(100, 160,60,60);
		pane.add(btn9).setBounds(170,160,60,60);
		pane.add(btnMultiply).setBounds(250,160,70,60);
		pane.add(btn4).setBounds(30,230,60,60);
		pane.add(btn5).setBounds(100,230,60,60);
		pane.add(btn6).setBounds(170,230,60,60);
		pane.add(btnMinus).setBounds(250,230,70,60);
		pane.add(btn1).setBounds(30,300,60,60);
		pane.add(btn2).setBounds(100,300,60,60);
		pane.add(btn3).setBounds(170,300,60,60);
		pane.add(btnPlus).setBounds(250,300,70,60);
		pane.add(btnzero).setBounds(30,370,60,60);
		pane.add(btn0).setBounds(100,370,60,60);
		pane.add(btnPeriod).setBounds(170,370,60,60);
		pane.add(btnEquals).setBounds(250,370,70,60);
		
		
		setTitle("Basic Calculator");
		setSize(370,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		btnPeriod.addActionListener(this);
		btnClear.addActionListener(this);
		btnPercent.addActionListener(this);
		btnDelete.addActionListener(this);
		btnDivide.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnMultiply.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btnMinus.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnPlus.addActionListener(this);
		btnzero.addActionListener(this);
		btn0.addActionListener(this);
		btnEquals.addActionListener(this);
		
	
	}
	public static void main(String[]args){
		try{
		new Basic_Calculator();
		
	}catch(Exception e){
		JOptionPane.showMessageDialog(null, e);
	}
	}
	@Override
	public void actionPerformed(ActionEvent e) {//BUTTON FUNCTIONS
		if(e.getSource().equals(btnClear)){
			
			txtNumber.setText("");
			}
		else if(e.getSource().equals(btnPercent)){
			
			txtNumber.setText(txtNumber.getText()+"%");
			}
		else if(e.getSource().equals(btnDelete)){
			try{
				String s = txtNumber.getText().toString();
				s = s.substring(0, s.length() - 1);
				txtNumber.setText(s);
			}catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Input box is empty");
		}
		
		}
		else if(e.getSource().equals(btnDivide)){
			txtNumber.setText(txtNumber.getText()+"/");
		}
		
		else if(e.getSource().equals(btnMultiply)){
			txtNumber.setText(txtNumber.getText()+"*");
		}
		
		else if(e.getSource().equals(btnMinus)){
			txtNumber.setText(txtNumber.getText()+"-");
		}
		else if(e.getSource().equals(btnPlus)){
			txtNumber.setText(txtNumber.getText()+"+");
		}	
		else if(e.getSource().equals(btnEquals)){
			try{
				Calculate();
			}catch(Exception e2){
				JOptionPane.showMessageDialog(null, e2);
		}
			
		}
		else if(e.getSource().equals(btnPeriod)){
			txtNumber.setText(txtNumber.getText()+".");
				
		}
			
		else if(e.getSource().equals(btn1)){
			txtNumber.setText(txtNumber.getText()+"1");
		}
		else if(e.getSource().equals(btn2)){
			txtNumber.setText(txtNumber.getText()+"2");
		}
		else if(e.getSource().equals(btn3)){
			txtNumber.setText(txtNumber.getText()+"3");

		}
		else if(e.getSource().equals(btn4)){
			txtNumber.setText(txtNumber.getText()+"4");

		}	
		else if(e.getSource().equals(btn5)){
			txtNumber.setText(txtNumber.getText()+"5");

		}
		else if(e.getSource().equals(btn6)){
			txtNumber.setText(txtNumber.getText()+"6");

		}
		
		else if(e.getSource().equals(btn7)){
			txtNumber.setText(txtNumber.getText()+"7");

		}
		else if(e.getSource().equals(btn8)){		
			txtNumber.setText(txtNumber.getText()+"8");

		}
		else if(e.getSource().equals(btn9)){
			txtNumber.setText(txtNumber.getText()+"9");
		}
		else if(e.getSource().equals(btn0)){
			txtNumber.setText(txtNumber.getText()+"0");
		
		}
		else if(e.getSource().equals(btnzero)){
			txtNumber.setText(txtNumber.getText()+"00");
		}
		}
	
		public void Calculate()//FOR THE EQUAL BUTTON FUNCTION 
		    {
		        double output = 0;

		        //converting string into expression
		        try
		        {
		            ScriptEngineManager mgr = new ScriptEngineManager();
		            ScriptEngine engine = mgr.getEngineByName("JavaScript");
		            txtNumber.setText(engine.eval(txtNumber.getText()).toString());
		        }
		        catch(ScriptException e)
		        {
		            txtNumber.setText("Syntax error");
		        }
		      
		    }
			}
		




























