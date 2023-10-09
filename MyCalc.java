import java.util.*;
import java.awt.*;
import java.awt.event.*;


class MyCalc extends Frame implements ActionListener
{
    Label l1,l2,l3;
    Button B1,B2,B3,B4;
    TextField t1,t2,t3;
    MyCalc()
    {
        l1=new Label("1number");
        l1.setBounds(50,100,100,30);
        l2=new Label("2number");
        l2.setBounds(50,150,100,30);
        l3=new Label("Result");
        l3.setBounds(50,200,100,30);
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        t1.setBounds(200,100,100,30);
        t2.setBounds(200,150,100,30);
        t3.setBounds(200,200,80,30);
        B1=new Button("+");
        B2=new Button("-");
        B3=new Button("*");
        B4=new Button("/");
		B1.setBounds(25,250,25,25);
        B2.setBounds(75,250,25,25);
        B3.setBounds(125,250,25,25);
		B4.setBounds(175,250,25,25);
        setSize(400,400);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(B1);
        add(B2);
        add(B3);
        add(B4);
        B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		setLayout(null);
		setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1,s2;
		s1=t1.getText();
		s2=t2.getText();
		int no1= Integer.parseInt(s1);
		int no2= Integer.parseInt(s2);
		if(e.getSource()==B1)
		{
			int res=no1+no2;
			String s=Integer.toString(res);
			t3.setText(s);
		}
		if(e.getSource()==B2)
		{
			int res=no1-no2;
			String s=Integer.toString(res);
			t3.setText(s);
		}
		if(e.getSource()==B3)
		{
			int res=no1*no2;
			String s=Integer.toString(res);
			t3.setText(s);
		}
		if(e.getSource()==B4)
		{
			int res=no1/no2;
			String s=Integer.toString(res);
			t3.setText(s);
		}
    }
	public static void main(String args[])
	{
		new MyCalc();
	}
}