package recruitment;

public class SystemService {

    public void publishVacancy() {
        System.out.println("Вакансия опубликована");
    }

    public void addEmployee(Candidate c) {
        System.out.println("Сотрудник добавлен: " + c.getName());
    }

    public void notifyIT() {
        System.out.println("IT уведомлен");
    }
}
