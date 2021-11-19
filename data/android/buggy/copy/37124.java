@javax.annotation.Nullable
public static java.lang.String verifyDeclaredExceptions(java.lang.reflect.Executable executable, java.lang.Class<?>... allowedExceptionTypes) {
    return org.sosy_lab.common.Classes.verifyDeclaredExceptions(java.util.Arrays.asList(executable.getExceptionTypes()), allowedExceptionTypes);
}