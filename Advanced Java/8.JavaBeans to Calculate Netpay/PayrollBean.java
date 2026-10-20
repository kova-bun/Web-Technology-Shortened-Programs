package beanimplementation;
import java.io.Serializable;

public class PayrollBean implements Serializable {
private static final long serialVersionUID=1L;
private int payrollId;
private EmployeeBean employee;
private double deductions;
private double bonuses;
private double netPay;

public PayrollBean(){}

public int getPayrollId(){return payrollId;}
public void setPayrollId(int payrollId){this.payrollId=payrollId;}

public EmployeeBean getEmployee(){return employee;}
public void setEmployee(EmployeeBean employee){this.employee=employee;}

public double getDeductions(){return deductions;}
public void setDeductions(double deductions){this.deductions=deductions;}

public double getBonuses(){return bonuses;}
public void setBonuses(double bonuses){this.bonuses=bonuses;}

public void calculateNetPay(){
this.netPay=employee.getSalary()+bonuses-deductions;
}

public double getNetPay(){return netPay;}

@Override
public String toString(){
return "PayrollBean [payrollId="+payrollId+
",\n employee="+employee+
",\n deductions="+deductions+
",\n bonuses="+bonuses+
",\n netPay="+netPay+"]";
}
}
