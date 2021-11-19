@java.lang.Override
@com.peterphi.std.guice.database.annotation.Transactional
public void merge(T obj) {
    getWriteSession().merge(obj);
}