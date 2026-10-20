package beanimplementation;
import java.io.Serializable;

public class EmployeeBean implements Serializable {
private static final long serialVersionUID=1L;
private int employeeId;
private String name;
private String designation;
private double salary;

public EmployeeBean(){}

public int getEmployeeId(){return employeeId;}
public void setEmployeeId(int employeeId){this.employeeId=employeeId;}

public String getName(){return name;}
public void setName(String name){this.name=name;}

public String getDesignation(){return designation;}
public void setDesignation(String designation){this.designation=designation;}

public double getSalary(){return salary;}
public void setSalary(double salary){this.salary=salary;}

@Override
public String toString(){
return "EmployeeBean [employeeId="+employeeId+
",\n name="+name+
",\n designation="+designation+
",\n salary="+salary+"]";
}
}
