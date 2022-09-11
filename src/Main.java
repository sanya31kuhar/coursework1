
public class Main {
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Иван Петрович Сидоров", 1, 25500);
        EMPLOYEES[1] = new Employee("Петр Сидорович Матвеев", 2, 31450);
        EMPLOYEES[2] = new Employee("Сидор Матвеевич Николаев", 3, 40200);
        EMPLOYEES[3] = new Employee("Матвей Николаевич Иванов", 4, 53000);
        EMPLOYEES[4] = new Employee("Николай Иванович Петров", 5, 64300);
        EMPLOYEES[5] = new Employee("Иван Петрович Иванов", 1, 27500);
        EMPLOYEES[6] = new Employee("Петр Сидорович Петров", 2, 36450);
        EMPLOYEES[7] = new Employee("Сидор Матвеевич Сидоров", 3, 43200);
        EMPLOYEES[8] = new Employee("Матвей Николаевич Матвеев", 4, 58100);
        EMPLOYEES[9] = new Employee("Николай Иванович Николаев", 5, 65500);
        for (Employee e : EMPLOYEES) {
            System.out.println("Сотрудник:" + e);
        }
    }

    private static void printEmployees() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int calculateSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += sum + EMPLOYEES[0].getSalary();
        }
        return sum;
    }

    private static void minimumSalaryOfAnEmployee() {
        Employee result = EMPLOYEES[0];
        int minSalary = EMPLOYEES[0].getSalary();

        for (Employee employee : EMPLOYEES) {

            if (employee.getSalary() < minSalary) ;
            {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
    }

    private static void maximumSalaryOfAnEmployee() {
        Employee result = EMPLOYEES[0];
        int maxSalary = EMPLOYEES[0].getSalary();

        for (Employee employee : EMPLOYEES) {

            if (employee.getSalary() > maxSalary) ;
            {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
    }

    private static float calculateAverageSalary() {
        return calculateSalary() / (float) EMPLOYEES.length;
    }

    private static void printAllFio() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFio());
        }
    }
}



