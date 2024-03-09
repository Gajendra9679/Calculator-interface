import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame 
{
public Calculator()
{
setVisible(true);
setBackground(Color.gray);
setLayout(null);

TextField tf=new TextField();
add(tf);

Button btn=new Button("ON/OFF");
Button btn1=new Button(".");
Button btn2=new Button("7");
Button btn3=new Button("4");
Button btn4=new Button("1");
Button btn5=new Button("0");
Button btn6=new Button("( )");
Button btn7=new Button("8");
Button btn8=new Button("5");
Button btn9=new Button("2");
Button btn10=new Button("00");
Button btn11=new Button("%");
Button btn12=new Button("9");
Button btn13=new Button("6");
Button btn14=new Button("3");
Button btn15=new Button("Del");
Button btn16=new Button("/");
Button btn17=new Button("*");
Button btn18=new Button("-");
Button btn19=new Button("+");
Button btn20=new Button("=");

add(btn);
add(btn1);
add(btn2);
add(btn3);
add(btn4);
add(btn5);
add(btn6);
add(btn7);
add(btn8);
add(btn9);
add(btn10);
add(btn11);
add(btn12);
add(btn13);
add(btn14);
add(btn15);
add(btn16);
add(btn17);
add(btn18);
add(btn19);
add(btn20);

btn.setBackground(Color.red);
btn1.setBackground(Color.yellow);
btn2.setBackground(Color.yellow);
btn3.setBackground(Color.yellow);
btn4.setBackground(Color.yellow);
btn5.setBackground(Color.yellow);
btn6.setBackground(Color.yellow);
btn7.setBackground(Color.yellow);
btn8.setBackground(Color.yellow);
btn9.setBackground(Color.yellow);
btn10.setBackground(Color.yellow);
btn11.setBackground(Color.yellow);
btn12.setBackground(Color.yellow);
btn13.setBackground(Color.yellow);
btn14.setBackground(Color.yellow);
btn15.setBackground(Color.yellow);
btn16.setBackground(Color.yellow);
btn17.setBackground(Color.yellow);
btn18.setBackground(Color.yellow);
btn19.setBackground(Color.yellow);
btn20.setBackground(Color.yellow);

Font f1=new Font("Arial",Font.BOLD,26);
Font f2 =new Font("Arial",Font.BOLD,34);
tf.setFont(f2);
btn.setFont(f1);
btn1.setFont(f1);
btn2.setFont(f1);
btn3.setFont(f1);
btn4.setFont(f1);
btn5.setFont(f1);
btn6.setFont(f1);
btn7.setFont(f1);
btn8.setFont(f1);
btn9.setFont(f1);
btn10.setFont(f1);
btn11.setFont(f1);
btn12.setFont(f1);
btn13.setFont(f1);
btn14.setFont(f1);
btn15.setFont(f1);
btn16.setFont(f1);
btn17.setFont(f1);
btn18.setFont(f1);
btn19.setFont(f1);
btn20.setFont(f1);

tf.setBounds(100,100,370,100);
btn.setBounds(360,225,110,50);
btn1.setBounds(100,300,70,70);
btn2.setBounds(100,400,70,70);
btn3.setBounds(100,500,70,70);
btn4.setBounds(100,600,70,70);
btn5.setBounds(100,700,70,70);
btn6.setBounds(200,300,70,70);
btn7.setBounds(200,400,70,70);
btn8.setBounds(200,500,70,70);
btn9.setBounds(200,600,70,70);
btn10.setBounds(200,700,70,70);
btn11.setBounds(300,300,70,70);
btn12.setBounds(300,400,70,70);
btn13.setBounds(300,500,70,70);
btn14.setBounds(300,600,70,70);
btn15.setBounds(300,700,70,70);
btn16.setBounds(400,300,70,70);
btn17.setBounds(400,400,70,70);
btn18.setBounds(400,500,70,70);
btn19.setBounds(400,600,70,70);
btn20.setBounds(400,700,70,70);

}

public static void main(String args[])
{
Calculator ca=new Calculator();
ca.setVisible(true);
}
}