package ac.za.cput.adp3.domain;

public class Employee  {
    private int employee_id;
    private String employee_firstName;
    private String employee_surname;

    public Employee(){
        this.employee_id=0;
        this.employee_surname= null;
        this.employee_firstName= null;

    }
    public Employee(int employee_id,String employee_firstName, String employee_surname){
        this.employee_firstName= employee_firstName;
        this.employee_surname=employee_surname;
        this.employee_id= employee_id;
    }
//    public int compareTo(Employee e)
//    {
//        return this.employee_id - e.employee_id;
//    }

    public void setEmployee_id(int employee_id){
        this.employee_id=employee_id;

    }
    public void setEmployee_firstName(String employee_firstName) {
        this.employee_firstName = employee_firstName;
    }

    public void setEmployee_surname(String employee_surname) {
        this.employee_surname = employee_surname;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getEmployee_firstName() {
        return employee_firstName;
    }

    public String getEmployee_surname( ) {
        return employee_surname;
    }

    @Override
    public String toString() {
        return
               "Employee details:"+"\n"+"ID Number:"+ getEmployee_id() +"\n"+" First Name:"+ getEmployee_firstName()+"\n" +"Surname:"+ getEmployee_surname() + '\t' ;

    }
}

