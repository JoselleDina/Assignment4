package ac.za.cput.adp3;
import ac.za.cput.adp3.domain.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    Employee emp = new Employee() ;

    @Test
    public void Test1()
    {

        Assert.assertEquals(emp.getEmployee_firstName("Joselle"), emp.getEmployee_surname("Joselle"));
        System.out.println("Pass: Your are improving");

    }
    @Test
    public void Test2(){
        Assert.assertSame(emp.getEmployee_firstName("Dinana"), emp.getEmployee_surname("Dinana"));
        System.out.println("Pass: Bravo it is identical");

    }
    @Test
    public void Test3(){
        Assert.assertNotSame(emp.getEmployee_firstName("Dinana"), emp.getEmployee_surname("Niangui"));
        System.out.print("Pass: Beautiful");

    }

    @Test
    public void Test4(){
        Assert.fail("it fails");
        System.out.print("Pass: Beautiful");

    }

//    @Test
//    public void Test5(){
//        Assert.assertTimeout(Duration.ofMinutes(1), () -> {
//            return "result";
//        });
//        System.out.print("Pass: Beautiful");
//
//    }

}
