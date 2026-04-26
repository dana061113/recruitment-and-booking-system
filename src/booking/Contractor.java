package booking;

public class Contractor {

    private String role;

    public Contractor(String role) {
        this.role = role;
    }

    public void performTask() {
        System.out.println(role + " выполняет задачу");
    }
}
