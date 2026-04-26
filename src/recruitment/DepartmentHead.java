package recruitment;

public class DepartmentHead {

    public boolean createVacancyRequest() {
        System.out.println("Создание заявки на вакансию");
        return true;
    }

    public boolean techInterview(Candidate c) {
        System.out.println("Техническое интервью с " + c.getName());
        return true;
    }
}
