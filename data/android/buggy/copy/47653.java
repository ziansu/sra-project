@java.lang.Override
public <T> void update(T t) {
    session.save(t);
}