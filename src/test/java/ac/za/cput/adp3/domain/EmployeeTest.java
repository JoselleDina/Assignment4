package ac.za.cput.adp3.domain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class EmployeeTest {
    Employee emp ;
    Employee emp1;
    @Before
    public void setUp() throws Exception {
        emp = new Employee(01, "Joselle","Dinana");
        emp1=emp;
    }
//Testing Object Equality.
    @Test
    public void Test1() {
        Assert.assertEquals(emp1.getEmployee_id(), 01);
        System.out.print("Bravo Beautiful");

    }
//Testing Object Identity.
    @Test
    public void Test2() {
        Assert.assertSame(emp.getEmployee_firstName(), "Joselle");
        System.out.print("Bravo Beautiful");
    }
// Testing failing
    @Test
    public void Test3() {
        fail(emp.getEmployee_surname());

       // Assert.assertNotEquals(emp.getEmployee_surname(), "Dinana");
    }

// Testing Timeout
    @Test(timeout =2000)
    public void test4() {
        try {
            TimeUnit.SECONDS.sleep(1);
            Assert.assertSame(emp.getEmployee_firstName(), "Joselle");
            System.out.println("Lovely");
       } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
//Disabling testing
    @Ignore
    @Test
    public void test5() {
        Assert.assertSame(emp.getEmployee_firstName(), "Joselle");
        System.out.print("Bravo Beautiful");
    }
}