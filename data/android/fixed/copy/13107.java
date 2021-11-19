@java.lang.Override
public boolean hasTypeVariables() {
    return ((this.bound) != null) && (this.bound.hasTypeVariables());
}