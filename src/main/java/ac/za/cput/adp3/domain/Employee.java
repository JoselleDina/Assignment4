package ac.za.cput.adp3.domain;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Employee implements Map {
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
               "ID Number:"+ getEmployee_id() +"\t"+" First Name:"+ getEmployee_firstName()+"\t" +"Surname:"+ getEmployee_surname() + '\n' ;

    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object o) {
        return false;
    }

    @Override
    public boolean containsValue(Object o) {
        return false;
    }

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public Object put(Object o, Object o2) {
        return null;
    }

    @Override
    public Object remove(Object o) {
        return null;
    }

    @Override
    public void putAll(Map map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}

