@java.lang.Override
public synchronized int getInteger(java.lang.String key, int def) {
    if ("edit.initial-move-delay".equals(key)) {
        return 0;
    }else {
        return super.getInteger(key, def);
    }
}