@java.lang.Override
public void set(T v) {
    if (!(isDone())) {
        this.v = v;
        super.set(v);
    }
}