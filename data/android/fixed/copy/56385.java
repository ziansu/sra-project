@java.lang.Override
public void set(T value) {
    this.value = value;
    this.error = null;
    initialized = true;
}