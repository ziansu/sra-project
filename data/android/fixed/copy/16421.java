@java.lang.Override
public void delete(T obj) {
    delete(helper.getId(obj));
}