package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
    String name;
    int age;

    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
        }




public class Demo1 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Employee("Scott",20));
        emp.add(new Employee("David",30));
        emp.add(new Employee("Smith",45));
        emp.add(new Employee("Shreya",25));
        emp.add(new Employee("Scot",42));
        emp.add(new Employee("Shah",24));

        //List emp1 = emp.stream().map(n->n.name).filter(n->n.age>20).collect(Collectors.toList());
//        List emp2 = emp.stream().filter(n->n.age>20).map(n->n.name).collect(Collectors.toList());
//        System.out.println(emp2);
        emp.stream().filter(n->n.age>20).map(n->n.name).forEach(System.out::println);
     long count = emp.stream().filter(e->e.age>35).count();
        System.out.println(count);

 emp.stream().map(m->m.name.startsWith("S")).forEach(System.out::println);


    }
}