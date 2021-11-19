@java.lang.Override
public <S extends T> S update(S s) {
    db().update(s);
    return s;
}