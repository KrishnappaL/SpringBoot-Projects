package p3;
class armstronnumber
{
public static void main(String[] args)
{
int no=1634;
armstronnumber an=new armstronnumber();
int count=an.find_count(no);
int result=an.find_each_digit(no,count);
if(result ==no)
{
System.out.println("armstrong number");
}
else
System.out.println("not armstrong number");
}
int find_count(int no)
{
int count=0;
while(no>0)
{
no=no/10;
count=count+1;
}
return count;
}
public int find_each_digit(int no,int count){
int total=0;
while(no>0)
{
int rem=no%10;
int each_digit_result=find_power(rem,count);
total=total+each_digit_result;
no=no/10;
}
return total;
}
public int find_power(int base,int power)
{
int result=1;
while(power>0)
{
result=result*base;
power=power-1;

}
return result;
}
}