import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        Worker worker1 = new Worker("Marek", 5500, 1, "21-01-2023", "Spawacz");
        Worker worker2 = new Worker("Pawel", 4000, 2, "23-03-2023", "Lakiernik");
        Worker worker3 = new Worker("Maciek", 3500, 3, "15-04-2023", "Recepcjonista");
        Worker worker4 = new Worker("Marcel", 4900, 4, "19-05-2023", "Detailer");
        Manager manager1 = new Manager("Antoni", 7000, 5, "25-03-2022", "Manager");
        Worker worker5 = new Worker("Dominik", 4500, 3, "19-07-2022", "Magazynier"); 
        Worker worker6 = new Worker("Marysia", 3100, 3, "12-07-2022", "Sprzataczka"); 
        Manager manager2 = new Manager("Kuba", 6500, 5, "09-08-2023", "Project Manager"); 
        Manager manager3 = new Manager("Janusz", 11000, 5, "29-09-2020", "Head Manager"); 

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager1);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        Map<Integer, List<String>> idMap = new HashMap<>();

        for (Employee employee : employees) {
           
            totalSalary += employee.getSalary();

            
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }

           
            idMap.computeIfAbsent(employee.getId(), k -> new ArrayList<>()).add(employee.getName());
        }

        
        System.out.println("Laczna wyplata: " + totalSalary);
        System.out.println("Laczna wyplata dla menadzerow: " + totalManagerSalary);
        System.out.println("Laczna wyplata dla pracownikow: " + totalWorkerSalary);

        
        System.out.println("Przypadki zdublowanmego ID:");
        idMap.forEach((id, names) -> {
            if (names.size() > 1) {
                System.out.println("ID " + id + " pojawia sie dla: " + names);
            }
        });
    }
}
