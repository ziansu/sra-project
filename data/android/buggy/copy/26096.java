@java.lang.Override
public boolean isNotStr() {
    checkNotPolymorphicOrUnknown();
    return (((flags) & (dk.brics.tajs.lattice.Value.STR)) == 0) && ((str) == null);
}