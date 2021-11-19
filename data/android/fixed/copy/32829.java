@java.lang.Override
public boolean isDone() {
    if ((innerFuture) != null) {
        return innerFuture.isDone();
    }
    return isDone;
}