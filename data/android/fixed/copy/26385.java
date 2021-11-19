@java.lang.Override
public boolean constrained(T t) throws java.lang.InterruptedException {
    if (constrained()) {
        constrained.put(t);
        return true;
    }else {
        return false;
    }
}