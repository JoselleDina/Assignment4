package ac.za.cput.adp3;
import ac.za.cput.adp3.domain.Employee;

import java.util.*;

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












    }
}
