
public class Main {

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иван Петрович Сидоров", 1, 25500);
        empl[1] = new Employee("Петр Сидорович Матвеев", 2, 31450);
        empl[2] = new Employee("Сидор Матвеевич Николаев", 3, 40200);
        empl[3] = new Employee("Матвей Николаевич Иванов", 4, 53000);
        empl[4] = new Employee("Николай Иванович Петров", 5, 64300);

        for (Employee e : empl) {
            System.out.println("Сотрудник:" + e);
        }
    }
         public static int getSalary(Employee[] employees){
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }

    }





