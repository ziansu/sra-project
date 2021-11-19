@java.lang.Override
public void run() {
    if (!(closed.get())) {
        commit();
    }
}