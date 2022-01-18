public class App {
    public static void main(String[] args) {
        var messagingService = new NotificationService("123456", "Don", "key");
        messagingService.send("Hello world", "target");

    }

}
