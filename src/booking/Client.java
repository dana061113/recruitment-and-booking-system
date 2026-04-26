package booking;

public class Client {

    public boolean requestAvailability() {
        System.out.println("Клиент запрашивает площадку");
        return true;
    }

    public void leaveFeedback() {
        System.out.println("Клиент оставил отзыв");
    }
}
