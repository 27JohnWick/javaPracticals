import java.util.*;
import java.awt.*;
import java.awt.event.*;


class MyCalculator extends Frame implements ActionListener
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bmod,bequal;
    TextField t1;
    MyCalculator()
    {
        t1=new TextField();
        t1.setBounds(50,100,400,50);
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
		b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
		b9=new Button("9");
        b0=new Button("0");
        badd=new Button("+");
        bsub=new Button("-");
		bmul=new Button("*");
        bdiv=new Button("/");
        bmod=new Button("%");
		bequal=new Button("=");
		b1.setBounds(50,175,60,35);
        b2.setBounds(125,175,60,35);
        b3.setBounds(200,175,60,35);
		b4.setBounds(275,175,60,35);
		b5.setBounds(350,175,60,35);
        b6.setBounds(50,225,60,35);
        b7.setBounds(125,225,60,35);
		b8.setBounds(200,225,60,35);
		b9.setBounds(275,225,60,35);
        b0.setBounds(350,225,60,35);
        badd.setBounds(50,275,60,35);
		bsub.setBounds(125,275,60,35);
		bmul.setBounds(200,275,60,35);
        bdiv.setBounds(275,275,60,35);
        bmod.setBounds(350,275,60,35);
		bequal.setBounds(50,325,400,40);
        setSize(500,500);
		add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
		add(b0);
        add(badd);
		add(bsub);
        add(bmul);
        add(bdiv);
        add(bmod);
		add(bequal);
        b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bmod.addActionListener(this);
		setLayout(null);
		setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
		String zt,z;
		if(e.getSource()==b1){
			zt=t1.getText();
			z=zt+"1";
			t1.setText(z);
		}
		if(e.getSource()==b2){
			zt=t1.getText();
			z=zt+"2";
			t1.setText(z);
		}
		if(e.getSource()==b3){
			zt=t1.getText();
			z=zt+"3";
			t1.setText(z);
		}
		if(e.getSource()==b4){
			zt=t1.getText();
			z=zt+"4";
			t1.setText(z);
		}
		if(e.getSource()==b5){
			zt=t1.getText();
			z=zt+"5";
			t1.setText(z);
		}
		if(e.getSource()==b6){
			zt=t1.getText();
			z=zt+"6";
			t1.setText(z);
		}
		if(e.getSource()==b7){
			zt=t1.getText();
			z=zt+"7";
			t1.setText(z);
		}
		if(e.getSource()==b8){
			zt=t1.getText();
			z=zt+"8";
			t1.setText(z);
		}
		if(e.getSource()==b9){
			zt=t1.getText();
			z=zt+"9";
			t1.setText(z);
		}
		if(e.getSource()==b0){
			zt=t1.getText();
			z=zt+"0";
			t1.setText(z);
		}
		if(e.getSource()==badd){                     
			try
			{
				num1=Integer.parseInt(t1.getText());
			}
			catch(NumberFormatException f)
			{
					t1.setText("Invalid Format");
					return;
			}
		z="";
		t1.setText(z);
		check=1;
		}
		if(e.getSource()==bsub){                     
			try
			{
				num1=Integer.parseInt(t1.getText());
			}
			catch(NumberFormatException f)
			{
					t1.setText("Invalid Format");
					return;
			}
		z="";
		t1.setText(z);
		check=2;
		}
		if(e.getSource()==bmul){                     
			try
			{
				num1=Integer.parseInt(t1.getText());
			}
			catch(NumberFormatException f)
			{
					t1.setText("Invalid Format");
					return;
			}
		z="";
		t1.setText(z);
		check=3;
		}
		if(e.getSource()==bdiv){                     
			try
			{
				num1=Integer.parseInt(t1.getText());
			}
			catch(NumberFormatException f)
			{
					t1.setText("Invalid Format");
					return;
			}
		z="";
		t1.setText(z);
		check=4;
		}
		if(e.getSource()==bmod){                     
			try
			{
				num1=Integer.parseInt(t1.getText());
			}
			catch(NumberFormatException f)
			{
					t1.setText("Invalid Format");
					return;
			}
		z="";
		t1.setText(z);
		check=5;
		}
		if(e.getSource()==bcalc){          
			try
			{
				num2=Integer.parseInteger(l1.getText());
			}
			catch(Exception f)
			{
				l1.setText("ENTER NUMBER FIRST ");
				return;
			}
    }
	if(check==1)
		xd =num1+num2;
	if(check==2)
		xd =num1-num2;
	if(check==3)
		xd =num1*num2;
	if(check==4)
		xd =num1/num2; 
	if(check==5)
		xd =num1%num2;    
  t1.setText(String.valueOf(xd));
}
    }
	public static void main(String args[])
	{
		new MyCalculator();
	}
}