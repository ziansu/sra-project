@java.lang.Override
public <S extends T> S save(S s) {
    db().save(s);
    return s;
}