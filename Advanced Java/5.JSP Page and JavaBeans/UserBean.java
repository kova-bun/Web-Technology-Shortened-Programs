package UserBean;
import java.io.Serializable;

public class UserBean implements Serializable {
private String name;
private double basicPay,da,hra;

public UserBean() {}

public String getName(){return name;}
public void setName(String name){this.name=name;}

public double getBasicPay(){return basicPay;}
public void setBasicPay(double basicPay){this.basicPay=basicPay;}

public double getDa(){return da;}
public void setDa(double da){this.da=da;}

public double getHra(){return hra;}
public void setHra(double hra){this.hra=hra;}

public double getGrossSalary(){
return basicPay+da+hra;
}
}