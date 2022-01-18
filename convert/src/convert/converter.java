package convert;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;


import java.awt.event.*;
import java.util.InputMismatchException;

import javax.swing.*;
public class converter  {
	
	
	public static void main(String[] args) {
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.cyan);
		p1.setBounds(0,0, 700, 200);
	
		JPanel p2 = new JPanel();
		p2.setBackground(Color.cyan);
		p2.setBounds(370, 200, 315, 170);
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.cyan);
		p3.setBounds(200,0,230,150);
		p3.setLayout(new GridLayout(6,2));
		
		
		JPanel p4 = new JPanel();
		p4.setBackground(Color.cyan);
		p4.setBounds(370, 370, 325, 42);
		BorderLayout bl = new BorderLayout();
		p4.setLayout(bl);
		   
		JLabel label = new JLabel();
		label.setText("Input:");
		label.setForeground(new Color(0, 0, 128));
		
		JTextField textfield = new JTextField();
		textfield.setPreferredSize(new Dimension(100,30));
		
		JTextArea textarea = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textarea);
		textarea.setBounds(0,200,370,210);
		scrollPane.setBounds(0,200,370,220);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JRadioButton miles = new JRadioButton("in Miles");
		miles.setBackground(Color.cyan);
		JRadioButton kilometers = new JRadioButton("in Kilometers");
		kilometers.setBackground(Color.cyan);
		JRadioButton gallons = new JRadioButton("in Gallons");
		gallons.setBackground(Color.cyan);
		JRadioButton liters = new JRadioButton("in Liters");
		liters.setBackground(Color.cyan);
		JRadioButton pounds = new JRadioButton("in Pounds");
		pounds.setBackground(Color.cyan);
		JRadioButton kilograms = new JRadioButton("in Kilograms");
		kilograms.setBackground(Color.cyan);
		JRadioButton mph = new JRadioButton("in MPH");
		mph.setBackground(Color.cyan);
		JRadioButton knots = new JRadioButton("in Knots");
		knots.setBackground(Color.cyan);
		JRadioButton inches = new JRadioButton("in Inches");
		inches.setBackground(Color.cyan);
		JRadioButton centimeters = new JRadioButton("in Centimeters");
		centimeters.setBackground(Color.cyan);
		
	    ButtonGroup group = new ButtonGroup();
	    group.add(miles);
	    group.add(kilometers);
	    group.add(gallons);
	    group.add(liters);
	    group.add(pounds);
	    group.add(kilograms);
	    group.add(mph);
	    group.add(knots);
	    group.add(inches);
	    group.add(centimeters);
	    
	   
	    
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "1");
			}
			});
		
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "2");
			}
			});
	
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "3");
			}
			});
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "4");
			}
			});
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "5");
			}
			});
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "6");
			}
			});
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "7");
			}
			});
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "8");
			}
			});
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "9");
			}
			});
		JButton b0 = new JButton("C");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText("");
			}
			});
		JButton b10 = new JButton("0");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ "0");
			}
			});
		JButton b11 = new JButton(".");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String a = textfield.getText();
				textfield.setText(a+ ".");
			}
			});
		
		
		JButton b12 = new JButton("Convert!");
		p4.add(b12, BorderLayout.CENTER);
		
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					double check = Double.parseDouble(textfield.getText());
					
				if(miles.isSelected()==true) {
					double miles = Double.parseDouble(textfield.getText());
					double a = miles*1.609344;
					textarea.append( miles +" miles equals " + a +" kilometers\n");
				}
				else if(kilometers.isSelected()==true) {
					double kilometers = Double.parseDouble(textfield.getText());
					double b = kilometers * 0.621371192;
					textarea.append( kilometers +" kilometers equals " + b +" miles\n");
				}
				else if(gallons.isSelected()==true) {
					double gallons = Double.parseDouble(textfield.getText());
					double c = gallons*3.7854 ;
					textarea.append(gallons + " gallon equals " + c + " liters\n");
				}
				else if(liters.isSelected()==true) {
					double liters = Double.parseDouble(textfield.getText());
					double d = liters*0.264172052358148;
					textarea.append(liters + " liters equals " + d + " gallons\n");
				}
				else if(pounds.isSelected()==true) {
					double pounds = Double.parseDouble(textfield.getText());
					double e = pounds* 0.45 ;
					textarea.append(pounds + " pounds equals " + e + " kilograms\n");
				}
				else if(kilograms.isSelected()==true) {
					double kilograms = Double.parseDouble(textfield.getText());
					double f = kilograms* 2.20462262;
					textarea.append(kilograms + " kilograms equals " + f + " pounds\n");
					
				}
				else if(mph.isSelected()==true) {
					double mph = Double.parseDouble(textfield.getText());
					double g = mph*0.87;
					textarea.append(mph + " MPH equals " + g + " knots\n");
					
				}
				
				else if(knots.isSelected()==true) {
					double knots = Double.parseDouble(textfield.getText());
					double h = knots*1.15077945;
					textarea.append(knots + " knots equals " + h + " MPH\n");
					
				}
				
				else if (inches.isSelected()==true) {
					double inches = Double.parseDouble(textfield.getText());
					double i = inches*2.54;
					textarea.append(inches + " inches equals" + i + " centimeters\n");
				}
				else if(centimeters.isSelected()==true) {
					double centimeters = Double.parseDouble(textfield.getText());
					double k = centimeters*0.393700787;
					textarea.append(centimeters + " centimeters equals " + k + " inches\n");
				}
				} catch(InputMismatchException hata) {
					textarea.append("invalid input\n");
				}
				catch (NumberFormatException hata2){
					textarea.append("invalid input\n");
				}
			}
			});
		
		 b0.setMnemonic(KeyEvent.VK_0);
		 b1.setMnemonic(KeyEvent.VK_1);
		 b2.setMnemonic(KeyEvent.VK_2);
		 b3.setMnemonic(KeyEvent.VK_3);
		 b4.setMnemonic(KeyEvent.VK_4);
		 b5.setMnemonic(KeyEvent.VK_5);
		 b6.setMnemonic(KeyEvent.VK_6);
		 b7.setMnemonic(KeyEvent.VK_7);
		 b8.setMnemonic(KeyEvent.VK_8);
		 b9.setMnemonic(KeyEvent.VK_9);
		 b10.setMnemonic(KeyEvent.VK_0);
		 b11.setMnemonic(KeyEvent.VK_N);
		 b12.setMnemonic(KeyEvent.VK_H);
		
		JFrame frame = new JFrame();
		frame.setSize(700,450);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane();
		frame.setVisible(true);
		frame.add(p1);
		frame.add(p2);
		p1.add(p3);
		frame.add(scrollPane);
		frame.add(p4);
		
	  
		p3.add(label);
		p3.add(textfield);
		p3.add(miles);
		p3.add(kilometers);
		p3.add(gallons);
		p3.add(liters);
		p3.add(pounds);
		p3.add(kilograms);
		p3.add(mph);
		p3.add(knots);
		p3.add(inches);
		p3.add(centimeters);
		
	
	
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b0);
		p2.add(b10);
		p2.add(b11);
		p2.setLayout(new GridLayout(4,3,2,2));
		p4.add(b12);
	
	}
		
	}

