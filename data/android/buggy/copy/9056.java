@java.lang.Override
public void updateFilescnt(long bno) {
    session.update(((namespace) + ".updateFilescnt"), bno);
}