public class AuthToken {
    // fields
    private String appID;
    private String key;

    public AuthToken(String appID, String key) {
        this.appID = appID;
        this.key = key;
    }

    public String getAppID() {
        return appID;
    }

    public String getKey() {
        return key;
    }
}
