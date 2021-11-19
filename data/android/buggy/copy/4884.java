@java.lang.Override
public boolean isDone() {
    boolean result = (getVotes().size()) == 1;
    java.lang.System.out.println(("Activity investigate " + result));
    return result;
}