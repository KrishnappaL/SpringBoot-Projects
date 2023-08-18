class pac1 extends pac
{
int ssalary=299;
public static void main(String args[])
{
pac1 p=new pac1();
p.work();
System.out.println(p.ssalary);
}
void work()
{
System.out.println("working");
System.out.println(ssalary);
System.out.println(super.ssalary);
}
}
