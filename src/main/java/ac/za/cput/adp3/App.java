package ac.za.cput.adp3;
import ac.za.cput.adp3.domain.Employee;

import java.util.*;
import java.util.LinkedHashMap;

import static java.util.stream.Collectors.toMap;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(01, "joselle", "dinana"));
        empList.add(new Employee(02, "josy", "dina"));
        empList.add(new Employee(03, "nelcia", "niangui"));

        for(int i = 0; empList.size() > i; i++)
        {
            System.out.println(empList.get(i));
        }

//        creating map with the help of collectors
        LinkedHashMap<Integer, String> map = empList.stream().collect(toMap(Employee::getEmployee_id,Employee::getEmployee_surname,(x, y) -> x + ","+ y, LinkedHashMap::new));
        map.forEach((x,y)->System.out.println(x +"=" + y));




    }
}
