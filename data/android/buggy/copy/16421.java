@java.lang.Override
public void delete(T obj) {
    if (obj != null) {
        delete(helper.getId(obj));
    }
}