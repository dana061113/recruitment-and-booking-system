package recruitment;

public class RecruitmentProcess {

    public static void main(String[] args) {

        DepartmentHead head = new DepartmentHead();
        HRManager hr = new HRManager();
        SystemService system = new SystemService();

        // 1. Создание заявки
        boolean isApproved = head.createVacancyRequest();

        if (!isApproved) {
            System.out.println("Заявка отклонена. Доработка...");
            return;
        }

        // 2. Публикация вакансии
        system.publishVacancy();

        // Параллельный процесс (условно)
        Candidate candidate = new Candidate("Dana");

        if (!hr.checkResume(candidate)) {
            System.out.println("Кандидат отклонен");
            return;
        }

        // 3. Интервью
        boolean hrInterview = hr.hrInterview(candidate);
        boolean techInterview = head.techInterview(candidate);

        if (hrInterview && techInterview) {
            System.out.println("Оффер отправлен");

            if (candidate.acceptOffer()) {
                system.addEmployee(candidate);
                system.notifyIT();
            }
        } else {
            System.out.println("Кандидат не прошел интервью");
        }
    }
}
