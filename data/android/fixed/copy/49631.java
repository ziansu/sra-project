@java.lang.Override
public boolean condition() throws java.lang.InterruptedException {
    return ((target) != null) && ((target.getHealthPercent()) > 0);
}