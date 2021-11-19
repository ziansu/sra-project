@java.lang.Override
public void run() {
    try {
        data = workWithDataBase.setNumberPhone(getNumberPhone());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}