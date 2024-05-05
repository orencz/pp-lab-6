import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marek", 5500, 1, "21-01-2023", "Spawacz");
        Worker worker2 = new Worker("Pawel", 4000, 2, "23-03-2023", "Lakiernik");
        Worker worker3 = new Worker("Maciek", 3500, 3, "15-04-2023", "Recepcjonista");
        Worker worker4 = new Worker("Marcel", 4900, 4, "19-05-2023", "Detailer");
        Manager manager = new Manager("Antoni", 7000, 5, "25-03-2022", "Manager");

        Employee[] employees = {worker1, worker2, worker3, worker4, manager}; 

        
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        
        System.out.println("Test id " + worker2.getName() + " z innymi pracownikami:");
        for (Employee employee : employees) {
            boolean isEqual = worker2.equals(employee);
            System.out.println(worker2.getName() + " rowna sie " + employee.getName() + ": " + isEqual);
        }
    }
}