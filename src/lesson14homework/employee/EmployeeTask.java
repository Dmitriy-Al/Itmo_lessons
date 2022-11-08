package lesson14homework.employee;


import java.util.Collections;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {

        List<Employee> employeeList = Employee.employeeGenerator(50);

        // TODO 1: отсортировать список по имени
        // TODO 2: отсортировать список по имени и зп
        // TODO 3: отсортировать список по имени, зарплате, возрасту и компании

        System.out.println("Сортировка по имени: ");
        CompareName compareName = new CompareName();
        Collections.sort(employeeList, compareName);
        for (Employee e : employeeList) System.out.println("Name: " + e.getName());


        System.out.println("\n Сортировка по имени и зарплате: ");
        CompareSalary compareSalary = new CompareSalary();
        Collections.sort(employeeList, compareSalary);
        Collections.sort(employeeList, compareName);
        for (Employee e : employeeList) System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());

        System.out.println("\n Сортировка по имени, зарплате, возрасту и компании: ");
        CompareAge compareAge = new CompareAge();
        CompareCompany compareCompany = new CompareCompany();
        Collections.sort(employeeList, compareCompany);
        Collections.sort(employeeList, compareAge);
        Collections.sort(employeeList, compareSalary);
        Collections.sort(employeeList, compareName);
        for (Employee e : employeeList) {
            System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary() + ", Age: " + e.getAge() + ", Company: " + e.getCompany());
        }

    }
}


