@java.lang.Override
public void finish() {
    output.processLine(new org.unix4j.line.SimpleLine(java.lang.String.valueOf(counter.getCount())));
}