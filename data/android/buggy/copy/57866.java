@java.lang.Override
public boolean matches(java.lang.Object argument) {
    if (!(argument instanceof edu.umd.cs.findbugs.ba.ClassContext)) {
        return false;
    }else {
        return ((edu.umd.cs.findbugs.ba.ClassContext) (argument)).getClassDescriptor().getSimpleName().equals(simpleClassName);
    }
}