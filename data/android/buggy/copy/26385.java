@java.lang.Override
public boolean constrained(T t) throws java.lang.InterruptedException {
    if (constrained()) {
        return false;
    }else {
        constrained.put(t);
        return true;
    }
}