package Study11;

import java.util.*;

public class MapExercise {
    public static void main(String[] args) {
        Map e = new HashMap();
        Employee01 emp1 = new Employee01("小王", 12000, 10001);
        Employee01 emp2 = new Employee01("小刘", 23000, 10002);
        Employee01 emp3 = new Employee01("小赵", 80000, 10003);

        e.put(emp1.getId(),emp1);
        e.put(emp2.getId(),emp2);
        e.put(emp3.getId(),emp3);

        Set keySet = e.keySet();
        for (Object o :keySet) {
            Employee01 emp = (Employee01)e.get(o);
            if(emp.getSalary()>18000){
                System.out.println(emp.toString());
            }
        }

        Set set = e.entrySet();
        for (Object o :set) {
            Map.Entry E1 = (Map.Entry)o;
        }


    }
}

class Employee01{
    private String name;
    private double salary;
    private int id;

    public Employee01(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee01{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee01 that = (Employee01) o;
        return Double.compare(that.salary, salary) == 0 &&
                id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }
}