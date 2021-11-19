@java.lang.Override
public java.lang.Integer poll() {
    long i = (index)++;
    if (i == (end)) {
        return null;
    }
    return ((int) (i));
}