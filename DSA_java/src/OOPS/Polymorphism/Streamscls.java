//WID(2/6/2026)(Sarthak Mittal)(DegamieSign)
package OOPS.Polymorphism;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamscls extends Employee{
    public  static void main(String[] args){
        Employee emp=new Employee();int cnt=0;
        List<Employee> e= Arrays.asList(
                new Employee("1","Sarthak","123","425000","2.4","java Developer"),
                new Employee("2","ABC","456","8910234","1.9","Python Developer"),
                new Employee("3","DEF","78","9045657",".1","Game Developer")
        );
        Map<String,Long>deptcnt=e.stream().collect(Collectors.groupingBy(employee -> employee.getEmpdesgination(emp),Collectors.counting()));
        System.out.println(deptcnt);
//        deptcnt.forEach(deptcnt.forEach(emp.getEmpdesgination(emp),deptcnt)->System.out.println(designation+"->"+deptcnt));
    }


}
