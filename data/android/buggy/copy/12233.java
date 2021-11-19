@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.ParseObject.registerSubclass(com.example.cmput401.classdiscuss.Message.class);
    com.parse.Parse.initialize(this, com.example.cmput401.classdiscuss.ChatApplication.YOUR_APPLICATION_ID, com.example.cmput401.classdiscuss.ChatApplication.YOUR_CLIENT_KEY);
}