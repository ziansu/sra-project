@java.lang.Override
public void go() {
    if (e.isInTransaction())
        e.end();
    
    e.close();
}