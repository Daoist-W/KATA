public class NotificationServer {
    /*
     * These are the series of steps that we need to follow
     * in order to send a notification
     *
     */

    // first we need to connect to the server
    // Connection conn = connect() -> Connection
    // this will return a connection object that we will later
    // use to disconnect from the server.

    public Connection connect(String ipAddress) {
        System.out.println("Connected \n");
        return new Connection();
    }

    // next we need to authenticate, some sort of identifier
    // a string that is unique to each app, we should also
    // provide a key/password for each app
    // authenticate(appID, key) -> AuthToken
    // this will return an authentication token object
    // this token MUST be passed when sending a message
    public AuthToken authenticate(String appID, String key) {
        return new AuthToken(appID, key);
    }

    // Then we need another method to actually send the message and token
    // along with an identifier for the target destination/device/user
    // send(authToken, message, target)
    public void send(AuthToken authToken, Message message, String target) {
        System.out.printf("%s: \n %s \n\n", authToken.getAppID(), message.getContent());
    }

    // finally when we are done, we need to disconnect so we call
    // conn.disconnect()

}
