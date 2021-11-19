@java.lang.Override
public double nextMetricIncrement() {
    this.current = (current) + (increment);
    return current;
}