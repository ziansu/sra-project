@java.lang.Override
public T findEquals(T t) {
    for (T tItem : be.lode.general.repository.Repository.getList()) {
        if (t.equals(tItem))
            return tItem;
        
    }
    return null;
}