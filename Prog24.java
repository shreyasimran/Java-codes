import java.io.Console;
class Prog24{
public static void main(String rg[])
{
boolean  b=true;int num=12;
while(b=!b)
{
System.out.println(b+"\t"+num);
b=!b;
num++;
}
System.out.println(b);
}
}