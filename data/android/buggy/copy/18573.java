@java.lang.Override
public boolean matches(java.lang.Object argument) {
    if (!(argument instanceof edu.umd.cs.findbugs.classfile.ClassDescriptor)) {
        return false;
    }else {
        return ((edu.umd.cs.findbugs.classfile.ClassDescriptor) (argument)).getSimpleName().equals(simpleClassName);
    }
}