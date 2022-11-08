package lesson14homework.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    // TODO: добавить конструктор, необходимы геттеры и сеттеры
    // TODO: дописать реализацию метода для создания списка из объектов класса Employee.
    //  Объекты Employee создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп.
    //  num - количество объектов в списке

    public Employee (String name, String company, int salary, int age) {
        setCompany(company);
        setSalary(salary);
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCompany(String company) {
        this.company = company;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

    private void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected String getCompany() {
        return company;
    }

    protected int getSalary() {
        return salary;
    }

    protected int getAge() {
        return age;
    }


    public static List<Employee> employeeGenerator(int num) {
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        ArrayList<Employee> employees = new ArrayList<>();
        // создание объектов, наполнение списка
        for (int i = 0; i < num; i++) {
            String name = names[(int) (Math.random() * 11)];
            String company = companies[(int) (Math.random() * 7)];
            int salary = (int) (Math.random() * 10000);
            int age = (int) (Math.random() * 100);
            if (age < 18 || age > 65) age = 25 + (int) (Math.random() * 10);
            employees.add(new Employee(name, company, salary, age));
        }
        return employees;
    }




}

class CompareName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompareAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}

class CompareSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() - o2.getSalary();
    }
}

class CompareCompany implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}


