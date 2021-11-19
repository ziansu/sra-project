@java.lang.Override
public boolean isNotStr() {
    checkNotPolymorphicOrUnknown();
    return (str) == null;
}