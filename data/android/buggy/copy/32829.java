@java.lang.Override
public boolean isDone() {
    if ((innerFuture) != null) {
        return innerFuture.isDone();
    }
    isDone = true;
    return isDone;
}