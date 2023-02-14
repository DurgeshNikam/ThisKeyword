public class student
{
int rollno;
String name;
public student(int rollno, String name)
{
this.rollno=rollno;
this.name=name;
System.out.println(this.rollno);
System.out.println(this.name);
}
public static void main(String[]args)
{
student s=new student(22,"ABC");
//System.out.println(s.rollno);
//System.out.println(s.name);
}
}