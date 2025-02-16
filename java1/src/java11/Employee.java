package java11;

public class Employee  implements Comparable{
 String name;
 int salary;
 int age;

public Employee(String name,int age,int salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
}
public String toString() {
	return this.name + "-->" + this.age + "---"+this.salary;
	
}
@Override
public int compareTo(Object os) {
	return 0;
}

}
