@java.lang.Override
public com.kenny.kellog.model.LogObject nextElement() {
    (index)++;
    com.kenny.kellog.model.LogObject log = null;
    if (hasMoreElements()) {
        log = logList.get(index);
    }
    return log;
}