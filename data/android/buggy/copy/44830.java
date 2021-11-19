public boolean isSame(com.orientechnologies.orient.core.record.impl.ODirtyManager other) {
    other = other.getReal();
    if ((overrider) != null)
        return overrider.isSame(other);
    
    return (this) == other;
}