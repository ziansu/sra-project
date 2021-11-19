@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.example.willardpc.riter.DBOpenHelper helper = new com.example.willardpc.riter.DBOpenHelper(this);
    android.database.sqlite.SQLiteDatabase database = helper.getWritableDatabase();
}