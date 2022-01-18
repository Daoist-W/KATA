public class App {
    public static void main(String[] args) {

        var server = new NotificationServer();
        var connection = server.connect("abcdef");
        var authToken = server.authenticate("appID", "key");
        Message message = new Message("Hello world");
        ;
        server.send(
                authToken,
                message,
                "target"
        );

        connection.disconnect();

        /*
         * The problem with the approach above is that every single time
         * we want to send a message, we have to manually code and do all
         * the above, which is a pain
         * */
    }

}
