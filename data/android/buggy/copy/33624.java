@java.lang.Override
public void free() throws java.sql.SQLException {
    if ((value) != null) {
        value = null;
    }
    if ((blob) != null) {
        blob.close();
    }
}