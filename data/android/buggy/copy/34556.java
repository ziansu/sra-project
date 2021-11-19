@java.lang.Override
public void start(long time) {
    competitors.get(curStart).start(time);
    (curStart)++;
}