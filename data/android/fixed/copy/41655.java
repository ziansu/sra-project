@java.lang.Override
public boolean isBefore(A action, A endAction) {
    return (actions.indexOf(action)) <= (actions.indexOf(endAction));
}