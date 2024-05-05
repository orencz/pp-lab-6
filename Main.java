import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Marek", 2500, 1);
        Worker worker2 = new Worker("Pawel", 3000, 2);
        Worker worker3 = new Worker("Maciek", 2800, 3);
        Worker worker4 = new Worker("Marcel", 3200, 4);
        Manager manager = new Manager("Antoni", 4000, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};
        for (Worker worker : workers) {
            System.out.println(worker.getName() + " zarabia " + worker.getSalary());
            worker.work();
        }

        System.out.println(manager.getName() + " zarabia " + manager.getSalary());
        manager.work();
    }
}
