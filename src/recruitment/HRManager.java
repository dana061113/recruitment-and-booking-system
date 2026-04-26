package recruitment;

public class HRManager {

    public boolean checkResume(Candidate c) {
        System.out.println("HR проверяет резюме " + c.getName());
        return true;
    }

    public boolean hrInterview(Candidate c) {
        System.out.println("HR интервью с " + c.getName());
        return true;
    }
}
