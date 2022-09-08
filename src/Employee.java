
public class Employee {

    private String fio;
    private int unit;
    private int salary;
    private static int counter;
    private int id;

    public int getId() {
        return this.id;
    }
    public String getFio() {
        return this.fio;
    }
    public int getUnit() {
        return this.unit;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setUnit(int unit) {
        this.unit = unit;
    }
    public void setSalary(int sal) {
        this.salary = sal;
    }
    public Employee(String fio, int unit, int salary) {
        this.fio = fio;
        this.unit = unit;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public String toString() {

        return " Id " + id + " ФИО: " + fio + " Отдел: " + unit + " Зарплата : " + salary;
    }

}





















