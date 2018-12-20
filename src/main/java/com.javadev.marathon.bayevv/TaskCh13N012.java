package com.javadev.marathon.bayevv;

import java.time.LocalDate;
import java.util.ArrayList;

public class TaskCh13N012 {
    public static void main(String[] args) {
        Employee john = new Employee("Баев", "Иван", "Алексеевич", "Проспект Ленина 27", LocalDate.of(1990, 5, 10));
        Employee misha = new Employee("Алексеев", "Михаил", "Иванович", "Улица Дачная 41", LocalDate.of(2000, 3, 24));
        Employee alex = new Employee("Баев", "Алексей", "Алексеевич", "Улица Московская 34", LocalDate.of(2017, 5, 2));
        Employee victor = new Employee("Баев", "Виктор", "Улица Советская 34", LocalDate.of(2003, 1, 15));
        outEmployees(Database.findEmployeeWorkMore(4));
        outEmployees(Database.findByString("АЛЕК"));
    }

    private static void outEmployees(ArrayList<Employee> array) {
        for (Employee employee : array) {
            System.out.println(employee.getAllInformation());
        }
        System.out.println();
    }
}

class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private LocalDate enteredCompany;

    Employee(String surname, String name, String address, LocalDate dateEnter) {
        this.surname = surname;
        this.name = name;
        this.address = address;
        enteredCompany = dateEnter;
        Database.addEmployee(this);
    }

    Employee(String surname, String name, String patronymic, String address, LocalDate dateEnter) {
        this(surname, name, address, dateEnter);
        this.patronymic = patronymic;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateEnterCompany() {
        return enteredCompany;
    }

    public String getAllInformation() {
        return "Surname: " + getSurname() +
                " Name: " + getName() +
                " Patronymic: " + getPatronymic() +
                " Address: " + getAddress() +
                " Entered company:" + getDateEnterCompany();
    }

    public int countWorkYear() {
        LocalDate today = LocalDate.now();
        if (today.getMonthValue() < enteredCompany.getMonthValue()) {
            return today.getYear() - 1 - enteredCompany.getYear();
        }
        return today.getYear() - enteredCompany.getYear();
    }
}

class Database {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static ArrayList findEmployeeWorkMore(int years) {
        ArrayList<Employee> sortedEmployees = new ArrayList<>();
        for (int line = 0; line < employees.size(); line++) {
            if (employees.get(line).countWorkYear() > years) {
                sortedEmployees.add(employees.get(line));
            }
        }
        return sortedEmployees;
    }

    public static ArrayList findByString(String str) {
        ArrayList sortedEmployees = new ArrayList();
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (haveStringPart(str, employee.getName())
                    || haveStringPart(str, employee.getSurname())
                    || haveStringPart(str, employee.getPatronymic())) {
                sortedEmployees.add(employee);
            }
        }
        return sortedEmployees;
    }

    public static void addEmployee(Employee e) {
        employees.add(e);
    }

    public static void printEmployeesInfo() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getAllInformation());
        }
        System.out.println();
    }

    public static boolean haveStringPart(String part, String string) {
        int j = 0;
        for (int i = 0; i < string.length() && j < part.length(); i++) {
            if (part.charAt(j) == string.charAt(i) ||
                    part.charAt(j) + 32 == string.charAt(i) ||
                    part.charAt(j) == string.charAt(i) + 32) {
                j++;
            } else {
                j = 0;
            }
        }
        return j == part.length();
    }
}