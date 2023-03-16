package pro.sky.java.course1.Coursework;

public  class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 1, 10000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 15000);
        employees[2] = new Employee("Александров Александр Александрович", 3, 20000);
        employees[3] = new Employee("Романов Роман Романович", 4, 25000);
        employees[4] = new Employee("Васильев Василий Васильевич", 5, 30000);
        employees[5] = new Employee("Антонов Антон Антонович", 1, 35000);
        employees[6] = new Employee("Максимов Максим Максимович", 2, 40000);
        employees[7] = new Employee("Ильин Илья Ильич", 3, 45000);
        employees[8] = new Employee("Федоров Федор Федорович", 4, 50000);
        employees[9] = new Employee("Степанов Степан Степанович", 5, 55000);


        System.out.println("Данные сотрудников:");
        printAllEmployees(employees);
        System.out.println("Сумма затрат на зарплаты в месяц " + allSalary(employees));
        System.out.println("Сотрудник с минимальной ЗП " + EmployeeMinSalary(employees));
        System.out.println("Сотрудник с максимальной ЗП " + EmployeeMaxSalary(employees));
        System.out.println("Cреднее значение зарплат " + averageSalary(employees));
        System.out.println("ФИО сотрудников:");
        printNameSurname(employees);

    }


    private static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }


    private static int allSalary(Employee[] employees) {
        int allSalarySum = 0;
        for (int i = 0; i < employees.length; ++i) {
            allSalarySum += employees[i].getSalary();
        }

        return allSalarySum;

    }


    private static Employee EmployeeMinSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i > employees.length; i++) {
            if (result.getSalary() < employees[i].getSalary()) ;
            result = employees[i];
        }
        return result;


    }

    private static Employee EmployeeMaxSalary(Employee[] employees) {
        Employee result = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (result.getSalary() < employees[i].getSalary()) ;
            result = employees[i];
        }
        return result;


    }

    private static double averageSalary(Employee[] employees) {
        double avSalary = 0;
        for (int i = 0; i < employees.length; i++) {
         avSalary+= employees[i].getSalary() / employees.length;
        }

        return  avSalary;
    }


private static void printNameSurname(Employee[] employees) {
    for (int i = 0; i < employees.length; i++) {
        System.out.println(employees[i].getFullName());
    }
}}


















































