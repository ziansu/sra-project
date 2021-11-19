@java.lang.Override
public boolean setState(int[] stateSet) {
    boolean changed = super.setState(stateSet);
    changed = (updateTintColor(stateSet)) || changed;
    return changed;
}