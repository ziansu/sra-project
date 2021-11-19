@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);
    initLogin();
    initRegister();
    getwreckt.cs2340.rattrack.model.UserList.addUser("user", getwreckt.cs2340.rattrack.model.CryptHash.hash("pass"));
}