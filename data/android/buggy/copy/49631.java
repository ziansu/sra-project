@java.lang.Override
public boolean condition() throws java.lang.InterruptedException {
    return (target.exists()) && ((target.getHealthPercent()) > 0);
}