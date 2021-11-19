@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    com.parse.Parse.initialize(this, "FjnQ7hWVa83BIknGsWTu1Hh0NuQFHbzIpAgMmggK", "i1tHxKksviI1V7kbxsnMN2y3x0AX5DrtUEG5YTow");
    super.onCreate(savedInstanceState);
    initDB();
    getExtras();
    updateHighscore();
    setupUI();
}