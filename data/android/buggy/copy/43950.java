@java.lang.Override
public synchronized int getInteger(java.lang.String key, int def) {
    if (key == "edit.initial-move-delay") {
        return 0;
    }else {
        return super.getInteger(key, def);
    }
}