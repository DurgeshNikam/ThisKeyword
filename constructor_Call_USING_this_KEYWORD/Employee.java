package constructor_Call_USING_this_KEYWORD;

public class Employee {
	int eid;
	String ename;
	String edept;
	long eno;
	public Employee(int eid, String ename, String edept, long eno)
	{
	this.eid = eid;
	this.ename = ename;
	this.edept = edept;
	this.eno = eno;
	}
	public static void main(String[] args) {
		Employee e = new Employee(123, "ram", "Sales",982345385);
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(e.edept);
		System.out.println(e.eno);
	}
}
