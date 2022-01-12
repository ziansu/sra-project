@java.lang.Override
public void close() {
    if ((tx) != null) {
        cursor.close();
        tx.commit();
    }else {
        cursor.close();
    }
}