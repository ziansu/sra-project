@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    db = new examhelper.dbHelper();
    db.connectToDB();
    java.util.ArrayList<java.lang.String> list = db.getSubjects();
    populateCombo();
    java.lang.System.out.println("here2");
}