public class NotificationService {
    // fields
    String serverIP;
    String appId;
    String key;

    public NotificationService(String serverIP, String appId, String key) {
        this.serverIP = serverIP;
        this.appId = appId;
        this.key = key;
    }

    public String getServerIP() {
        return serverIP;
    }

    public String getAppId() {
        return appId;
    }

    public String getKey() {
        return key;
    }

    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect(getServerIP());
        var authToken = server.authenticate(getAppId(), getKey());

        server.send(
                authToken,
                new Message(message),
                target
        );

        connection.disconnect();

        /*
         * The problem with the traditional approach above is that every single time
         * we want to send a messageObj, we have to manually code and do all
         * the above, which is a pain
         *
         * with this pattern, if any lower level classes changes, we have concentrated
         * the locations we need to change to just this location.
         * */
    }
}
