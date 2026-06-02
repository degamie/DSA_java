package OOPS.Polymorphism;

public class Employee {
    public   String empid;
    public  String empname;
    public   String empadress;
    public  String salary;
    public   String empexperience;
    public  String empdesgination;

    public Employee(String empid, String empname, String empadress, String salary, String empexperience, String empdesgination) {
        this.empid = empid;
        this.empname = empname;
        this.empadress = empadress;
        this.salary = salary;
        this.empexperience = empexperience;
        this.empdesgination = empdesgination;
    }

    public Employee() {
    }


    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpadress() {
        return empadress;
    }

    public void setEmpadress(String empadress) {
        this.empadress = empadress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmpexperience() {
        return empexperience;
    }

    public void setEmpexperience(String empexperience) {
        this.empexperience = empexperience;
    }

    public String getEmpdesgination(Employee emp) {
        return empdesgination;
    }

    public void setEmpdesgination(String empdesgination) {
        this.empdesgination = empdesgination;
    }





}
