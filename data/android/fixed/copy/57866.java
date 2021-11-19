@java.lang.Override
public boolean matches(edu.umd.cs.findbugs.ba.ClassContext argument) {
    return argument.getClassDescriptor().getSimpleName().equals(simpleClassName);
}