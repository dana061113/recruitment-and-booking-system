package booking;

public class BookingSystem {

    public static void main(String[] args) {

        Client client = new Client();
        PaymentGateway payment = new PaymentGateway();
        VenueAdmin admin = new VenueAdmin();

        // 1. Проверка доступности
        if (!client.requestAvailability()) {
            System.out.println("Нет доступных дат");
            return;
        }

        // 2. Подтверждение
        if (payment.processPayment()) {
            System.out.println("Бронирование подтверждено");

            admin.prepareEvent();

            Contractor c1 = new Contractor("Decorator");
            Contractor c2 = new Contractor("Catering");

            // Параллельные действия
            c1.performTask();
            c2.performTask();

            admin.receiveReport();

            client.leaveFeedback();

        } else {
            System.out.println("Платеж отклонен");
        }
    }
}
