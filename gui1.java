import java.awt.*;
import java.awt.event.*;
class X extends Frame implements ActionListener{
Button b1;
TextField tf1,tf2;
Label l1,l2;
X(){
setFont(new Font("Arial",Font.PLAIN,14));
l1=new Label("String: ");
l2=new Label("RESULT: ");
b1=new Button("REVERSE");
tf1=new TextField();
tf2=new TextField(" ");
l1.setBounds(100,200,60,50);
tf1.setBounds(180,200,200,50);
b1.setBounds(180,270,100,50);
l2.setBounds(100,340,60,50);
tf2.setBounds(180,340,200,50);
add(l1);
add(tf1);
add(b1);
add(l2);
add(tf2);
b1.addActionListener(this);
setLayout(null);
setSize(500,800);
setVisible(true);
}

public void actionPerformed(ActionEvent e){
String s1=tf1.getText();
char ch;
String r=" ";

if(e.getSource()==b1){
for(int i=s1.length()-1;i>=0;i--)
{
ch=s1.charAt(i);
r=r+ch;
tf2.setText(r);
}
}
}
public static void main(String ar[]){
X f1=new X();
f1.setTitle("My Frame1");
}
}