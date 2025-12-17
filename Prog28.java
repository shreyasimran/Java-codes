import java.io.Console;
class  Bookrecord{
int book_no;
String book_name;
String publisher_name;
floating price;
void accept()
{
Console c=System.console();
book_no=Integer.parseInt(c.readLine("Enter the book no:"));
book-name=c.readLine("Enter the book name:");
publisher_name=c.readLine("Enter the publisher name:");
price=Float.parseFloat(c.readLine("Enter the price of book:"));

void display()
{
System.outprintln("book_no"\t"+book_name+"\t"+publisher_name+"\t"+price);
}
public static void main(String rg[])
{
Console c=System.console();
int cnt=Integer.parseInt(c.readLine("How many book records you have to entered:"));
Bookrecord ob[]=new Bookrecord[cnt];
if(cnt>5)
{
for(int i=0;i<cnt;i++){
ob[i]=new Bookrecord ();
ob[i].accept();
}
else{
for(int=0;i<5;i++)
ob[i]=new bookrecord90;
ob[i].accept();
}
}
system.out.println("The record of book whose price is more than 150");
if(cnt>5)
{
for(int i=0;i<cnt;i++)
{
if(ob[i].price>150)
{
ob[i].display();
}
if(cnt<5)
{
for(int i=0;i<5;i++){
if(ob[i].price>150)
{
ob[i].display();}
}
}
}