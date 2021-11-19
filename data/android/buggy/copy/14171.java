@java.lang.Override
public void run() {
    java.lang.String id = "" + position;
    com.example.setup.finalproject.DBQueries.deleteRow(fragment.db, id);
}