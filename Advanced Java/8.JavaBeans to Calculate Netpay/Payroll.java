package beanimplementation;
import java.util.Scanner;

public class Payroll {
public static void main(String[] args) {
Scanner ip=new Scanner(System.in);

System.out.println("Enter Employee ID :");
EmployeeBean employee=new EmployeeBean();
employee.setEmployeeId(ip.nextInt());
ip.nextLine();

System.out.println("Enter Employee Name:");
employee.setName(ip.nextLine());

System.out.println("Enter Employee Designation :");
employee.setDesignation(ip.nextLine());

System.out.println("Enter Employee Salary :");
employee.setSalary(ip.nextFloat());

PayrollBean payroll=new PayrollBean();
payroll.setPayrollId(1);
payroll.setEmployee(employee);
payroll.setDeductions(500.00);
payroll.setBonuses(200.00);
payroll.calculateNetPay();

System.out.println("Employee Details:");
System.out.println(employee);
System.out.println("Payroll Details:");
System.out.println(payroll);
}
}
