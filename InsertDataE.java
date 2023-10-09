import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class InsertFrame extends JFrame implements ActionListener{
	
	Container c;
	JLabel label1, label2, label3, result;
	JTextField roll, name, cgpa;
	JButton addBtn, displayBtn;
	
	InsertFrame(){
		setTitle("Add Student Form");
		setSize(300, 300);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c = getContentPane();
		c.setLayout(null);
		
		displayBtn= new JButton("Display All");
		displayBtn.setBounds(200, 10, 100, 20);

		label1=new JLabel("Roll");
		label1.setBounds(10,20, 100,20);
		roll = new JTextField();
		roll.setBounds(10, 40, 200, 20);
		
		label2=new JLabel("Name");
		label2.setBounds(10,70, 100,20);
		name = new JTextField();
		name.setBounds(10,90,200,20);
		
		label3=new JLabel("CGPA");
		label3.setBounds(10,120, 100,20);
		cgpa = new JTextField();
		cgpa.setBounds(10,140,200,20);
		
		addBtn = new JButton("ADD");
		addBtn.setBounds(10, 180, 80, 20);
		
		result=new JLabel();
		result.setBounds(10, 200, 200,20);
		
		displayBtn.addActionListener(this);
		addBtn.addActionListener(this);
		
		c.add(displayBtn);
		c.add(label1);
		c.add(roll);
		c.add(label2);
		c.add(name);
		c.add(label3);
		c.add(cgpa);
		c.add(addBtn);
		c.add(result);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==displayBtn) {
			this.dispose();
			DisplayFrame display = new DisplayFrame();
		}
		
		if(e.getSource()==addBtn) {
			int r = Integer.parseInt(roll.getText());
			String n = name.getText();
			double c = Double.parseDouble(cgpa.getText());
			/*System.out.println("Roll: "+r);
			System.out.println("Name: "+n);
			System.out.println("CGPA: "+c);*/
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sit123");
				String sql = "INSERT INTO student_data VALUES("+r+",'"+n+"',"+c+")";
				Statement smt = con.createStatement();
				int i = smt.executeUpdate(sql);
				if(i>0){
					System.out.println("One Record Inserted");
					roll.setText("");
					name.setText("");
					cgpa.setText("");
					result.setText("One Record Inserted");
				} else {
					System.out.println("DB Error");
					result.setText("DB Error");
				}
				smt.close();
				con.close();
			}catch(Exception ee){
				ee.printStackTrace();
			}
		}
	}
}
class InsertDataE{
	public static void main(String args[]){
		InsertFrame frame = new InsertFrame();
	}
}
