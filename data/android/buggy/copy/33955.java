public static void main(java.lang.String[] args) throws java.lang.Exception {
    application.MySQLAccess sql = new application.MySQLAccess();
    sql.readDataBase("ovelse");
    javafx.application.Application.launch(args);
}