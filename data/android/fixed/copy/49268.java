@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setBaseContent();
    getPermissions();
    com.example.kaveon14.workoutbuddy.DataBase.TableManagers.ProgressPhotosTable table = new com.example.kaveon14.workoutbuddy.DataBase.TableManagers.ProgressPhotosTable(getBaseContext());
}