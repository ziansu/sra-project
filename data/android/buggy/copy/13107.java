@java.lang.Override
public boolean hasTypeVariables() {
    return (this.bound) == null ? false : this.bound.hasTypeVariables();
}