package ac.za.cput.adp3;

import static org.junit.Assert.assertTrue;

import ac.za.cput.adp3.domain.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    List<Employee> empList = new ArrayList<>();
    List<Employee> empList1 = new ArrayList<>();
    Set<Employee> empSet = new HashSet<>();
    Set<Employee> empSet1 = new HashSet<>();
    Map empMap = new HashMap<>();
    Map empMap1 = new HashMap<>();

    @Before
    public void setUp() throws Exception {
       empList.add(new Employee(01, "joselle","dinana"));
       empList1.addAll(empList);
       empSet.addAll(empList);
       empSet1.addAll(empList1);
        empMap.putAll(new Employee(02, "josy", "dina"));
        empMap1.putAll(empMap);


    }

    @Test
    public void Test1() {

        Assert.assertEquals(empList, empList1);
    }

    @Test
    public void Test2() {
        Assert.assertEquals(empSet,empSet1);
    }

    @Test
    public void Test3() {
        Assert.assertEquals(empMap, empMap1);
    }
}
