import java.io.*;
import java.lang.*;
import java.util.*;
class Employee
{
	String emp_name;
	int emp_id;
	int basicpay;
	String address;
	String mail_id;
	String mob_number;
	Employee(String emp_name,int emp_id,String address,String mail_id,String mob_number)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.address=address;
		this.mob_number=mob_number;
	}
	void display()
	{
		System.out.println("Employee Name:"+emp_name);
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Address:"+address);
		System.out.println("Mobile Number:"+mob_number);
	}
}
class Programmer extends Employee
{
	double basicpay,da,hra,pf,fund,netsalary,grosssalary;
	Programmer(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp)
	{
		super(emp_name,emp_id,address,mail_id,mob_number);
		basicpay = bp;
	}
	public void getPaySlip()
	{
		da=basicpay*97/100;
		hra=basicpay*10/100;
		pf=basicpay*12/100;
		fund=basicpay*0.1/100;
		grosssalary=basicpay+da+hra+pf+fund;
		netsalary = grosssalary-pf-fund;
	}
	void disp()
	{
		System.out.println("Name of the Employee:"+emp_name+"*****payslip*****");
		display();
		System.out.println("Grosssalary="+grosssalary);
		System.out.println("Netsalary="+netsalary);
	}
}
class AssistantProffessor extends Employee
{
	double basicpay,da,hra,pf,fund,netsalary,grosssalary;
	AssistantProffessor(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp)
	{
		super(emp_name,emp_id,address,mail_id,mob_number);
		basicpay = bp;
	}
	public void getPaySlip()
	{
		da=basicpay*97/100;
		hra=basicpay*10/100;
		pf=basicpay*12/100;
		fund=basicpay*0.1/100;
		grosssalary=basicpay+da+hra+pf+fund;
		netsalary = grosssalary-pf-fund;
	}
	void disp()
	{
		System.out.println("Name of the Employee:"+emp_name+"*****payslip*****");
		display();
		System.out.println("Grosssalary="+grosssalary);
		System.out.println("Netsalary="+netsalary);
	}
}
class AssociateProffessor extends Employee
{
	double basicpay,da,hra,pf,fund,netsalary,grosssalary;
	AssociateProffessor(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp)
	{
		super(emp_name,emp_id,address,mail_id,mob_number);
		basicpay = bp;
	}
	public void getPaySlip()
	{
		da=basicpay*97/100;
		hra=basicpay*10/100;
		pf=basicpay*12/100;
		fund=basicpay*0.1/100;
		grosssalary=basicpay+da+hra+pf+fund;
		netsalary = grosssalary-pf-fund;
	}
	void disp()
	{
		System.out.println("Name of the Employee:"+emp_name+"*****payslip*****");
		display();
		System.out.println("Grosssalary="+grosssalary);
		System.out.println("Netsalary="+netsalary);
	}
}
class Proffessor extends Employee
{
	double basicpay,da,hra,pf,fund,netsalary,grosssalary;
	Proffessor(String emp_name,int emp_id,String address,String mail_id,String mob_number,double bp)
	{
		super(emp_name,emp_id,address,mail_id,mob_number);
		basicpay = bp;
	}
	public void getPaySlip()
	{
		da=basicpay*97/100;
		hra=basicpay*10/100;
		pf=basicpay*12/100;
		fund=basicpay*0.1/100;
		grosssalary=basicpay+da+hra+pf+fund;
		netsalary = grosssalary-pf-fund;
	}
	void disp()
	{
		System.out.println("Name of the Employee:"+emp_name+"*****payslip*****");
		display();
		System.out.println("Grosssalary="+grosssalary);
		System.out.println("Netsalary="+netsalary);
	}
}
public class EmployeePayslip
{
	public static void main(String arg[])throws IOException
	{
	String name,add,mail,mob;
	int id,desg;
	double bp;
	DataInputStream in = new DataInputStream(System.in);
	System.out.println("Enter Name of Employee:");
	name=in.readLine();
	System.out.println("Enter ID of Employee:");
	id=Integer.valueOf(in.readLine());
	System.out.println("Enter Address of Employee:");
	add=in.readLine();
	System.out.println("Enter Mail ID of Employee:");
	mail=in.readLine();
	System.out.println("Enter Mobile Number of Employee:");
	mob=in.readLine();
	System.out.println("Enter the Basicpay:");
	bp=Double.valueOf(in.readLine());
	System.out.println("Enter Mobile the Designation:");
	System.out.println("1.Proggrammer\n2.AssistantProfessor\n3.AssociateProffessor\n4.Proffessor\n5.Exit");
	desg=Integer.valueOf(in.readLine());
	switch(desg)
	{
		case 1:Programmer p=new Programmer(name,id,add,mail,mob,bp);
		p.getPaySlip();
		p.disp();
		break;
		case 2:AssistantProffessor ap=new AssistantProffessor(name,id,add,mail,mob,bp);
		ap.getPaySlip();
		ap.disp();
		break;
		case 3:AssociateProffessor assp=new AssociateProffessor(name,id,add,mail,mob,bp);
		assp.getPaySlip();
		assp.disp();
		break;
		case 4:Proffessor pf=new Proffessor(name,id,add,mail,mob,bp);
		pf.getPaySlip();
		pf.disp();
		break;
		case 5:System.exit(0);
		default:System.out.println("Invalid Designation");
	}
	}
}