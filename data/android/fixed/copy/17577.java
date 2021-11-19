@java.lang.Override
public int getCurrentTier() {
    return (2 * (index)) < (demand.length) ? ((int) (demand[(2 * (index))])) : -1;
}