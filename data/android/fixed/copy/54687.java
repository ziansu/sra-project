@java.lang.Override
public boolean setState(int[] stateSet) {
    if (stateSet == null)
        return false;
    
    boolean changed = super.setState(stateSet);
    changed = (updateTintColor(stateSet)) || changed;
    return changed;
}