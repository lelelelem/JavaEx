import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Chapter15Class implements ActionListener, ItemListener, ListSelectionListener {

	JLabel label;
	JTextField jtf;
	JCheckBox jtb1;
	JCheckBox jtb2;
	JCheckBox jtb3;
	
	JScrollPane jsp;
	
	JList jl;
	
	String names[] = {"Lemuel","Lem","Leu"};
	
	Chapter15Class(){
		
		JFrame jf = new JFrame("Sample");
		
		jf.setSize(400, 400);
		jf.setLayout(new FlowLayout());
		
		jtf = new JTextField(10);
		jtf.setActionCommand("Name");
		
		JButton jb = new JButton("Circle");
		JButton jb2 = new JButton("Square");
		
		jl = new JList(names);
		jsp = new JScrollPane(jl);
		
		jtb1 = new JCheckBox("Red");
		jtb2 = new JCheckBox("Green");
		jtb3 = new JCheckBox("Yellow");
		
		jtb1.addItemListener(this);
		jtb2.addItemListener(this);
		jtb3.addItemListener(this);
		
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jl.addListSelectionListener(this);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label = new JLabel("Well this is something");
		
		jf.add(jsp);
		jf.add(jtf);
		jf.add(jtb1);
		jf.add(jtb2);
		jf.add(jtb3);
		jf.add(jb);
		jf.add(jb2);
		
		jf.add(label);
		
		jf.setVisible(true);
		
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getActionCommand().equals("Circle"))
			label.setText("Hello "+jtf.getText());
		else
			label.setText("Its a Square");
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
		if (jtb1.isSelected())
		label.setText(jtb1.getText()+" was Selected");
		
		}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		
		
		String str = jl.getSelectedIndex() != -1? names[jl.getSelectedIndex()]:"None Selected";
		
		label.setText(str);
		
	}
	
	
}
