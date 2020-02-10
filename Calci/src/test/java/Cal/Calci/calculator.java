package Cal.Calci;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="calculator" width=250 height=150>
</applet>
*/

@SuppressWarnings("serial")
public class calculator extends Applet implements ActionListener
{
	//Methods to implement calculator
	public int add(int a,int b)
	{
		return(a+b);
	}
	public int sub(int a,int b)
	{
		return(a-b);
	}
	public int mul(int a,int b)
	{
		return(a*b);
	}
	public int div(int a,int b)
	{
		return(a/b);
	}
	String msg="";
	TextField text1,text2;
	Button b1=new Button("Add");
	Button b2=new Button("Sub");
	Button b3=new Button("Mul");
	Button b4=new Button("Div");
	public void init()
	{
		text1=new TextField(12);
		text2=new TextField(12);
		/*b1.setBounds(50,150,50,50);
		b2.setBounds(100,150,50,50);
		b3.setBounds(150,150,50,50);
		b4.setBounds(200,150,50,50);*/
		add(text1);
		add(text2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("INPUT NUMBERS IN BOXES AND CLICK",10,75);
		g.drawString(msg,10,100);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x=0,y=0;
		String s1,s2;
		s1=text1.getText();
		x=Integer.parseInt(s1);
		s2=text2.getText();
		y=Integer.parseInt(s2);
		String str=ae.getActionCommand();
        if(str.equals("Add"))
		{
			msg="Sum of the two numbers is:"+String.valueOf(add(x,y));
			repaint();
		}
		if(str.equals("Sub"))
		{
			msg="Diff of the two numbers is:"+String.valueOf(sub(x,y));
			repaint();
		}
		if(str.equals("Mul"))
		{
			msg="Product of the two numbers is:"+String.valueOf(mul(x,y));
			repaint();
		}
		if(str.equals("Div"))
		{
			msg="Div of the two numbers is:"+String.valueOf(div(x,y));
			repaint();
		}
	}		
}