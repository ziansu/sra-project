@java.lang.Override
public java.util.Iterator<java.lang.String> call(java.lang.String s) {
    return java.util.Arrays.asList(s.split("\\s+")).iterator();
}