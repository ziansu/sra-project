@java.lang.Override
public boolean isDone() {
    return ((taken) > (duration)) && (action.isDone());
}