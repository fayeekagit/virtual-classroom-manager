public class ObserverPatternDemo {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        EmailClient emailClient = new EmailClient();
        notificationService.addObserver(emailClient);
        notificationService.setMessage("New Email Received!");
    }
}
